# prerequisites: requires python 3.x (or higher)
# open anaconda prompt
# browse to this directory
# install pyexcel with:
# python -m pip install pyexcel
# python -m pip install pyexcel-xlsx
# python -m pip install pyexcel-ods3

# run this script with:
# python convertOds.py
import pyexcel
import glob
import os
import shutil
import subprocess




def convert_to_xlxs():
    os.chdir(".")
    for file in glob.glob("../*.ods"):
        #for sheet in file:
         #   print(sheet)
        #sheet = pyexcel.get_sheet(file_name = file)
        sheet = pyexcel.get_sheet(file_name = file,sheet_name = "Course")
        sheet += pyexcel.get_sheet(file_name = file,sheet_name = "Lectures")
        sheet += pyexcel.get_sheet(file_name = file,sheet_name = "Assignments")
        sheet += pyexcel.get_sheet(file_name = file,sheet_name = "OldExams")
        sheet += pyexcel.get_sheet(file_name = file,sheet_name = "Exercises")
        sheet += pyexcel.get_sheet(file_name = file,sheet_name = "StudyMaterial")
        sheet += pyexcel.get_sheet(file_name = file,sheet_name = "Exam")

        #print(sheet)
        sheet.save_as(file + '.xlsx')

def run_excel_module_from_python(excel_name):
    import os, os.path
    import win32com.client

    if os.path.exists(excel_name+""):
        xl=win32com.client.Dispatch("Excel.Application")
        xl.Workbooks.Open(os.path.abspath(excel_name+""), ReadOnly=1)
        xl.Application.Run(excel_name+"!Module1.main")
        ##    xl.Application.Save() # if you want to save then uncomment this line and change delete the ", ReadOnly=1" part from the open function.
        xl.Application.Quit() # Comment this out if your excel script closes
        del xl

def create_latex_exam_solution_templates(excel_name):
    import os, os.path
    import win32com.client

    if os.path.exists(excel_name+""):
        xl=win32com.client.Dispatch("Excel.Application")
        xl.Workbooks.Open(os.path.abspath(excel_name+""), ReadOnly=1)
        xl.Application.Run(excel_name+"!Module2.createExamSolutionTemplates")
        ##    xl.Application.Save() # if you want to save then uncomment this line and change delete the ", ReadOnly=1" part from the open function.
        xl.Application.Quit() # Comment this out if your excel script closes
        del xl

# Deletes the generated .ods.xlsx file
def cleanup():
    temp_xlsx_relative_filepath = "../PlanningData-Form-Temp.ods.xlsx"
    temp_ods_to_xlsx = "../PlanningData-Form.xlsx"
    if os.path.exists(temp_xlsx_relative_filepath):
        delete_file(temp_xlsx_relative_filepath)
    
    if os.path.exists(temp_ods_to_xlsx):
        delete_file(temp_ods_to_xlsx)
        
            
def delete_file(path):
    try:
        os.remove(path)
    except OSError:
        print(f'Could not delete{path}. Perhaps because it was in use. You can delete it manually to clean up.')

def delete_folder(path):
    try:
        shutil.rmtree(path)
    except OSError:
        print(f'Could not delete{path}. Perhaps because it was in use. You can delete it manually to clean up.')

        
# To prevent user from filling in xlsx instead of .ods the xls is moved in this folder, but it (currently) is still needed in parent directory
# so this method exports it to parent directory before code is started
def move_ods_to_excel_out():
    shutil.copy("ods_to_excel_source.xlsx", "../PlanningData-Form.xlsx")
 
# deletes old exam solution templates from other courses/past runs
def remove_old_solution_templates(solution_type):
    keep = "Technical Latex Examples"
    
    if (os.path.exists(f'../../yourTemplates/{solution_type}/')):
        delete_folder(f'../../yourTemplates/{solution_type}/')
        print(f'deleting=../../yourTemplates/{solution_type}/')

def remove_old_local_solution_templates(solution_type):
    keep = "Technical Latex Examples"
    
    if (os.path.exists(f'{solution_type}/')):
        for dirs in os.listdir(f'{solution_type}/'):
            if os.path.isdir(f'{solution_type}/{dirs}/'):
                if not dirs==keep:
                    delete_folder(f'{solution_type}/{dirs}/')

def export_templates(solution_type):
    if (os.path.exists(f'{solution_type}/')):
        shutil.move(f'{solution_type}/', f'../../yourTemplates/')
    
# define the main computation xlsm    
excel_name = "doPlannings.xlsm"

# temporarily move the .xlsx file for planning out    
move_ods_to_excel_out()

# remove unneeded old exam solution templates
remove_old_solution_templates("ExamSolutions")
remove_old_solution_templates("individualAssignmentSolutions")
remove_old_solution_templates("groupAssignmentSolutions")
remove_old_solution_templates("groupExerciseSolutions")
remove_old_solution_templates("groupLectureSummaries")

# Remove unneeded old solution templates in this directory
remove_old_local_solution_templates("ExamSolutions")
remove_old_local_solution_templates("individualAssignmentSolutions")
remove_old_local_solution_templates("groupAssignmentSolutions")
remove_old_local_solution_templates("groupExerciseSolutions")
remove_old_local_solution_templates("groupLectureSummaries")


convert_to_xlxs()
print("Converted .ods to .xlxs in parentfolder.")
run_excel_module_from_python(excel_name)
print("Completed generation of task csvs.")
create_latex_exam_solution_templates(excel_name)
print("Completed evaluation of excel subroutine")
subprocess.call("cscript CsvTasks/readCSV.vbs") # works
print("Created taskwarrior commands.")
cleanup()
print("Cleaned up temporary files")


# Export latex templates to parent directory
export_templates("ExamSolutions")
export_templates("individualAssignmentSolutions")
export_templates("groupAssignmentSolutions")
export_templates("groupExerciseSolutions")
export_templates("groupLectureSummaries")

print("Your latex exam solution templates are now located in: ../../ExamSolutions/")
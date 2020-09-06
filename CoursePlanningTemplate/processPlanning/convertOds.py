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
import subprocess
excel_name = "doPlannings.xlsm"

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
    if os.path.exists(temp_xlsx_relative_filepath):
        try:
            os.remove(temp_xlsx_relative_filepath)
        except OSError:
            print(f'Could not delete{temp_xlsx_relative_filepath}. Perhaps because it was in use. You can delete it manually to clean up.')
        

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
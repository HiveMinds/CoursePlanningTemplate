Dim objShell
Set objShell = Wscript.CreateObject("WScript.Shell")

'objShell.Run "/CsvTasks/readCSV.vbs" 
'objShell.Run "CsvTasks/readCSV.vbs" 
objShell.Run """E:\18-09-19 Document structure\personal\Automation and Systems\Latex\PlanningTemplate/CsvTasks/readCSV.vbs\"""
' Using Set is mandatory
Set objShell = Nothing

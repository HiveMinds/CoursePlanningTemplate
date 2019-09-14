' This script assumes the following columns in the .csv file:
' Nr.,Cal,tw,Topic,Available,Due,Source due,Weight,Source weight 

projectSubCode="uni.SatOrbDet."

dim fs,objTextFile
set fs=CreateObject("Scripting.FileSystemObject")
dim arrStr
' set objTextFile = fs.OpenTextFile("Tasks.csv")
set objTextFile = fs.OpenTextFile("CsvTasks/Tasks.csv")

' Create a collection that contains the lines
Set lines = CreateObject("System.Collections.ArrayList")

' read the lines from the file
Do while NOT objTextFile.AtEndOfStream
  arrStr = split(objTextFile.ReadLine,",")
  lines.add(arrStr)
'  arrStr is now an array of the line with in each element a comma separated value.
Loop

' generate task add commands
Set commands = CreateObject("System.Collections.ArrayList")
For i = 0 To lines.count -1
    commands.add("task add due:"+lines.Item(i)(5)+" proj:"+projectSubCode+getProjWeek(lines.Item(i)(0))+" make "+lines.Item(i)(0)+lines.Item(i)(3)+" Weight:"+lines.Item(i)(7))
Next

'Write commands to txt file
writeTaskwarriorCommands(commands)

objTextFile.Close
set objTextFile = Nothing
set fs = Nothing

' Get the week number so that it can be added to the end of the project
Function getProjWeek(weekNr)
  Dim returning
  If Left(weekNr,1) = "W" Then
      returning = Left(weekNr,2)
  End If
  getProjWeek = returning  'Returning the result to the function name itself
End Function

' writes the commands so you can can instantly copy paste them to Taskwarrior
Function writeTaskwarriorCommands(commands)
  Set objFSO = CreateObject("Scripting.FileSystemObject")
  
  SourceFile = objFSO.GetParentFolderName(WScript.ScriptFullName) & "\taskwarriorCommands.txt"
  ' Content = "(Over)write a file so that it contains a string." & vbCrLf &_
      ' "The reverse of Read entire file—for when you want to update or create a file which you would read in its entirety all at once."
  
  With objFSO.OpenTextFile(SourceFile,2,True,0)
    For i = 0 To commands.count -1
      .Write commands.Item(i) & vbCrLf
    Next
    .Close
  End With
  
  Set objFSO = Nothing
End Function
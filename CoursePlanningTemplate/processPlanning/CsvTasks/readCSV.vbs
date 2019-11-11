' This script assumes the following columns in the .csv file:
' Nr.,Cal,tw,Topic,Available,Due,Source due,Weight,Source weight 



' Get the path of the current (executing) script
scriptDir = CreateObject("Scripting.FileSystemObject").GetParentFolderName(WScript.ScriptFullName)
'msgbox(scriptDir)

' initialise parameters
twProjectCodeFileName="twProjFileName.txt"
twProjectCode=getTwProjCode(scriptDir,twProjectCodeFileName)


' get file list array
Set fileList = listFiles(scriptDir)
Set commandArrays = convertCsvToCommandArrays(scriptDir)
call writeTaskwarriorCommands(commandArrays, scriptDir)

' read the code for the taskwarrior project form a file
Function getTwProjCode(scriptDir,twProjCodeFileName)
dim fs,objTextFile
	set fs=CreateObject("Scripting.FileSystemObject")
	dim arrStr
	set objTextFile = fs.OpenTextFile(scriptDir+"/"+twProjCodeFileName)

	' Create a collection that contains the lines
	Set lines = CreateObject("System.Collections.ArrayList")

	' read the lines from the file
	Do while NOT objTextFile.AtEndOfStream
		getTwProjCode =objTextFile.ReadLine
	Loop
End Function

' Loop through the files in this directory and convert the .csv to taskwarrior commands
Function convertCsvToCommandArrays(scriptDir)
	Set summedCommands = CreateObject("System.Collections.ArrayList")
	For i = 0 To fileList.count -1
		If (i=0) Then
			Set commands = createCsvFiles(fileList(i),scriptDir)
			summedCommands.add(commands)
		Else
			set commands = (createCsvFiles(fileList(i),scriptDir))
			If commands.count >0 Then
				summedCommands.add(commands)
			End If
			'msgbox("Command length after="+cstr(summedCommands.count))
		End If
	Next
	Set convertCsvToCommandArrays = summedCommands
End Function 

' list the .csv files in this directory
Function listFiles(sFolder)
  On Error Resume Next
  Set fileList = CreateObject("System.Collections.ArrayList")
  Dim fso, folder, files, NewsFile
  Set fso = CreateObject("Scripting.FileSystemObject")
  If sFolder = "" Then
      Wscript.Echo "No Folder parameter was passed"
      Wscript.Quit
  End If
  Set folder = fso.GetFolder(sFolder)
  Set files = folder.Files
  
  For each folderIdx In files
	If (Right(folderIdx.Name,4) = ".csv") Then
		fileList.add(folderIdx.Name)
	End If
  Next
  Set listFiles = fileList
End Function

' Convert csv file to taskwarrior commands and export them
Function createCsvFiles(filename,scriptDir)
	dim fs,objTextFile
	set fs=CreateObject("Scripting.FileSystemObject")
	dim arrStr
	' set objTextFile = fs.OpenTextFile("Tasks.csv")
	set objTextFile = fs.OpenTextFile(scriptDir+"/"+filename)

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
	
	' switch to different task commands for different data types
	'msgbox(fileName)
	Select case fileName
		case "assignments.csv"
			'msgbox("found case for assignments.csv")
			For i = 0 To lines.count -1
				commands.add("task add due:"+lines.Item(i)(5)+" proj:"+twProjectCode+".as."+getProjWeek(lines.Item(i)(0))+" make "+lines.Item(i)(0)+lines.Item(i)(3)+" Weight:"+lines.Item(i)(7)+" priority:H")
			
			Next
		case "oldExams.csv"
			For i = 0 To lines.count -1
				'Source	Nr	Date	Nr of Exercises	Exerc. Id	Weight	Topic	Lect. Topic	Due
				'0		1	2		3				4			5		6		7	  	 	8
				commands.add("task add due:"+lines.Item(i)(8)+ " priority:H"+" proj:"+twProjectCode+".OldEx"+" "+lines.Item(i)(0)+" exam nr="+lines.Item(i)(1)+" exam date="+lines.Item(i)(2)+" exercise "+lines.Item(i)(3)+"-"+lines.Item(i)(4)+" weight="+lines.Item(i)(5)+" topic="+lines.Item(i)(6)+" lect.topic="+lines.Item(i)(7))'msgbox(commands(i))
			Next
			
		case "exercises.csv"
			For i = 0 To lines.count -1
				'Nr	Cal	Tw	Available	Topic	Lecture topic	Due date
				'0	1	2	3			4		5				6
				commands.add("task add due:"+lines.Item(i)(6)+" proj:"+twProjectCode+".exer"+" "+" exercise nr="+lines.Item(i)(0)+" topic="+lines.Item(i)(4)+" lect.topic="+lines.Item(i)(5))
			Next
		
		case "studyMaterial.csv"
			For i = 0 To lines.count -1
				'Nr	Cal	Tw	Available	Topic	Lecture topic	Due date
				'0	1	2	3			4		5				6
				commands.add("task add due:"+lines.Item(i)(6)+" proj:"+twProjectCode+".exer"+" "+" exercise nr="+lines.Item(i)(0)+" topic="+lines.Item(i)(4)+" lect.topic="+lines.Item(i)(5))
			Next		
		case "exam.csv"
			For i = 0 To lines.count -1
				'date		Location	duration	weight
				'0			1			2			3
				commands.add("task add due:"+lines.Item(i)(0)+" proj:"+twProjectCode+".exam"+" "+" make exam at location="+lines.Item(i)(1)+" weight="+lines.Item(i)(3)+" duration="+lines.Item(i)(2))
				commands.add("task add due:"+getExamRegistryDate(lines.Item(i)(0))+" priority:H proj:"+twProjectCode+".exam"+" "+"REGISTER FOR THIS EXAM")				
			Next
	
		   'msgbox("Match hi")
		case else
		   'msgbox(fileName +"not terminated")
	 End select

	objTextFile.Close
	set objTextFile = Nothing
	set fs = Nothing
	Set createCsvFiles = commands
End Function

Function getExamRegistryDate(examDate)
	'msgbox(examDate)
	'msgbox("Month="+Mid(examDate, 6, 2))
	If (Mid(examDate, 9, 2)> 14) Then
		getExamRegistryDate=Left(examDate, 8)+cStr(Mid(examDate, 9, 2)-15)
	Else
		If (Mid(examDate, 6, 2)= "01") Then
			getExamRegistryDate=Left(examDate, 2)+cStr(Mid(examDate,3,2)-1)+"-11-"+cStr(28+Mid(examDate, 9, 2)-15)
		Else
			msgbox("setting:"+Left(examDate, 5)+cStr(Mid(examDate,6,2)-1)+"-"+cStr(28+Mid(examDate, 9, 2)-15))
			getExamRegistryDate=Left(examDate, 8)+cStr(28+Mid(examDate, 9, 2)-15)
		End If 
	End If 

End Function




' Get the week number so that it can be added to the end of the project
Function getProjWeek(weekNr)
  Dim returning
  If Left(weekNr,1) = "W" Then
      returning = Left(weekNr,2)
  End If
  getProjWeek = returning  'Returning the result to the function name itself
End Function

' writes the commands so you can can instantly copy paste them to Taskwarrior
Function writeTaskwarriorCommands(commands(),scriptDir)
  Set objFSO = CreateObject("Scripting.FileSystemObject")
  
  'SourceFile = objFSO.GetParentFolderName(WScript.ScriptFullName) & "\taskwarriorCommands.txt"
  SourceFile = scriptDir & "\taskwarriorCommands.txt"
  ' Content = "(Over)write a file so that it contains a string." & vbCrLf &_
      ' "The reverse of Read entire file—for when you want to update or create a file which you would read in its entirety all at once."
  
  With objFSO.OpenTextFile(SourceFile,2,True,0)
	For i = 0 To commands.count -1
		If commands(i).count>0 Then
			For j = 0 To commands(i).count -1
				.Write commands(i)(j) & vbCrLf
			Next
			
		End If
	Next
    
    .Close
  End With
  
  Set objFSO = Nothing
End Function
'Dim oShell
Set oShell = WScript.CreateObject ("WScript.Shell")
oShell.run "cmd.exe /C cd %cd% & pdflatex --enable-write18 -interaction=nonstopmode main.tex"
Set oShell = Nothing'
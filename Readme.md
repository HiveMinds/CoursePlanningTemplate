##Prerequisites##
Have installed TexWorks, or Texmake and MikTex

##How to use##
Compile this project by:
0. Open Command Prompt (start>type: cmd>enter
1. Browse to this directory (that contains the main.tex) using cd
2. Enter: pdflatex --enable-write18 -interaction=nonstopmode main.tex

That will automatically build the pdf and generate a list of taskwarrior commands that allow you to instantly enter all the tasks of this planning into your agenda.

##TODO##
Create a clickable vbs script called "buildPdf.vbs" that automates opening cmd and entering the build command.
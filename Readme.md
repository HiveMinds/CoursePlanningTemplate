# Make your complete course planning

This repository can be used to generate your planning (what will be done and in what order) and a little bit of scheduling (when it needs to be done). On top of that, it is a platform for collaboration on old exam solutions, because in my experience it is too much work to properly solve all old exams of a single course before the exam takes place.

## Course planning
What you get: 
	0. a list of taskwarrior commands of all tasks you need to complete (succesfully) to pass this course. 
    1. A (link to a) google calendar with all your deadlines of this course in it.
What someone needs to do:
	1. Open the `CoursePlanningTemplate/PlanningData-Form.xlsx` and fill in all the sheets. (This is the hard work, you have to meticulously scan the entire brightspace page, course guide and spam the teacher if any data is missing (such as when an assignment is due) or what the weight of an assignment is. The software needs to know all that stuff at the start of the course, and for you to be able to make a proper and complete planning you need that information as well.)
	2. To run the python script, you need to install the following modules/packages in anaconda prompt (or whatever your python software is):
	```
python -m pip install pyexcel
python -m pip install pyexcel-xlsx
python -m pip install pyexcel-ods3
```
	3. browse to the directory `CoursePlanningTemplate/processPlanning/` using the `change directory` command: `cd "<this path>"`.
	4. run the python script `python convertOds.py` in Anaconda prompt with command:
```
python convertOds.py
```
	5. Thats it now you have the taskwarrior commands in folder: `CoursePlanningTemplate/processPlanning/CsvTasks/taskwarriorCommands.txt`
	6. The exam solution templates are in: `/ExamSolutions/`. To edit them in Overleaf just click "Fork(=difficult word for copy to your own github account)" on this repository and in overleaf click `new project>import from github>Then select your fork(=copy) of this repository`.
	

### FYI: what the python script (is intended to do/) does
1. FYI the python script combines all the scripts that generate:
	1.1 A Taskwarrior command for each single tasks
	1.2 Latex templates for all old exams that you can immediatly start filling in (in Overleaf!) (collectively and pseudo-anonymously)!
	1.3 A PDF with a story/visualisation/tables/overview of the entire course planning, instead of just a calender link. (I think this option is currently not active though, it has low development priority).
	1.4 If you use the taskwarrior software from: https://github.com/a-t-0/Taskwarrior-installation you can copy paste the taskwarrior commands and get your google calendar (link). The idea is that all this stuff is done automatically by the website, but I still need to do 2 things for that:
			2.4.1 Complete the website that takes a new course as input and stores it in a mongoDB such that I can automatically generate the course planning excel (`.ods`).
			2.4.2 Set up Collabora Online with SSL, I am only able to host it on my own pc/local network without ssl, but I need to set up "Let's encrypt" to make collabora online available on my website. (so that you just can fill in the excel sheet in the browser (in collabora online) so that you just click "done" and directly get your google calendar link, (and link to overleaf with your old exam solution template).

## Old Exam Solution collaboration

In the excel in `CoursePlanningTemplate/PlanningData-Form.xlsx` on sheet `OldExams` is a separate column to allocate yourself to an old exam (column K), you can fill in a letter in that column to indicate you will create the solutions for that exam. 

Below are some more detailed instructions on how to put your letter in that excel in the github repository (so that other people know that someone will be making that exam solution). The instructions discuss:
 0. How to add yourself as collaborator to the list.
 1. How to request a review of your solution
 2. How to use Texworks for off-line latex editing (You can also just import to overleaf if you want.)
 3. Advanced repository instructions
 
 
### Add yourself as collaborator.
Short: 
0. git- fork, 
1. open xlsm, 

2.a find un-allocated exam (~ see column K)

2.b or add new one that doesnt have solutions in drive etc., 

3. Add yourself by new Letter(~see col G) in *column K*
4. push, 
5. send me pull request.

Exact steps:
0. Browse to my github
![1](./HowToUseTexMaker/addYourself/1.jpeg)
1. Open the repo of the course (you're already here if you're reading this)
![1](./HowToUseTexMaker/addYourself/2.jpeg)
2. Copy the link to clone the repo
![1](./HowToUseTexMaker/addYourself/3.jpeg)
3.Ensure you installed github and that it works, then open the software.(Go to: desktop.github.com) 
![1](./HowToUseTexMaker/addYourself/4.jpeg)
4. click add>CLONE repository.
![1](./HowToUseTexMaker/addYourself/8.jpeg)
5. Copy the git clone link you copied in step 2. and paste it in, then click add repository (If you get "ssh error" please click the refresh button in the github gui software again, untill the github gui software/program shows your fork of the course repository, then click that repository and clone.)
6. Probably takes you to the next screen, tab url, (else enter the copied git clone link again) and press clone.
![1](./HowToUseTexMaker/addYourself/7.jpeg)
8. Then open the cloned repository on your pc, 
![1](./HowToUseTexMaker/addYourself/9.jpeg)
9.and browse to CoursePlanningTemplate
![1](./HowToUseTexMaker/addYourself/10.jpeg)
10. Open `PlanningData-<Coursename>.xlsm`
![1](./HowToUseTexMaker/addYourself/11.jpeg)
11.Find an exam
![1](./HowToUseTexMaker/addYourself/12.jpeg)
12.Find your new ID /letter by going one letter beyond the current maximum ID as listed in cell M1, e.g. if the repo contains allocations in colum K of: A-G, your new ID = H.
![1](./HowToUseTexMaker/addYourself/13.png)
13.Allocate yourself to an exam by typing your ID into column K.
![1](./HowToUseTexMaker/addYourself/14.jpeg)
14. git pull/ git fetch before you push, forgot screenshot.
![1](./HowToUseTexMaker/addYourself/15.png)
15. Then after saving your xlsm and closing it, press git push (If you get auth error, you probably cloned my repository instead of your fork/copy of my repository {You are trying to push to my public repository while you're not a collaborator in that, hence you don't have the authentication to push  to it}.  Please go back to step 1 and try again.)
![1](./HowToUseTexMaker/addYourself/16.jpeg)
16.  Then in your ownforked/copied  repository/github of this course click"new pull request"
![1](./HowToUseTexMaker/addYourself/17.jpeg)

17.Create pull request (sends me message hey A-T-0 do you want this change I made?
![1](./HowToUseTexMaker/addYourself/18.jpeg)
18.Type a bit more than just your id.
![1](./HowToUseTexMaker/addYourself/19.jpeg)
19.Thats it, then I'll get a notification of your pull request, inspect it.
![1](./HowToUseTexMaker/addYourself/20me.jpeg)
20.And then merge your pull request to my/the main repo.

![1](./HowToUseTexMaker/addYourself/21me.jpeg)

21. Thats it, now make an exam solution in the latex template.

### Request review of your solution

22.a First make sure you have the latex files and a compiled pdf in the folder `examSolutions/<exam date>` of your local copy of your personal fork/copy of my public repository. Then open your browser, browse to your fork of my public repository.

22.b Now click settings in your fork of this repository

![1](./HowToUseTexMaker/inviteCollab/a.png)

23. That brings you to the settings tab as depicted:

![1](./HowToUseTexMaker/inviteCollab/b.png)

24. Scroll all the way down (Right into the danger zone, Kenny Loggins would be proud). Make sure you have a github pro account with your academic licence. Then click "Make private".


![1](./HowToUseTexMaker/inviteCollab/c.png)

25. Type the name of the repository (EXACTLY) so for different course, different repository name.

![1](./HowToUseTexMaker/inviteCollab/d.png)

26. Then click collaborators

![1](./HowToUseTexMaker/inviteCollab/e.png)

27. Type your password to continue.

![1](./HowToUseTexMaker/inviteCollab/f.png)

28. Then add me, `a-t-0` as collaborator and click invite. 

![1](./HowToUseTexMaker/inviteCollab/g.png)

29. That's it. Now I will inspect it, and if your solutions are complete you will be granted access to the private repository (where you can upload your solution).


  
### Configuring Texmaker for convenience
Normally you can switch between your tabs/files with `Alt+PageDown` and `Alt+PageUp`. However if you also have FLux installed on windows, those shortcuts are already mapped to reducing the blue content in your screen. The shortcuts wont work in that case. To switch between screens fast with your keyboard:

  7. Click Options.
  
  8. Click Configure Texmaker.
  
  ![1](./HowToUseTexMaker/5.png)

  9. Click tab: "Shortcuts" and scroll down to Action: "Next Documents".
  
  10. Click the "shortcut" next to `Next Document` and Press the shortcut you want, e.g. press `Ctrl+PageDown`.
  
  ![1](./HowToUseTexMaker/6.png)
  
  11. Then do the same for the `Previous Document`



If you are having troubles with any of the above steps/don't know how you do any of that, feel free to click on: "issue" and type your question :)


### Advanced repository instructions
0. You can git clone this repository
1. You can edit pdf's in this repository with TexMaker (OpenSource):https://www.xm1math.net/texmaker/download.html
2. You can compile/create the pdf's in this repository by telling TexMaker to use MikTex (OpenSource): https://download.cnet.com/MiKTeX-64-bit/3000-18483_4-75851644.html
Or:
https://miktex.org/download
https://miktex.org/howto/install-miktex
3. Or just do it in overleaf (Skip to step `7.b` and `7.c`)

2. And then send a pull request after you have pushed your changes. After inspection of your pull request (and acceptance), you will be made collaborator in the private repo, to re-do your pull request which will be accepted. This will grant you access to all the exam solutions generated collectively! 

To change (a copy of) this a latex exam solution template after you have installed TexMaker:
  0. Open Main.tex file in TexMaker:
  
  ![1](./HowToUseTexMaker/1.png)
  
  ![1](./HowToUseTexMaker/2.png)
  
  1. Make sure you have opened `Main.tex` and not `someChapterOrOther.tex` and click the triangle meaning "Run/compile". That exports the PDF to your/this directory.
  
  
  2. Click `Options>Define current document as "Master Document"`.
  ![1](./HowToUseTexMaker/master_document.png)
  
  3. Selected `PDFLatex` and `View PDF` (see next pic)
  
  3.a Press `f2`,`f11` to compile the bibliography, followed by `f2` to include the bibliography in the report. Then:
  
  4. Press `f6` to compile the pdf. (left triangle in pic below)
  
  ![1](./HowToUseTexMaker/3.png)
  
  5. Press `f7` to preview the pdf in the right half of your screen. (Right triangle in pic below)
  
  ![1](./HowToUseTexMaker/4.png)
  
  6. If you get error saying: "no logfile" or anything else, it's most likely becuase you havent installed "the compiler". So latex is just some kind of computer language, Texworks is an editor for files of that language, and Miktex (also open source) is a compiler. So you can already edit your tex files, but to also build the pdf, install miktex and tell texworks where it can find your miktex `.exe` file (via `Options`> ?compiler? ..). Actually you have 3 options to create your latex solution:
  
   7.a  Install miktex, (F did that already) AND link the target destination of miktex in texworks.
  
   7.b Import your forked repository to overleaf (get a temporary free trial acount with ggr.la mail.
  
   7.c Import your forked repository to overleaf by pressing: menu>new>import zip file> put your 2010-xx-yy folder Content into a zip, and click import. Then you can just work in overleaf.

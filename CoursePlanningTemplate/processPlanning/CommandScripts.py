#import subprocess
#subprocess.call([r'E:\18-09-19 Document structure\personal\Automation and Systems\Latex\PlanningTemplate\CsvTasks\readCSV.vbs'])

import subprocess

#subprocess.call("notepad") # works

#subprocess.call("dir") # [Error 2] The system cannot find the file specified
                        # no shell, no intrinsics

#subprocess.call("19112944.vbs") # [Error 193] %1 is not a valid Win32 application
                                 # no shell, can't associate .vbs with c|wscript.exe

#subprocess.call("cscript 19112944.vbs") # works
subprocess.call("cscript CsvTasks/readCSV.vbs") # works


#subprocess.call("cmd /c 19112944.vbs") # works
                                       # have shell, can associate .vbs with c|wscript.exe
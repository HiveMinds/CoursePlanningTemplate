## How to use

0. Filling in the .ods file completely.
1. Run `/processPlanning/convertOds.py` with python 3.x or higher (personal note:so use anaconda).
2. Copy paste the content of `/processPlanning/csvTasks/taskwarriorCommands.txt` into an active/open instance of WSL ubuntu 18.04
3. type `./tw_gcal_sync -c "TW <course calendar name>" -p "uni.<course abreviation>"
4. (authorise taskwarrior access to google if it's your first sync {it'll give you a link}.)
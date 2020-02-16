## How to use

0. After filling in the .ods file, open `/processPlanning/GenerateTwCommandsAndLatexTemplates.xlsm`
2. Click the first button to generate `.csv` files from the ODS
3. Then run `\processPlanning\CsvTasks/readCSV.vbs` to generate the actual taskwarrior commands.
4. Shortly inspect them to ensure their format is correct.
5. Shortly inspect them to ensure they are complete (If you miss one, you (potentially) fail a course.)
6. copy paste the content of `taskwarriorCommands.txt` into an active/open instance of WSL ubuntu 18.04
7. type `./tw_gcal_sync -c "TW <course calendar name>" -p "uni.<course abreviation>"
8. (authorise taskwarrior access to google if it's your first sync {it'll give you a link}.)
# kwic-pipeline
KWIC project: pipeline solution 
#### Instructions Linux
Run from bin directory:
```bash
$ cd bin/
```
Execution piping all the way through:
```bash
$ java Input | java CircularShift | java Alphabetise | java Output
```
Output will be saved in ../output.txt
```bash
$ cat ../output.txt
```
Feel free to not pipe all the way through as output of each program goes to stdout, which will print on-screen

#### Instructions Windows
Open PowerShell (in order to pipe)  
Run from bin directory:
```
cd bin/
```
Execution piping all the way through:
```powershell
..\bin> java Input | java CircularShift | java Alphabetise | java Output
```
Output will be saved in output.txt in the *parent* directory

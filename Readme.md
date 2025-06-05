# FOL to claus form 

The project has an input and output folder added to the Krr parser files given.
The main code is given in the foltocnf.py file and it can be run from the command line
```
~$:python foltocnf.py 

```

## 📁 Project Structure
```text
├── KRR_report.pdf
├── Readme.md
├── dist
│   └── KRR.jar
├── doc
│   └── krr-language-specification-v4.3.pdf
├── foltocnf.py
├── input
│   ├── 1.txt
│   └── 1.xml
├── lib
│   └── antlr-3.5.2-runtime.jar
├── output
│   ├── 1_output.txt
│   └── 1_output.xml
└── src
    ├── in
    └── krr
```

The input folder should contain the textfile which has all the fol statements in it.
The name of the text file is stored as 1.txt by default in the variable inputtxt, which can be modified for any other input file. The input folder also contains the xml parsed version of the same text file when the code is run.

The output folder contains both the output xml file and the output txt file

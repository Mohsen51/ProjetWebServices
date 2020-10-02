# ProjetWebServices

## Launch the project on windows

**Install Java** 

First make sure you have java installed on your computer. If it's not the case install it (jdk13 at least), and add it to your environment path.

**Launch the maven cmd file on root of the project** 

To install the dependencies of the project you must use maven.
To do so you just have to run mvnw.cmd (in the root of the folder) from the windows command prompt.

```bat
mvnw.cmd clean install
```
Once it's installed the jar executable file will be created in the newly created target folder.

**Launch the server** 

To launch the server run a maven execution in java.

```bat
mvnw.cmd exec:java -Dexec.mainClass=com.test.test.TestApplication
```

# Congratulation the server is launched



To start the project, follow these steps.

Required version of JDK is Java 8.

## **1. Installing of the project**
Clone this repository to your machine.

Open the project through you preferred an integrated development environment (IDE).

**Note**  
Make sure that environment variables (JAVA_HOME, MAVEN_HOME, ANDROID_HOME), Path, and basic tools package of software development were set up at your machine.

>Please, select a preferred way of testing: using an emulator or a physical device. Depending on which way you gonna use, depends what steps you should perform before the run project - open the AVD manager to run an emulator or connect a physical device through USB port to your machine.

**Note**  
Please, make sure that opened project isn't had any issues underlined by the red color of the code's text.

>To check that all necessary environment is ready to run the project, please, write in the terminal the following strings.
The first one is ***mvn clean compile*** this command is aimed to validate that code written at main package is ready to start and have no issues by itself.
The second command is ***mvn clean compile test-compile*** the purpose of this command is to validate the test package.


## **2. Run the project**
To run the suite aimed to run the test of *native* application, please, open the terminal and write the following string  ***mvn clean test -P native***

To run the test purposed to *web* application, please, write in the terminal the following command ***mvn clean test -P web***

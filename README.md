To start the project, follow these steps.

Required version of JDK is **Java 8**.

## **1. Preparatory steps**
>Please, select a preferred way of testing: using an emulator or a physical device. Depending on which way you gonna use, depends what steps you should perform before the run project - open the AVD manager to run an emulator or connect a physical device through USB port to your machine. Please, don't forget to change the name of your device in the testNG suite of the project.

The pre-installed server address is http://localhost:4723/wd/hub (for local run test).

To run tests at the remote server, please, don't forget to set up your personal token in pom.xml file (30 line).

Please, don't forget to change the server address if it isn't the same for you. You may do it at *pom.xml* file, where you can find a parameter which named as **ts.appium** (24 line)

## **2. Installing of the project**
Clone this repository to your machine.

Open the project through you preferred an integrated development environment (IDE).

**Note**  
Make sure that environment variables (JAVA_HOME, MAVEN_HOME, ANDROID_HOME), Path, and basic tools package of software development were set up at your machine.

**Note**  
Please, make sure that opened project isn't had any issues underlined by the red color of the code's text.

>To check that all necessary environment is ready to run the project, please, write in the terminal the following strings.
The first one is ***mvn clean compile*** this command is aimed to validate that code written at main package is ready to start and have no issues by itself.
The second command is ***mvn clean compile test-compile*** the purpose of this command is to validate the test package.


## **3. Run the project**
Start the local Appium server at a machine at which you gonna running tests.
>Please, make sure that your device (client) is connected to Appium server.

If you prefer to work with the remote server, please, scroll down the page and you can find the information about how to run the test remotely.

To run the suite aimed to run the test of *native* application, please, open the terminal and write the following string  ***mvn clean test -P native***

To run the test purposed to *web* application, please, write in the terminal the following command ***mvn clean test -P web***

Please, use the following commands to run tests at **the remote server**:
- for the Android web application: ***mvn clean test -P CloudAndroidWeb***
- for the Android native application: ***mvn clean test -P CloudAndroidNative***

- for the iOS web application: ***mvn clean test -P CloudiOSWeb***
- for the iOS native application: ***CloudiOSNative***


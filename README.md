RBS API HAckathon 2020

# openbanking-java-sdk-master :
This project is build on top of the sdk shared by the Open Banking API team which has the code to connect to the hosted APIs.
We have built our controller to fetch User Pool data from backend.


Pre-Requisites to execute the application
1. Checkout this project & unzip it(if already zipped).

2. Checkout project from 'RbsInsight/mailService' repository & unzip it(if zipped).

3. Make sure you have Java 8 configured at your machine, run "java -version" command in cmd to verify. 
   If not, then please download & install JDK 1.8 from "https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html" 
   and also configure PATH environment variable(for help "https://www.codejava.net/java-core/how-to-set-java-home-environment-variable-on-windows-10" this can be used).

4. Make sure you have Maven(3.6.*) configured in your machine, run "mvn -version" command in cmd to verify.
   If not, then you can download from "https://maven.apache.org/download.cgi", installation guidelines can be found here ("https://maven.apache.org/install.html").


Below execution steps to be followed to run this application

1. Now open command prompt and navigate to path "<project_home>\hackathon-master\openbanking-java-sdk-master" 
   For e.g., If you extracted project at D: drive the navigate to "D:\hackathon-master\openbanking-java-sdk-master", here under this path you should be able to see a pom.xml file.


2. Now run "mvn clean install" in same command prompt to build the project

3. Now run "java -jar web\target\web-1.0-SNAPSHOT.jar" to run the application

Please note : same steps can be done using your preffered Spring Boot IDE


# poolApp :
This project is a dummy Spring boot project which the UI code written in Angular 9 and Java code with MongoDB.

# pool-app-client -
This is actual UI source-code, In order to run this code you should have node installed in your machine.If not then please use "https://www.npmjs.com/get-npm" to install node

1. Now open fresh command prompt and navigate to path "<project_home>\hackathon-master\poolApp\pool-app-client"

2. This project was generated with Angular CLI version 9.0.0-rc.7.
In order to install or update Angular 9 CLI, execute below command in your cmd prompt from the current navigated path:
npm install -g @angular/cli@9.0.0-rc.7
npm install

3. Once it got installed successfully, then run "ng serve" command in cmd prompt window. It should be Compiled Successfully.

4. Now navigate to url "http://localhost:4001/", that's it Insight application will start running at your local.

# mailService
This service is being created for the purpose of sending out emails.

In order to run this use the earlier downloaded repository, which was downloaded from 'RbsInsight/mailService'.

Below execution steps to be followed to run this application
1. Now open command prompt and navigate to path "<project_home>\mailService-master" 
   For e.g., If you extracted project at D: drive the navigate to "D:\\mailService-master", here under this path you should be able to see a pom.xml file.
   
2.There is one 'image.jpeg' file under "<project_home>\mailService-master\src\main\resources" folder. Copy and paste it in c drive.

3. Now run "mvn clean install" in same command prompt to build the project

4. Now run "java -jar web\target\web-1.0-SNAPSHOT.jar" to run the application
Please note : same steps can be done using your preffered Spring Boot IDE
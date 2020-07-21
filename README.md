RBS API HAckathon 2020

openbanking-java-sdk-master -
This project is build on top of the sdk shared by the Open Banking team which has the code to connect to the APIs.
We have built our controller to fetch User Pool data from backend.

1. Checkout the project
2. Make sure you have Java 8 configured. Run java -version to verify
3. Make sure you have Maven setup in your machine. Run mvn -v to verify
4. Run mvn clean install to build the project
5. Once the project build is complete, you can run the server through an IDE
or
6. You can open command Prompt from the project folder and run - java -jar web\target\web-1.0-SNAPSHOT.jar

poolApp -
This project is a dummy Spring boot project which the UI code written in Angular 9 and Java code with MongoDB.

pool-app-client -
This is the UI code which is mentioned before. To run this code you should have node installed
This project was generated with Angular CLI version 9.0.0-rc.7.

To install or update Angular 9 CLI, type this command in the terminal:
npm install -g @angular/cli@9.0.0-rc.7

Development server
Run ng serve for a dev server on the path- \pool-app-client.
Navigate to http://localhost:4001/. The app will automatically reload if you change any of the source files.


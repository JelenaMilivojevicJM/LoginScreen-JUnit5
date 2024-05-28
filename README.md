LoginScreen-JUnit5

The LoginScreen-JUnit5 project is a Java application designed to handle user authentication and login functionality. The main focus is on demonstrating JUnit5 testing examples. This project includes classes for reading properties and validating login usernames and passwords. Additionally, it provides classes for handling exceptions related to login.

Components
1.	Application.java:
    o	The entry point for your application.
    o	Contains the main method.
2.	Exception Classes (PasswordException and UsernameException):
    o	Handle exceptions related to passwords and usernames.
3.	LoginScreen.java:
    o	Manages login-related functionality.
    o	Validates usernames and passwords.
    o	Provides methods for setting and getting login information.
4.	ReadProperties.java:
    o	Reads properties from login.properties.
    o	Initializes the LoginScreen with username and password properties.
    o	Provides methods for checking username and password validity.
5.	Test Classes (LoginScreenTest and ReadPropertiesTest):
    o	Contains JUnit 5 unit tests for the LoginScreen and ReadProperties classes.
    o	Ensure that the functionality works as expected.

Usage
1.	Clone the Repository:
    o	Begin by cloning this repository to a local machine using Git:
    git clone https://github.com/your-username/LoginScreen.git


2.	Build the Project:
    o	Navigate to the project root directory:
    	cd LoginScreen
    o	Build the project using Maven (ensure you have Maven installed):
    	mvn clean install
3.	Configure Properties:
    o	Edit login.properties in the resources directory:
    o	Set a desired username and password properties.
    o   Customize any other relevant configuration settings.

4.	Run the Application:
    o	Execute the Application class to start the application:
    o	java -cp target/LoginScreen-1.0-SNAPSHOT.jar com.example.application.Application

5.	Testing:
    o	Unit tests are provided in the test directory.
    o	Use LoginScreenTest and ReadPropertiesTest for testing.
    o	Run tests using Maven:
    	mvn test

6.	Properties Files:
    1.	login.properties:( located in the java  resources directory)
            o	This file contains properties related to user login information.
            o	Specifically, it defines the following key-value pairs:
                o	username: The username associated with the login (e.g., “RoseTheFlower”).
                o	password: The corresponding password (e.g., “123X4X5X6”).
            o	These values are likely used during authentication or authorization processes within the application.

    2.	test.properties: (located in the test  resources  testdirectory)
            o	This file appears to be related to testing.
            o	It contains the same key-value pairs as login.properties: 
                o username: Again, the username (e.g., “RoseTheFlower”). 
                o password: The corresponding password (e.g., “123X4X5X6”).
o	In a testing context, these properties might be used for test scenarios, such as verifying login functionality or testing edge cases.

Configuration
    •	Edit login.properties to set a desired username and password properties.

Test Classes
1.	LoginScreenTest:
    o	Contains JUnit 5 unit tests for the LoginScreen class.
    o	Ensures that the login-related functionality works as expected.
    o	Tests include:
        o	Reading properties from test.properties file.
        o	Validating usernames (not empty, empty, and null).
        o   Validating passwords (valid, empty, null, and whitespace-only).
2.	ReadPropertiesTest:
    o	Contains JUnit 5 unit tests for the ReadProperties class.
    o	Ensures that properties are correctly read from login.properties.
    o	Tests include:
        o	Reading properties from login.properties file.
        o	Checking username and password validity.

How to Run Tests
1.	Build the Project:
    o	Ensure that you’ve built the project using Maven (as mentioned in the README).
    o	Navigate to the project root directory:
    o	cd LoginScreen
2.	Run Tests:
    o	Execute the following command to run all tests:
    o	mvn test
    o	Maven will execute the tests defined in the LoginScreenTest and ReadPropertiesTest classes.
3.	View Test Results:
    o	Observe the test results in the console.
    o	Green checkmarks indicate successful tests, while red crosses indicate failures.


JUnit5 Dependencies in pom.xml
Dependencies specified in the pom.xml file for the JUnit 5 testing project:
1.	JUnit Jupiter API:
    o	The JUnit Jupiter API is a part of the JUnit 5 framework.
    o	It provides annotations, assertions, and other features for defining and running test cases.
    o	Essentially, it serves as a programming model for writing tests in Java.
    o	To include the JUnit Jupiter API in your project, add the following dependency to your pom.xml file:
XML
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-api</artifactId>
    <version>5.8.2</version>
    <scope>test</scope>
</dependency>
    o	The test scope ensures that this dependency is available only during testing.

2.	JUnit Jupiter Engine:
    o	The JUnit Jupiter Engine is responsible for executing JUnit 5 tests.
    o	It provides the necessary runtime environment for running JUnit 5 tests.
    o	To include the JUnit Jupiter Engine, add the following dependency:
XML
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-engine</artifactId>
    <version>5.8.2</version>
</dependency>


These dependencies allow us to write and run JUnit 5 tests in our project. They provide the necessary tools and infrastructure for creating effective test cases. It's important to make sure that one's project setup aligns with these dependencies, and then it will be all set for testing.
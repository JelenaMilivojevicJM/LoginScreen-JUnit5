## LoginScreen-JUnit5🔎💻📋

The LoginScreen-JUnit5 project is a Java application designed to handle user authentication and login functionality. The main focus is on demonstrating JUnit5 testing examples. This project includes classes for reading properties and validating login usernames and passwords. Additionally, it provides classes for handling exceptions related to login.


📍**Components**:
1.	🧩Application.java:
- The entry point for your application.
- Contains the main method.
2.	🧩Exception Classes (PasswordException and UsernameException):
- Handle exceptions related to passwords and usernames.
3.	🧩LoginScreen.java:
- Manages login-related functionality.
- Validates usernames and passwords.
- Provides methods for setting and getting login information.
4.	🧩ReadProperties.java:
- Reads properties from login.properties.
- Initializes the LoginScreen with username and password properties.
- Provides methods for checking username and password validity.
5.	🧩Test Classes (LoginScreenTest and ReadPropertiesTest):
- Contains JUnit 5 unit tests for the LoginScreen and ReadProperties classes.
- Ensure that the functionality works as expected.


📍**Usage**:
1.	Clone the Repository:
- Begin by cloning this repository to a local machine using Git:
                -git clone https://github.com/your-username/LoginScreen.git

2.	Build the Project:
- Navigate to the project root directory:
                    	cd LoginScreen
- Build the project using Maven (ensure you have Maven installed):
                    	mvn clean install
3.	Configure Properties:
- Edit login.properties in the resources directory:
- Set a desired username and password properties.
- Customize any other relevant configuration settings.

4.	Run the Application:
- Execute the Application class to start the application:
                 java -cp target/LoginScreen-1.0-SNAPSHOT.jar com.example.application.Application

5.	Testing:
- Unit tests are provided in the test directory.
- Use LoginScreenTest and ReadPropertiesTest for testing.
- Run tests using Maven:
                        	mvn test

6.	Properties Files:
    1.	login.properties:( located in the java  resources directory)
- This file contains properties related to user login information.
- Specifically, it defines the following key-value pairs:
- username: The username associated with the login (e.g., “RoseTheFlower”).
- password: The corresponding password (e.g., “123X4X5X6”).
- These values are likely used during authentication or authorization processes within the application.

    2.	test.properties: (located in the test  resources  testdirectory)
- This file appears to be related to testing.
- It contains the same key-value pairs as login.properties: 
- username: Again, the username (e.g., “RoseTheFlower”). 
- password: The corresponding password (e.g., “123X4X5X6”).
- In a testing context, these properties might be used for test scenarios, such as verifying login functionality or testing edge cases.


📍**Configuration**
- Edit login.properties to set a desired username and password properties.


📍**Test Classes**
1.	🧩LoginScreenTest:
- Contains JUnit 5 unit tests for the LoginScreen class.
- Ensures that the login-related functionality works as expected.
- Tests include:
        - 🔎 Reading properties from test.properties file.
        - 🔎 Validating usernames (not empty, empty, and null).
        - 🔎 Validating passwords (valid, empty, null, and whitespace-only).
2.	🧩ReadPropertiesTest:
- Contains JUnit 5 unit tests for the ReadProperties class.
- Ensures that properties are correctly read from login.properties.
- Tests include:
        - 🔎 Reading properties from login.properties file.
        - 🔎 Checking username and password validity.


📍**How to Run Tests**
1.	Build the Project:
- Ensure that you’ve built the project using Maven (as mentioned in the README).
- Navigate to the project root directory:
                    cd LoginScreen
2.	Run Tests:
- Execute the following command to run all tests:
                      mvn test
- Maven will execute the tests defined in the LoginScreenTest and ReadPropertiesTest classes.
3.	View Test Results:
- Observe the test results in the console.
- Green checkmarks indicate successful tests, while red crosses indicate failures.


📍**JUnit5 Dependencies in pom.xml**
Dependencies specified in the pom.xml file for the JUnit 5 testing project:
1.	🧩JUnit Jupiter API:
- The JUnit Jupiter API is a part of the JUnit 5 framework.
- It provides annotations, assertions, and other features for defining and running test cases.
- Essentially, it serves as a programming model for writing tests in Java.
- To include the JUnit Jupiter API in a project, add the following dependency to a pom.xml file:
                               
                                <dependency>
                                    <groupId>org.junit.jupiter</groupId>
                                    <artifactId>junit-jupiter-api</artifactId>
                                    <version>5.8.2</version>
                                    <scope>test</scope>
                                </dependency>

- The test scope ensures that this dependency is available only during testing.

2.	🧩JUnit Jupiter Engine:
- The JUnit Jupiter Engine is responsible for executing JUnit 5 tests.
- It provides the necessary runtime environment for running JUnit 5 tests.
- To include the JUnit Jupiter Engine, add the following dependency:
                
                <dependency>
                    <groupId>org.junit.jupiter</groupId>
                    <artifactId>junit-jupiter-engine</artifactId>
                    <version>5.8.2</version>
                </dependency>


These dependencies allow us to write and run JUnit 5 tests in our project. They provide the necessary tools and infrastructure for creating effective test cases. It's important to make sure that one's project setup aligns with these dependencies, and then it will be all set for testing.📋

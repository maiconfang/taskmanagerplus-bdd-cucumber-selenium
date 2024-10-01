
# Task Manager Plus - BDD Cucumber Selenium

This project demonstrates BDD (Behavior-Driven Development) testing for the Task Manager Plus application using Cucumber and Selenium WebDriver. The tests are written in Java and are intended to validate the login functionality of the application.

## What is BDD?

Behavior-Driven Development (BDD) is a software development approach that focuses on collaboration between developers, testers, and business stakeholders to ensure that the application behaves as expected. BDD encourages writing test scenarios in a natural language format that can be easily understood by all team members, regardless of their technical background.

In this project, BDD is implemented using the Cucumber framework, which allows us to describe the behavior of the Task Manager Plus application using the Gherkin language. Each feature is described with scenarios that outline how the system should respond to different user actions. The goal of BDD is to create a shared understanding of how the application should behave, resulting in higher-quality software that meets user expectations.

### Key Benefits of BDD:
- **Improved Communication**: BDD promotes collaboration between developers, testers, and stakeholders, ensuring that everyone has a clear understanding of the requirements.
- **Readable Scenarios**: Test scenarios are written in plain language (Given-When-Then format), making them easy to understand for non-technical team members.
- **Living Documentation**: BDD scenarios act as living documentation that always reflects the current state of the application.

By using BDD in this project, we ensure that the login functionality is thoroughly tested and behaves correctly according to the defined scenarios, providing confidence in the quality of the Task Manager Plus application.

## @LoginTest
### Feature: Login Functionality

This feature ensures that users can successfully log in to the application using valid credentials.

#### Scenario: Successful login with valid credentials
- **Given** the user is on the login page
- **When** the user enters valid credentials
- **And** clicks on the login button
- **Then** the user should be redirected to the homepage

## Project Structure
- **cucumberOptions**: Contains the TestNG test runner configuration.
- **features**: Holds the `.feature` files that define the BDD scenarios in Gherkin language.
- **pages**: Contains Page Object classes representing different pages of the application.
- **stepDefinitions**: Includes the Java classes that implement the steps defined in the `.feature` files.
- **drivers**: Directory for storing WebDriver executables like `chromedriver.exe`.

## How to Run the Tests
1. Make sure you have Maven installed on your machine.
2. Download the compatible version of ChromeDriver and place it in the `drivers` folder.
3. Open the terminal or command prompt and navigate to the project root directory.
4. Execute the following command to run the tests:
   ```bash
   mvn test
   ```
   This will run the BDD tests using TestNG and Cucumber.

## Prerequisites
- Java JDK 11 or higher
- Maven
- Google Chrome Browser
- ChromeDriver (Ensure it matches the version of your Chrome browser)

## Note
- Make sure to update the `chromedriver.exe` if your Chrome browser version is updated to avoid any compatibility issues.
- You can find the ChromeDriver version from the [official ChromeDriver website](https://chromedriver.chromium.org/downloads).


Test Automation Framework
This is a Java-based test automation framework designed for robust, scalable, and maintainable test automation.

The framework leverages various libraries and tools to facilitate data-driven testing, logging, reporting, and integration with cloud-based testing platforms.

🚀 About the Framework
This framework is built to support automation testing for both UI and API with key features such as:

Functional and Regression Testing.
Cross-browser and Headless mode support.
Seamless integration with cloud-based platforms for scalability.
Easy-to-read test data and configuration management.
Prerequisites
Before running this framework, ensure the following software is installed on your system:

Java 11: Ensure Java is installed, and the JAVA_HOME environment variable is set.
Maven: Ensure Maven is installed and added to the system path.
Download Maven
Features
Data-Driven Testing: Utilizes libraries like OpenCSV, Apache POI, and Gson for managing test data from CSV, Excel, and JSON files.
Cross-Browser Testing: Allows tests to run on different browsers.
Headless Mode: Enables faster execution by running tests in headless mode.
Cloud Testing: Integrated with cloud platforms like LambdaTest for scalable test execution.
Logging: Generates detailed logs using Log4j.
Reporting: Produces comprehensive reports with Extent Reports.
Technologies Used
Java 11
TestNG
OpenCSV
Gson
Apache POI
Faker
LambdaTest
Log4j
Extent Reports
Setup Instructions
Clone the Repository:
bash
Copy code
git clone <repository-url>  
cd <repository-folder>  
Running Tests:
On LambdaTest:

bash
Copy code
mvn test -Dbrowser=chrome -DisLambdaTest=true -DisHeadless=false -X  
On Chrome (Local) in Headless Mode:

bash
Copy code
mvn test -Dbrowser=chrome -DisLambdaTest=false -DisHeadless=true -X  
Reports & Logs
Reports:
After execution, a detailed HTML report is generated at ./report.html.
It includes information on executed, passed, failed, and skipped test cases, along with screenshots for failures.

Logs:
Logs are created during test execution and stored in the ./logs/ directory.

Continuous Integration
This framework is integrated with GitHub Actions for automated test execution:

Schedule: Tests are executed daily at 09:00 AM IST.
Reports: Generated reports are archived in a designated branch (e.g., gh-pages).
Example Commands
View Reports via GitHub Actions:

php
Copy code
https://<your-github-username>.github.io/<repository-name>/report.html  
View Reports via Jenkins:

perl
Copy code
https://<your-github-username>.github.io/<repository-name>/extent-reports/report.html  


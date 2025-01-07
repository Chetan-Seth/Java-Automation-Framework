Test Automation Framework
This is a Java-based test automation framework designed for robust and maintainable test automation.

Overview
The framework supports automation for both UI and API testing. It includes features such as data-driven testing, cross-browser testing, headless mode execution, detailed logging, and reporting. The framework can also integrate with cloud-based platforms for scalable test execution.

Prerequisites
Before using this framework, ensure the following are installed:

Java 11: Ensure the JAVA_HOME environment variable is set.
Maven: Add Maven to your system path.
Download: https://maven.apache.org/download.cgi
Features
Data-Driven Testing: Supports reading test data from CSV, Excel, and JSON.
Cross-Browser Testing: Run tests on various browsers.
Headless Mode: Faster execution using headless browsers.
Cloud Testing: Integrates with cloud platforms like LambdaTest.
Logging: Generates detailed logs using Log4j.
Reporting: Provides HTML reports with Extent Reports.
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
Clone the repository:
bash
Copy code
git clone <repository-url>  
cd <repository-folder>  
Run tests:
On LambdaTest:
bash
Copy code
mvn test -Dbrowser=chrome -DisLambdaTest=true -DisHeadless=false  
On Local Chrome in Headless Mode:
bash
Copy code
mvn test -Dbrowser=chrome -DisLambdaTest=false -DisHeadless=true  
Reports and Logs
Reports: A detailed HTML report will be generated after execution (e.g., ./report.html).
Logs: Logs are stored in the ./logs/ directory during test execution.

# Selenium Automation Framework – SauceDemo

## Project Overview
This project is a **Selenium Automation Testing Framework** developed using **Java, Selenium WebDriver, TestNG, and Maven**.  
It automates functional test scenarios for the **SauceDemo** web application.

**Application Under Test:**  
https://www.saucedemo.com/inventory.html

The framework validates core e-commerce functionalities such as login, product selection, cart operations, and checkout flow.

---

## Tech Stack
- Java (JDK 8)
- Selenium WebDriver
- TestNG
- Maven
- Git & GitHub
- Jenkins (CI/CD)

---

## Framework Architecture
- TestNG-based automation framework
- Centralized base setup for browser configuration
- Reusable test components
- Maven for dependency management
- TestNG XML for execution control

---

## Project Structure
Jenkins.com (SeleniumREPO)
│
├── src
│   ├── main
│   │   ├── java
│   │   └── resources
│   │
│   ├── test
│   │   ├── java
│   │   │   └── NG_MA_SE_Jenkins.Jenkins.com
│   │   │       ├── App.java
│   │   │       ├── AppTest.java
│   │   │       ├── BaseFix.java
│   │   │       ├── CartTest.java
│   │   │       ├── Demo.java
│   │   │       ├── LogInZig.java
│   │   │       ├── OutCard.java
│   │   │       └── ProductAdd.java
│   │   │
│   │   └── resources
│   │
├── test-output
├── target
│
├── pom.xml
├── testng.xml
├── README.md
├── Jenkinsfile   


---

## Automated Test Scenarios
1. Verify login with valid credentials  
2. Verify login functionality  
3. Verify product listing page  
4. Add product to cart  
5. Verify cart details  
6. Remove product from cart  
7. Verify checkout process  
8. Verify logout functionality  

---

## How to Run the Project

### Prerequisites
- Java JDK 8 or higher
- Maven
- Eclipse or IntelliJ IDEA
- Chrome Browser
- ChromeDriver

### Execution Steps
```bash
git clone https://github.com/your-username/your-repo-name.git
cd your-repo-name
mvn clean test


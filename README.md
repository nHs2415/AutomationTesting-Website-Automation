# 🧪 QA Automation Project – AutomationExercise

## 📌 Project Overview
This project is a **QA Automation Testing framework** developed to automate end-to-end test scenarios for the website:

🔗 https://automationexercise.com/

The main goal of this project is to:
- Automate critical user workflows
- Reduce manual testing effort
- Improve test accuracy and reliability
- Ensure application stability after changes
- Demonstrate real-world automation testing skills

---

## 🛠️ Tech Stack Used
- **Language:** Java  
- **Automation Tool:** Selenium WebDriver  
- **BDD Framework:** Cucumber  
- **Test Runner:** TestNG  
- **Build Tool:** Maven  
- **Design Pattern:** Page Object Model (POM)  
- **Browser:** Google Chrome  

---

## 📂 Project Structure
src
└── test

├── java

│ ├── pages → Page Object classes

│ ├── stepDefinitions → Cucumber step definitions

│ ├── hooks → Setup & teardown (Before/After)

│ ├── utils → Utility classes (ElementUtil, Constants)

│ └── config → WebDriver Factory

│
└── resources

└── features → Cucumber feature files


---

## 🚀 Automated Test Scenarios
- Launch application
- User login validation
- Home page validation
- Product search and listing validation
- View product details
- Add product to cart
- View cart
- Checkout process
- Enter payment details
- Place order
- Order confirmation validation

---

## 🧩 Framework Design

### 🔹 Page Object Model (POM)
- Each page has a separate class
- Improves maintainability and readability
- Reusable locators and methods

### 🔹 Cucumber BDD
- Feature files written in Gherkin syntax
- Easy to understand for both technical and non-technical users

### 🔹 Hooks
- `@Before` → Launch browser and open application
- `@After` → Close browser after execution

---

## ⚙️ How to Run the Project

### ✅ Prerequisites
- Java JDK
- Maven
- Chrome Browser
- IDE (IntelliJ / Eclipse)

### ▶️ Run Tests
Using IDE:
- Run `Runner.java`

Using Maven:
```bash
mvn test
```
🎯 Benefits of This Automation Project

Saves manual testing time

Reduces human errors

Ensures quick regression testing

Easy to extend for new test cases

Supports faster release cycles

👩‍💻 Author

Nuwani Hansika
QA Automation Intern | Software Quality Assurance Enthusiast

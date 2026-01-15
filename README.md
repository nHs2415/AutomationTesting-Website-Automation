# QA Automation Project - E-commerce Website

## Overview
This project automates end-to-end testing for an e-commerce website using **Java**, **Selenium WebDriver**, and **Cucumber** (BDD).  
It covers user activities from landing page, login, product browsing, cart management, checkout, to payment confirmation.

The main feature tested is described in the `Ecommerce.feature` file.

---

## Project Structure


---

## Prerequisites

- **Java JDK 20** or higher installed
- **Maven** installed
- **Chrome Browser** installed
- IDE: IntelliJ IDEA or Eclipse
- Internet connection (for WebDriverManager to download drivers)

---

## Installation

1. Clone the repository:

```bash
git clone <repository-url>
cd <project-folder>
```
2. Install dependencies via Maven:

```
mvn clean install
```

How to Run Tests
1. Using Cucumber Runner

Locate the runner class in test/java/runner/ (e.g., TestRunner.java) and run it from your IDE.

2. Using Maven Command

Run all tests via terminal:
```
mvn test
```

Test Scenario (Ecommerce.feature)

Feature: Landing Page

Scenario: Open landing page and complete purchase

Steps automated:

Navigate to landing page

Click login button

Enter email and password

Click login

Validate login success

Perform home page validation

Click products

Validate product listing page

Click on view product

Validate product description page

Add product to cart

Validate popup

View cart

Validate cart page

Proceed to checkout

Validate checkout page

Place order

Enter payment details

Pay and confirm

Validate order confirmation message


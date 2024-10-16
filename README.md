# Accessibility Testing with Axe and Selenium

## Overview
This project demonstrates accessibility testing using Axe and Selenium in a Java environment. Accessibility testing ensures web applications are usable for all users, including those with disabilities, by checking for compliance with Web Content Accessibility Guidelines (WCAG).

## Tools Used
- **Axe**: An open-source accessibility testing engine by Deque Systems.
- **Selenium**: A browser automation tool to simulate user interactions.

## Setup
1. Install JDK and WebDriver.
2. Download `axe.min.js` and add it to `/src/test/resources`.
3. Add dependencies in `pom.xml` for Selenium, TestNG, Axe, and WebDriver Manager.

## Running Tests
Run the tests to generate a report of accessibility violations, identifying issues such as missing ARIA attributes, poor color contrast, and keyboard inaccessibility.

For detailed instructions, refer to [Accessibility Testing: Getting Started with Axe and Selenium](https://blog.nashtechglobal.com/accessibility-testing-getting-started-with-axe-and-selenium/).

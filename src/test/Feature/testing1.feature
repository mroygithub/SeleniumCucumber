
Feature: Scenarios to validate five applications and Title


  @Smoke
  Scenario: validate five application titles
      Given user launch application with given url as "https://www.google.com"
      Then application and feature file expected title is "Google"
      Then User close the application


  @Smoke @Regression
  Scenario: validate five application titles
    Given user launch application with given url as "https://www.facebook.com"
    Then application and feature file expected title is "Facebook – log in or sign up"
    Then User close the application


  @Regression
  Scenario: validate five application titles
    Given user launch application with given url as "https://www.linkedin.com"
    Then application and feature file expected title is "LinkedIn"
    Then User close the application



  @Smoke
  Scenario: validate five application titles
    Given user launch application with given url as "https://www.microsoft.com"
    Then application and feature file expected title is "Microsoft - Official Home Page"
    Then User close the application


  @Smoke
  Scenario: validate five application titles
    Given user launch application with given url as "https://manual2automation.com"
    Then application and feature file expected title is "Automation Testing tools : selenium WebDriver, API , Rest Assured , Appium"
    Then User close the application



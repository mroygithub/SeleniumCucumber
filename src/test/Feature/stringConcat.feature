
# Feature file name : stringConcat.feature
Feature: Do String Concat and output it with Calculation.


  @addition
  Scenario: Pass company name and add two numbers
    When We pass company as "Cognizant"
    Then Output should be "Welcome to Cognizant"
    And When we pass two numbers as 5 and 5 for addition
    Then output should be 10


  @subtraction
  Scenario: Pass company name and add two numbers
    When We pass company as "Google"
    Then Output should be "Welcome to Google"
    And When we pass two numbers as 8 and 5 for subtraction
    Then output should be 3
@regression @registration
Feature: Registration Page
  As a new customer
  I want to register

  Background:
    Given I am on the home page
    And I click on Register button

  Scenario: Valid Registration with Valid Data for mandatory fields
    When I enter Firstname "ABC"
    And I enter Lastname "XYZ"
    And I enter valid email on register page "abc1@yahoo.com"
    And I enter password on ragister page "123ABC"
    And I enter confirmpassword "123ABC"
    And I click on register button on registration page
    Then I should see "Your registration completed" on registration page
    And I should see logout button displayed
    And I should find text "/registerresult" in URL
    And I should see my account "My account" button displayed

    # crete scenario outline with 5 data
  Scenario Outline: Valid Registration with Valid Data for mandatory fields
    When I enter following Data for registration
      | FirstName   | LastName   | Email   | Password   | ConfirmPassword   |
      | <firstName> | <lastName> | <email> | <password> | <confirmPassword> |
    And I click on register button on registration page
    Then I should see "Your registration completed" on registration page
    And I should see logout button displayed
    And I should find text "/registerresult" in URL
    And I should see my account "My account" button displayed
    Examples:
      | firstName | lastName  | email           | password | confirmPassword |
      | Dipti     | Upadhyaya | abc11@yahoo.com | ABC123   | ABC123          |
    #  | Mittal    | Thummar   | abc21@yahoo.com | ABC123   | ABC123          |
     # | Pranjali  | Vyas      | abc31@yahoo.com | ABC123   | ABC123          |
      | Bhranti   | Patel     | abc41@yahoo.com | ABC123   | ABC123          |
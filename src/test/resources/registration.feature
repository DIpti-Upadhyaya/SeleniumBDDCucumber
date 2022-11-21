Feature: Registration Page
  As a new customer
  I want to register

  @registration
    Scenario: Valid Registration with Valid Data for mandatory field
    Given I am on the home page
    And I click on Register button
    When I enter Firstname "ABC"
    And I enter Lastname "XYZ"
    And I enter valid email on register page "abc2@yahoo.com"
    And I enter password on ragister page "123ABC"
    And I enter confirmpassword "123ABC"
    And I click on register button on registration page
    Then I should see "Your registration completed" on registration page
    And I should see logout button displayed
    And I should find text "/registerresult" in URL



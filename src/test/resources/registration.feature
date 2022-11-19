Feature: Registration Page
  As a new customer
  I want to register

  @register
    Scenario: Valid Registration with Valid Data
    Given I am on the home page
    And I click on Register button
    When I enter Firstname "ABC"
    And I enter Lastname "XYZ"
    And I enter valid email on register page "dipu@google.com"
    And I enter password on ragister page "123ABC"
    And I enter confirm password "123ABC"
    And I click on register button on registeration page
    Then I should see "Your registration completed" on registration page
    And I should see logout button displayed
    And I should see text "/registerresult" in URL

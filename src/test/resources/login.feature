@regression @login
Feature: Login Feature
  As a customer
  I want to login
  to check the login functionality

  Background:
    Given I am on the home page
    When I click on Login button
    # This Scenario to register before login because this is practice webpage

  Scenario:Validate Login Page
    Then I should see "Welcome, Please Sign In!"is visible
    And I should see text "/login" in URL

  Scenario Outline: Login with Valid credential
    And I Enter Valid email "<email>"
    And I Enter Valid Password "<password>"
    And I click on Login button on Login page
    Then I should see logout button displayed
    Examples:
      | email           | password |
      | abc@yahoo.com   | 123ABC   |
      | abc11@yahoo.com | ABC123   |
      | abc21@yahoo.com | ABC123   |
      #| abc31@yahoo.com | ABC123   |
     # | abc41@yahoo.com | ABC123   |

  Scenario: Login with invalid credential
    And I enter invalid email "abcd"
    And I click on password input field
    Then I should see "Wrong email" text displayed

  Scenario: Login with empty credential
    And I enter nullvalue in email " "
    And I enter nullvalue in password " "
    And I click on Login button on Login page
    Then I should see "Please enter your email" text displayed
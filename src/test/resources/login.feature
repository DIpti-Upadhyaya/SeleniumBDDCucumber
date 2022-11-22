@login
Feature: Login Feature
  As a customer
  I want to login
  to check the login functionality

  Scenario:Validate Login Page
    Given I am on the home page
    When I click on Login button
    Then I should see "Welcome, Please Sign In!"is visible
    And I should see text "/login" in URL

  Scenario: Login with Valid credential
    Given I am on the home page
    When I click on Login button
    And I Enter Valid email "abc@yahoo.com"
    And I Enter Valid Password "123ABC"
    And I click on Login button on Login page
    Then I should see logout button displayed

    Scenario: Login with invalid credential
      Given I am on the home page
      When I click on Login button
      And I enter invalid email "abcd"
      And I click on password input field
      Then I should see "Wrong email" text displayed

      Scenario: Login with empty credential
        Given I am on the home page
        When I click on Login button
        And I enter nullvalue in email " "
        And I enter nullvalue in password " "
        And I click on Login button on Login page
        Then I should see "Please enter your email" text displayed
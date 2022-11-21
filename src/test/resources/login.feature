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
    And I Enter Valid email "abc2@yahoo.com"
    And I Enter Valid Password "123ABC"
    And I click on Login button on Login page
    Then I should see logout button displayed



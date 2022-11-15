@login
Feature:
  As a customer
  I want to login
  to check the login functionality

  Scenario:
    Login with Valid cradential
    Given I am on the homepage
    When I click on Login button
    Then I should see "Welcome, Please Sign In!"

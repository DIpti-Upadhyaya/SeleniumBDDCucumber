@regression @contactUs
Feature: ContactUs Feature
  As a customer
  I want to use Contact us button
  to check the contact us functionality

  Scenario:Validate contact us button
    Given I am on the home page
    When I click on contact us button on Home page
    Then I should see "Contact Us"is visible on contact us page
    And I should see text "/contactus" in URL
@endToEnd
Feature: Check demo nopCommerce End To End Functionalities
  As a customer I register
  Login  with valid credential
  choose items and add it into cart
  remove some from the cart

  Scenario: Valid Registration with Valid Data for mandatory fields
    Given I am on the home page
    And I click on Register button
    When I enter Firstname "ABC"
    And I enter Lastname "XYZ"
    And I enter valid email on register page "abc@yahoo.com"
    And I enter password on ragister page "123ABC"
    And I enter confirmpassword "123ABC"
    And I click on register button on registration page
    Then I should see "Your registration completed" on registration page
    And I should find text "/registerresult" in URL
    And I should see my account "My account" button displayed
    When I should see logout button displayed

  Scenario:  Login with registered data
    Given I am on the home page
    And I click on Login button
    Then I should see "Welcome, Please Sign In!"is visible
    And I should see text "/login" in URL
    When I Enter Valid email "abc@yahoo.com"
    And I Enter Valid Password "123ABC"
    And I click on Login button on Login page
    Then I should see logout button displayed
    When I hoover on Computer tab and click on subelement notebooks
    And I should see "Notebooks"is visible
    And I click on  item HP Spectre XT Pro UltraBook on Notebooks page
    And I enter quantity "2"
    And I click on Add To Cart button
    Then I click on Shopping cart button
    And I should see "Shopping cart"is visible
    And I select/click terms and condition field
    And I click on checkout button
    And I should see "Checkout"is visible



#author
#decription

@smoketestFeature
Feature: feature to test login fns
@smoketest
  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user enters username and password
    And Click on login button
    Then user is navigated to the home page


      
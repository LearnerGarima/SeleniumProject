Feature: Salesforce Login
 
  Scenario: Valid login to Salesforce
    Given I am on the Salesforce login page
    When I enter valid username  and I enter valid password and I click the login button
    Then I should be logged in to the Salesforce account

 
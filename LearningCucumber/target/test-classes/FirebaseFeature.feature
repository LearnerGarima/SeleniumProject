Feature: Firebase Application Login
 
  Scenario: Valid login to Firebase
    Given I am on the Firebaselogin page
    When I enter valid username as "admin123@gmail.com"
    And I enter valid password as "admin123"
    And I click the login button
    And on Home Page
    Then verify we can see "Student Registration Form"

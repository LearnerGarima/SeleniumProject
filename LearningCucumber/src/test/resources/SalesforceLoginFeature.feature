Feature: Sales Force TestCases Login Feature


Scenario: Verify Login error with Valid Username and Empty Password field
Given User login page is launched
 When Enter "<username>" as  as garimas@tekarch.com
 When clear "<password>"
 And login button is clicked
 Then Error msg Displayed on login page



Scenario: Verify login with valid credentials
Given User login page is launched
 When Enter "<username>"  as garimas@tekarch.com
 And Clicks on Forget password link
 Then Forget password page should be display
    
    



Scenario: Verify login with valid credentials
Given User login page is launched
 When Enter "<username>" as garimas@tekarch.com and valid  "<password>" as Sengar@15 
 When Check Remember me checkbox
 And Clicks on Login button
 Then Home page should be display
    




Scenario: Verify login with valid credentials
Given User login page is launched
 When Enter "<username>" as garimas@tekarch.com and valid  "<password>" as Sengar@15 
 When Clicks on Login button
 When Home page should be display
 When Click on User Menu
 And Click Logout
 Then Should be logout
    


 

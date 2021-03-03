Feature: Successfull Login Validation

Scenario Outline: Verify Login Crdedentials
Given User enter URL and navigarted to website
When user should click on Login link
Then user should enter "UserName" & "Password"
And click on Submit button
Then click on logout button
Examples:
|Email|Password|
|ioc8cnxet5@temporary-mail.net|	Welcome@11|




Feature: Login Feature

Scenario: Valid LOgin
Given I open browser
And  I navigate to the FreeCrm
When I enter valid Username and password
And I click Login button
Then I Successfully Login in

Scenario: Invalid Login
Given I open browser
And I navigate to the FreeCrm
When I enter Invalid Username and password
And I click Login button
Then I see error message


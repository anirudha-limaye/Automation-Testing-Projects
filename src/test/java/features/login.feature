Feature: Login

Scenario: Successful Login
Given the user is on the login page
When the user enter valid credentials
And the user clicks on the login button
Then the user should be logged in successfully

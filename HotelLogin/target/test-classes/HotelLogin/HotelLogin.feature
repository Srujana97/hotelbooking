#Author: your.email@your.domain.com


Feature: HotelLogin
Scenario: Check the heading of login page
Given User is on Login page
Then Check the heading of the page

Scenario: Successful Login with valid data
Description: to login, user needs to enter his valid username, password
Given User is on Login page
When user enters valid username and password
Then navigate to hotel booking

Scenario: Prompt user to enter the data when he leaves the login fields empty
Given User is on Login page
When user doesnot enter either username or password
And clicks on the login button
Then display approriate message 

Scenario: Unsuccessful login due to incorrect username or password
Given User is on Login page
When user enters incorrect username or password
Then dispaly login failed message

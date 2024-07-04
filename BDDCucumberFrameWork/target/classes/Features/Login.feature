@Login
Feature: Free CRM Feature

Scenario: Free CRM login test application
Given User is already on Login page
When Title of free CRM Page
And User enter username and Password
And User click on Login button
Then User is on Home Page
And User close browser
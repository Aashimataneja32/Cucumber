Feature: Salesforce Application login feature

@Smoke
Scenario Outline: Login

Given Intialize the web driver
When user navaigates to website "https://login.salesforce.com/?locale=in"
And enter <username> and <password> and click on login button
Then user should be able to login sucessfully

Examples:
|username||password|
|test@gmail.com||test123|
|ram@gmail.com||ram123|
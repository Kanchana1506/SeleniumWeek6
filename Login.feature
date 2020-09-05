Feature: Leaftaps login functinality

#Background:
#Given open chrome browser  
#And provide the url
#And maxmize the browser
#And apply implicit wait

Scenario Outline: TC001_Test login with valid credentials

Given enter the username as <username> 
And enter the password as <password>
When click on login button 
Then the home page should be displayed 

Examples:
|username|password|
|demosalesmanager|crmsfa|
|demoCSR|crmsfa|


Scenario: TC002_Test login with invalid credentials

Given enter the username as demoCSR
And enter the password as crmsfa123 
When click on login button 
But error message should be displayed 

Feature: create lead functinality

Scenario Outline: TC001_Test create lead functionality

#Given open chrome browser  
#And provide the url
#And maxmize the browser
#And apply implicit wait
Given enter the username as demosalesmanager 
And enter the password as crmsfa
And click on login button 
When click on crmsfa link  
Then the home page should be displayed
And click on the leads tab 
And click on create lead option
And input the company name <cmpnyname> 
And input the first name <fname> 
And input the last name <lname> 
When click on the submit button
Then view lead page shuld be displayed

Examples:
|cmpnyname|fname|lname|
|ABC tech|ktest50|A|
|ABC tech|ktest51|B|
|ABC tech|ktest52|C|
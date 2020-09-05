Feature: edit lead functionality

Scenario:
Given enter the username as demosalesmanager 
And enter the password as crmsfa
And click on login button 
When click on crmsfa link  
Then the home page should be displayed
And click on the leads tab  
And click find leads 
And enter first name
And click find leads button
When click on first resulting lead
Then verify title of the page
And click edit
And clear the existing company name if any
And change company name 
When click update
Then confirm the changed name appears 
 

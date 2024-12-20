@program3
Feature: Program page  

Background: Admin is on program module after reaching dashboard

#Manage Program - Delete Program
#Manage Program - Delete Multiple Program


Scenario:40 Verify delete feature	
Given Admin is on Program module	
When Admin clicks on delete button for a program	
Then Admin will get confirm deletion popup

Scenario:41 Verify Admin is able to click 'Yes'	
Given Admin is on Confirm deletion form	
When Admin clicks on "Yes" button	
Then Admin can see 'Successful Program Deleted' message

Scenario:42 Verify Admin is able to deleted program	
Given Admin is on Program module	
When Admin Searches for "Deleted Program name"	
Then There should be zero results.

Scenario:43 Verify Admin is able to click 'No'	
Given"Admin is on Program Confirm Deletion Page after selecting a program to delete"	
When Admin clicks on "No" button	
Then Admin can see Confirmation form disappears

Scenario:44 Verify Admin is able to close the window with "X" 	
Given "Admin is on Program Confirm Deletion Page after selecting a program to delete"	
When Admin Click on "X" button	
Then Admin can see Confirm Deletion form disappear

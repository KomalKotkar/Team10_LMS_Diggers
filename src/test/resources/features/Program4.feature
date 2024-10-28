@program4
Feature: Program page  

Background: Admin is on program module after reaching dashboard

#Manage Program - Search bar
#Manage Program - Sorting Program
#Manage Program - Pagination


Scenario:45 Verify Admin is able to select multiple programs	
Given Admin is on Program module	
When Admin selects more than one program by clicking on the checkbox	
Then Programs get selected

Scenario:46 Verify Admin is able to delete Multiple programs	
Given Admin is on Program module	
When Admin clicks on the delete button on the left top of the program page	
Then Admin lands on Confirmation form

Scenario:47 Verify Admin is able to click 'Yes'	
Given Admin is on Confirmation form	
When Admin clicks on "Yes" button	
Then Admin can see "Successful  program deleted" message

Scenario:48 Verify Admin is able to deleted program	
Given Admin is on Program module	
When Admin Searches for "Deleted Program names"	
Then There should be zero results.

Scenario:49 Verify Admin is able to click 'No'	
Given Admin is on Confirmation form	
When Admin clicks on "No" button	
Then Admin can see Programs are still selected and not deleted

Scenario:50 Verify Admin is able to close the window with "X"
Given "Admin is on Program Confirm Deletion Page after selecting a program to delete"	
When Admin Click on "X" button	
Then Admin can see Confirm Deletion form disappear

Scenario:51 Verify Admin is able to search results found for program name	
Given Admin is on Program module	
When Admin enter the program to search By program name	
Then Admin should able to see Program name, description, and status for searched program name

Scenario:52 Verify Admin is able to search results found for program description	
Given Admin is on Program module	
When Admin enter the program to search By program description	
Then Admin should able to see Program name, description, and status for searched program description

Scenario:53 Verify Admin is able to search results not found	
Given Admin is on Program module	
When Admin enter the program to search By program name that does not exist	
Then There should be zero results.

Scenario:54 Verify Admin is able to search with partial program name	
Given Admin is on Program module	
When Admin enter the program to search By partial name of program	
Then Admin should able to see Program name, description, and status for searched program name

Scenario:55 "Verify sorting of  Program name inAscending order/Descending order"	
Given Admin is on Program module	
When "Admin clicks on Arrow next to program Name"	
Then "Admin See the Program Name is sorted in Ascending order/Descending order"

Scenario:56 "Verify sorting of  Program Description in  Ascending order/Descending order"	
Given Admin is on Program module	
When "Admin clicks on Arrow next to Program Description"	
Then "Admin See the program Description is sorted in Ascending order/Descending order"

Scenario:57 "Verify sorting of   Program status in Ascending order/Descending order"	
Given Admin is on Program module	
When "Admin clicks on Arrow next to Program status"
Then "Use See the  Program Status is sorted in Ascending order/Descending order"

Scenario:58 Verify Admin is able to click Next page link	
Given Admin is on Program module	
When Admin clicks Next page link on the program table	
Then Admin should see the Pagination has "Next" active link

Scenario:59 Verify Admin is able to click  Last page link	
Given Admin is on Program module	
When Admin clicks Last page link	
Then Admin should see the last page record on the table with Next page link are disabled

Scenario:60 Verify Admin is able to click Previous page link	
Given Admin is on last page of Program module table	
When Admin clicks Previous page link	
Then Admin should see the previous page record on the table with pagination has previous page link

Scenario:61 Verify Admin is able to click  First page link	
Given Admin is on Previous Program page	
When Admin clicks First page link	
Then Admin should see the very first page record on the table with Previous page link are disabled


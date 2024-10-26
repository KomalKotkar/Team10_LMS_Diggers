#Author: your.email@your.domain.com

@program
Feature: Program page  
  
Background: Admin is logged in to LMS Portal	
  
Scenario:1 Verify that Admin is able to navigate to Program module
Given Admin is on dashboard page after Login	
When Admin clicks "Program" on the navigation bar	
Then Admin should be navigated to Program module

Scenario:2 Verify any broken links on program page
Given Admin is on dashboard page after Login
When Admin clicks "Program" on the navigation bar	
Then Admin should not have any broken links for Program module

Scenario:3 Verify heading in menu bar	
Given Admin is on dashboard page after Login	
When Admin clicks "Program" on the navigation bar	
Then Admin should see the heading "LMS - Learning Management System"

Scenario:4 Verify other modules name displayed in menu bar
Given Admin is on dashboard page after Login
When Admin clicks "Program" on the navigation bar
Then Admin should see the module names as in order "Home Program Batch Class Admin Assignment Attendance"

Scenario:5 Verify Logout displayed in menu bar	
Given Admin is on dashboard page after Login	
When Admin clicks "Program" on the navigation bar	
Then Admin should see Logout in menu bar

Scenario:6 Verify sub menu displayed in program menu bar
Given Admin is on program page
When Admin clicks "Program" on the navigation bar	
Then Admin should see sub menu in menu bar as "Add New Program"

Scenario:7 Verify heading in manage program
Given Admin is on dashboard page after Login
When Admin clicks "Program" on the navigation bar
Then Admin should see the heading "Manage Program"

Scenario:8 Verify view details of programs	
Given Admin is on dashboard page after Login	
When Admin clicks "Program" on the navigation bar	
Then Admin should able to see Program name, description, and status for each program

Scenario:9 Verify the Multiple Delete button state 	
Given Admin is on dashboard page after Login	
When Admin clicks "Program" on the navigation bar	
Then Admin should see a Delete button in left top is disabled

Scenario:10 Verify the Search button 	
Given Admin is on dashboard page after Login	
When Admin clicks "Program" on the navigation bar	
Then Admin should see Search bar with text as "Search..."

Scenario:11 Verify column header name of data table	
Given Admin is on dashboard page after Login	
When Admin clicks "Program" on the navigation bar	
Then Admin should see data table with column header on the Manage Program Page as  Program Name, Program Description, Program Status, Edit/Delete

Scenario:12 Verify checkbox default state beside Program Name column header	
Given Admin is on dashboard page after Login	
When Admin clicks "Program" on the navigation bar	
Then Admin should see checkbox default state as unchecked beside Program Name column header as

Scenario:13 Verify checkboxes default state beside each Program names in the data table 	
Given Admin is on dashboard page after Login	
When Admin clicks "Program" on the navigation bar	
Then Admin should see check box default state as unchecked on the left side in all rows against program name

Scenario:14 Verify Sort icon in manage program	
Given Admin is on dashboard page after Login	
When Admin clicks "Program" on the navigation bar	
Then Admin should see the sort arrow icon beside to each column header except Edit and Delete

Scenario:15 Verify edit and delete icon in manage program	
Given Admin is on dashboard page after Login	
When Admin clicks "Program" on the navigation bar	
Then Admin should see the Edit and Delete buttons on each row of the data table

Scenario:16 Verify pagination icons below data table in manage program	
Given Admin is on dashboard page after Login	
When Admin clicks "Program" on the navigation bar	
Then "Admin should see the text as ""Showing x to y of z entries"" along with Pagination icon below the table.
#x- starting record number on that page
#y-ending record number on that page
#z-Total number of records"

Scenario:17 Verify footer message in manage program	
Given Admin is on dashboard page after Login	
When Admin clicks "Program" on the navigation bar	
Then "Admin should see the footer as ""In total there are z programs"".
#z- Total number of records"


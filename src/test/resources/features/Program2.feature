#Author: your.email@your.domain.com
@program2
Feature: Program page  

Background: Admin is on program module after reaching dashboard

# Menu bar Program - Add New Program

Scenario:18 Verify add New Program	
Given Admin is on Program module	
When Admin clicks on "New Program" under the "Program" menu bar	
Then Admin should see pop up window for program details

Scenario:19 Verify title of the pop up window	
Given Admin is on Program module	
When Admin clicks on "New Program" under the "Program" menu bar	
Then Admin should see window title as "Program Details"

Scenario:20 Verify mandatory fields with red "*" mark 	
Given Admin is on Program module	
When Admin clicks on "New Program" under the "Program" menu bar	
Then Admin should see red "*" mark beside mandatory field "Name"

Scenario:21 Verify empty form submission	
Given Admin is on Prog details form	
When Admin clicks save button without entering mandatory 	
Then Admin gets message '<field> is required'

Scenario:22 Verify cancel button	
Given Admin is on Prog details form	
When Admin clicks Cancel button	
Then Admin can see Program Details form disappears

Scenario:23 Verify enter program name	
Given Admin is on Prog details form	
When Admin enters the Name in the text box	
Then Admin can see the text entered

Scenario:24 Verify enter description	
Given Admin is on Prog details form	
When Admin enters the Description in text box	
Then Admin can see the text entered in description box

Scenario:25 Verify select Status	
Given Admin is on Prog details form	
When Admin selects the status of the program by clicking on the radio button "(Active/InActive)"	
Then Admin can see 'Active/Inactive' status selected

Scenario:26 Verify Admin is able to save the program details	
Given Admin is on Prog details form	
When Admin enter valid details for mandatory fields and Click on save button	
Then Admin gets message 'Successful Program created'

Scenario:27 Verify cancel program details	
Given Admin is on Prog details form	
When Admin Click on Prog details cancel button	
Then Admin can see program details form disappear

Scenario:28 Verify added Program is created	
Given Admin is on Program module	
When Admin searches with newly created "Program Name"	
Then Records of the newly created  "Program Name" is displayed and match the data entered

Scenario:29 Verify close window with "X" 	
Given Admin is on Prog details form	
When Admin Click on "X" button	
Then Admin can see program details form disappear

 # Manage Program - Edit Program
 
 Scenario:30 Verify Edit option	
Given Admin is on Program module	
When Admin clicks on Edit option for particular program	
Then Admin lands on Program details form

Scenario:31 Verify title of the pop up window	
Given Admin is on Program module	
When Admin clicks on Edit option for particular program	
Then Admin should see window title as "Program Details"

Scenario:32 Verify mandatory fields with red "*" mark 	
Given Admin is on Program module	
When Admin clicks on Edit option for particular program	
Then Admin should see red "*" mark beside mandatory field "Name"

Scenario:33 Verify edit Program Name	
Given Admin is on Program module	
When Admin edits the program name and click on save button	
Then Updated program name is seen by the Admin

Scenario:34 Verify edit Description	
Given Admin is on Program module	
When Admin edits the description text and click on save button	
Then Admin can see the description is updated

Scenario:35 Verify edit Status	
Given Admin is on Program module	
When Admin can change the status of the program and click on save button	
Then Status updated can be viewed by the Admin

Scenario:36 Verify Admin is able to click Save	
Given Admin is on Program module	
When Admin click on save button	
Then Admin can see the updated program details

Scenario:37 Verify Admin is able to click Cancel	
Given Admin is on Program module	
When Admin clicks on cancel button	
Then Admin can see the Program details form disappears

Scenario:38 Verify edited Program details	
Given Admin is on Program module	
When Admin searches with newly updated "Program Name"	
Then Admin verifies that the details are correctly updated.

Scenario:39 Verify close the window with "X" 	
Given Admin is on Program module
When Admin Click on "X" button	
Then Admin can see program details form disappear

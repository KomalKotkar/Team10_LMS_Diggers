Feature: Batch Page Navigation
Scenario:  Verify Admin Navigate to Batch page successfully
Given  Admin is Logged in
When  Admin Clicks on the Batch menu from the header
Then Admin should be in the Manage Batch Page

#Feature: Batch Page Validation
Scenario:  Validate Title in Batch Page
Given  Admin is Logged in
When Admin Clicks on the Batch menu from the header
Then Admin should see the LMS-Learning Management System Title

Scenario:  Validate "heading" in the Batch Page
Given  Admin is Logged in
When Admin Clicks on the Batch menu from the header
Then Admin should see the Manage Batch Heading

Scenario:  Validate disabled "Delete Icon" under the header in the Batch Page
Given  Admin is Logged in
When Admin Clicks on the Batch menu from the header
Then Admin should see the disabled Delete Icon under the header

Scenario:  Validate edit icon in each data rows
Given  Admin is Logged in
When Admin Clicks on the Batch menu from the header
Then Admin should see the edit icon in each row
Scenario:  validate delete icon in each data rows
Given  Admin is on the Dashboard Page
When Admin Clicks on the Batch menu from the header
Then Admin should see the delete icon in each row

Scenario:  validate checkbox in each data rows
Given  Admin is on the Dashboard Page
When Admin Clicks on the Batch menu from the header
Then Admin should see the checkbox in each row

Scenario:  Validate "Checkbox" in the Datatable header row
Given  Admin is on the Dashboard Page
When Admin Clicks on the Batch menu from the header
Then Admin should see the checkbox  in the datatable header row

#Scenario:  Validate "sort icon" next to all the datatable header
#Given  Admin is on the Dashboard Page
#When Admin Clicks on the Batch menu from the header
#Then Admin should see the sort icon next to all Datatable headers
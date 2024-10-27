Feature: Edit Class Details

Background: Admin Is on the Manage class page after login

  Scenario: Validate row level edit icon
    Given Admin is on the Manage Class page
    When Admin clicks on the edit icon
    Then A new pop up with class details appears
    
   Scenario: Check disabled batch name
    Given Admin is on the Manage Class page
    When Admin clicks on the edit icon 
    Then Admin should see batch name field is disabled
    
    Scenario: Check disabled class topic
    Given Admin is on the Manage Class page
    When Admin clicks on the edit icon 
    Then Admin should see class topic field is disabled
    
    Scenario: Check if all the fields are updated with valid data
    Given Admin is on the Edit Class Popup window
    When Update the fields with valid data and click save
    Then Admin gets message class details updated Successfully and see the updated values in data table
    
    Scenario: Check if only the mandatory fields are updated with valid data
    Given Admin is on the Edit Class Popup window
    When Update the fields with valid data and click save
    Then Admin gets message class details updated Successfully and see the updated values in data table
    
    Scenario: Validate Cancel button on Edit popup
    Given Admin is on the Edit Class Popup window
    When Admin clicks Cancel button on edit popup
    Then Admin can see the class details popup disappears
    
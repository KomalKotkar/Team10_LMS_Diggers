Feature: Delete Class Details feature

Background: Admin is on the Manage Class page after login

  Scenario: Validate row level delete icon
    Given Admin is on the Manage class page
    When Admin clicks the delete icon of particular row
    Then Admin should see a alert open with heading Confirm along with YES and NO button for deletion

    Scenario: Click Yes on deletion window
    Given Admin is on Confirm Deletion alert
    When Admin clicks yes option
    Then Admin gets a message Successful Class Deleted alert and do not see that Class in the data table
    
    Scenario: Click No on deletion window
    Given Admin is on Confirm Deletion alert
    When Admin clicks No option
    Then Admin can see the deletion alert disappears without deleting
    
    Scenario: Validate Close X icon on Confirm Deletion alert
    Given Admin is on Confirm Deletion alert
    When Admin clicks on close button
    Then Admin can see the deletion alert disappears without any changes
    
    Scenario: Validate Common Delete button enabled after clicking on any checkbox
    Given Admin is in Manage Class page
    When Admin clicks any checkbox in the data table
    Then Admin should see common delete option enabled under header Manage class
    
    Scenario: Validate single class deletion by selecting Single checkbox
    Given Admin is on Confirm Deletion alert
    When Admin clicks YES button on the alert
    Then Admin gets a message Successful Class Deleted alert
    
    Scenario: Validate single class deletion with no button by selecting Single checkbox
    Given Admin is on Confirm Deletion alert
    When Admin clicks No button on the alert
    Then Admin should land on Manage class page and can see the selected class is not deleted from the data table
    
    Scenario: Validate multiple class deletion by selecting multiple check boxes
    Given Admin is on Confirm Deletion alert
    When Admin clicks YES button on the alert
    Then Admin gets a message Successful Class Deleted alert
    
    Scenario: Validate multiple class deletion with no button by selecting multiple check boxes
    Given Admin is on Confirm Deletion alert
    When Admin clicks No button on the alert
    Then Admin should land on Manage class page and can see the selected classs is not deleted from the data table
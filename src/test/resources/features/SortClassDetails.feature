
Feature: Sort Class Details feature

Background: Admin is on the Manage Class page after login

  Scenario: Sort Class by Batch name
    Given Admin is on the Manage class page
    When Admin clicks on the Batchname sort icon
    Then Admin should see Class details are sorted by Batch Name
   
 Scenario: Sort Class by Class topic
    Given Admin is on the Manage class page
    When Admin clicks on the Class topic sort icon
    Then Admin should see Class details are sorted by Class Topic
   
 Scenario: Sort Class by Class Descreption
    Given Admin is on the Manage class page
    When Admin clicks on the Class descreption  sort icon
    Then Admin should see Class details are sorted by Class Descreption
    
  Scenario: Sort Class by Status
    Given Admin is on the Manage class page
    When Admin clicks on the Status sort icon
    Then Admin should see Class details are sorted by Status
     
   Scenario: Sort Class by Class date
    Given Admin is on the Manage class page
    When Admin clicks on the Class Date sort icon
    Then Admin should see Class details are sorted by Class Date
    
   Scenario: Sort Class by staff name
    Given Admin is on the Manage class page
    When Admin clicks on the Staff Name sort icon
    Then Admin should see Class details are sorted by Staff name
    
    #Search box test cases
    
    Scenario: Search class by Batch Name
    Given Admin is on the Manage class page
    When Admin enter the Batch Name in search textbox
    Then Admin should see Class details are searched by Batch Name
    
    Scenario: Search class by Class topic
    Given Admin is on the Manage class page
    When Admin enter the Class topic in search textbox
    Then Admin should see Class details are searched by Class topic
    
    Scenario: Search class by Staff Name
    Given Admin is on the Manage class page
    When Admin enter the Staff Name in search textbox
    Then Admin should see Class details are searched by Staff name
   
   #Pagination button test cases
   
   Scenario: Verify Next page link greater than symbol
    Given Admin is on the Manage class page
    When Admin clicks Next page link on the class table 
    Then Admin should see the next page record on the table with Pagination
    
    Scenario: Verify Last page link double greater than symbol
    Given Admin is on the Manage class page
    When Admin clicks Last page link 
    Then Admin should see the last page record on the table with Next page link are disabled
    
    Scenario: Verify First page link less than symbol
    Given Admin is on the Manage class page
    When Admin clicks First page link
    Then Admin should see the previous page record on the table with pagination
    
    Scenario: Verify Start page link double less than symbol
    Given Admin is on the Manage class page
    When Admin clicks Start page link 
    Then Admin should see the very first page record on the table with Previous page link are disabled
    
    #navigation bar validation on class page
    
    Scenario: alidate Class link on navigation bar
    Given Admin is on the Manage class page
    When Admin clicks on Class link on Manage Class page
    Then Admin is re-directed to class page
    
    Scenario: validate Program button working on navigation bar of class page
    Given Admin is on the Manage class page
    When Admin clicks on Program button on Manage Class page
    Then Admin is re-directed to program page
    
    Scenario: validate logout link on navigation bar
    Given Admin is on the Manage class page
    When Admin clicks on Logout link on Manage class page 
    Then Admin is re-directed to Login page
    
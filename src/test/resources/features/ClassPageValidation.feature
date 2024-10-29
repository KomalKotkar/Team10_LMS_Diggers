
Feature: Class Page Validation Feature

Background: Admin Is on the Dashboard page after login

  Scenario: Validating the manage class text is available in the class page
  	Given Admin Is on the Dashboard page after login
  	When Admin clicks the Class button on Navigation bar
  	Then Admin should see text Manage Class on class page

  Scenario: Validating the Title in the class page
  	Given Admin Is on the Dashboard page after login
  	When Admin clicks the Class button on Navigation bar
  	Then Admin should see the LMS Title
  	
  	Scenario: Validating Search bar in class page
  	Given Admin Is on the Dashboard page after login
  	When Admin clicks the Class button on Navigation bar
  	Then Admin should see the Searchbar in class page
  	
  	Scenario: Validating the all datatable headers in the class page
  	Given Admin Is on the Dashboard page after login
  	When Admin clicks the Class button on Navigation bar
  	Then Admin should see the all datatable headings in the class page  
  	
  	Scenario: Validating the text and pagination icon in the classpage
  	Given Admin Is on the Dashboard page after login
  	When Admin clicks the Class button on Navigation bar
  	Then Admin should see the showing x to y of z entries and enabled pagination controls under the data table
  
  	
  	Scenario: Validate the sort icon of all the field in datatable
  	Given Admin Is on the Dashboard page after login
  	When Admin clicks the Class button on Navigation bar
  	Then Admin should see the Sort icon of all the field in the datatable

  	Scenario: Validating the Delete button under the Manage class
  	Given Admin Is on the Dashboard page after login
  	When Admin clicks the Class button on Navigation bar
  	Then Admin should see the Delete button under the Manage class page header
  	
  	Scenario: Validate the total no of classes in manage class page
  	Given Admin Is on the Dashboard page after login
  	When Admin clicks the Class button on Navigation bar
  	Then Admin should see Total no of classes in below of the data table
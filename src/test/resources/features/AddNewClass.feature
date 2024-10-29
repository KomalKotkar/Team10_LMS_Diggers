
Feature: Add New Class

Background: Admin is on the Manage class page

  Scenario: Validate Class Details Popup window
    Given Admin is on the Manage class page
    When Admin click on add new class under the class menu bar
    Then Admin should see a popup for class details with empty form along with SAVE and CANCEL button and Close Icon button on the top right corner

 Scenario: Validate input fields and their text boxes in Class details form 
    Given Admin is on the Manage class page
    When Admin click on add new class under the class menu bar
    Then Admin should see all input fields and their respective text boxes in the class details window

 #Scenario: Validate class is created only with mandatory fields
    #Given Admin is on the Manage class page
    #Given Admin is on the Class Details Popup window
    #When Admin enters mandatory fields in the form and clicks on save button
    #Then Admin gets message Class added Successfully 
    #Examples: 
    #|				sheetName				|					rowNumber				|
    #|class_mandatory_data		|1												|
    #|class_mandatory_data		|1												|
    #|class_mandatory_data		|2												|
    #
    #
#	Scenario: Check no of classes value added when selecting class dates
    #Given Admin is on the Class Details Popup window
    #When Admin selects class date in date picker
    #Then Admin should see no of class value is added automatically
  #
  #Scenario: Check weekend dates are disabled in calender
    #Given Admin is on the Class Details Popup window
    #When Admin clicks date picker
    #Then Admin should see weekends dates are disabled to select
    #
  #Scenario: Check if class is created when only optional fields are entered with valid data
    #Given Admin is on the Class Details Popup window
    #When Admin skips to add value in mandatory field and enter only the optional field
    #Then Admin should see error message below the test field and the field will be highlighed in red color
    #
  #Scenario: check if class is created when invalid data is entered in all of the fields
    #Given Admin is on the Class Details Popup window
    #When Admin enters invalid data in all of the  fields in the form and clicks on save button
    #Then Admin gets error message and class is not created
    #
   #Scenario: Empty form submission should not work
    #Given Admin is on the Class Popup window
    #When Admin clicks on save button without entering data 
    #Then Admin gets error message below mandatory fields required
#
    #Scenario: Validate Close X icon on class Details form
    #Given Admin is on the Class Popup window
    #When Admin clicks Close X Icon on Admin Details form
    #Then Class Details popup window should be closed without saving
    #
  #Scenario: Validate class is created with all fields values
    #Given Admin is on the Class Details Popup window
    #When Admin enters all values in the form and clicks on save button
    #Then Admin gets message Class added Successfully
    #
  
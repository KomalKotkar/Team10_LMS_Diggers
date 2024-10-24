
Feature: Dashboard page validation

Background: Admin gives the correct LMS portal URL
  
  Scenario: Verify after login Admin lands on dashboard page
    Given Admin is on loginPage
    When Admin enter valid credentials and clicks login button
    Then Admin should see dashboard page
    
  #Scenario: Verify LMS title
    #Given Admin is on loginPage
    #When Admin enter valid credentials and clicks login button
    #Then Admin should see LMS as title
#
#	Scenario: Validate navigation bar text
    #Given Admin is on loginPage
    #When Admin enter valid credentials and clicks login button
    #Then Admin should see correct spelling in navigation bar text
    #
  #Scenario: Validate LMS title has correct spelling and space
    #Given Admin is on loginPage
    #When Admin enter valid credentials and clicks login button
    #Then Admin should see correct spelling and space in LMS title
  #
  #Scenario: Validate alignment for navigation bar
    #Given Admin is on loginPage
    #When Admin enter valid credentials and clicks login button
    #Then Admin should see the navigation bar text on the top right side
    #
    #Scenario: Validate navigation bar order 1st program
    #Given Admin is on loginPage
    #When Admin enter valid credentials and clicks login button
    #Then Admin should see program in the 1st place
    #
    #Scenario: Validate navigation bar order 2nd batch
    #Given Admin is on loginPage
    #When Admin enter valid credentials and clicks login button
    #Then Admin should see batch in the 2nd place
    #
    #Scenario: Validate navigation bar order 3rd class
    #Given Admin is on loginPage
    #When Admin enter valid credentials and clicks login button
    #Then Admin should see class in the 3rd place
    #
    #Scenario: validate navigation bar order 4th logout
    #Given Admin is on loginPage
    #When Admin enter valid credentials and clicks login button
    #Then Admin should see logout in the 4th place
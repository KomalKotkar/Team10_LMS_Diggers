@login
Feature: Login Page
  
  Background: Launching Valid LMS URL
   Given Admin launch the browser
   When Admin gives the correct LMS portal URL
   
  @tag1
  Scenario: Validate login with valid credentials 
    Given Admin is in login Page  
		When Admin enter valid credentials  and clicks login button  
		Then Admin should land on dashboard page ( centre of the page will be empty , menu bar is present)

#Author : Bhagyashri
@login
Feature: Login Page

 #Background: Launching Valid LMS URL
    #Given Admin launches the browser
    #When Admin gives the correct LMS portal URL
#
#	@Login_s1
  #Scenario: Verify the text spelling in the page    
    #Then Admin should see correct spellings in all fields 
#	
#	@Login_s2
  #Scenario: Verify the company logo   
    #Then Admin should see logo on the left side
#	
#	@Login_s3
  #Scenario: Verify application name   
    #Then Admin should see text "LMS - Learning Management System"
#	
#	@Login_s4
  #Scenario: Verify company name   
    #Then Admin should see company name below the app name
#	
#	@Login_s5
  #Scenario: Validate sign in content    
    #Then Admin should see "Please login to LMS application"
#	
#	@Login_s6
  #Scenario: Verify text field is present    
    #Then Admin should see two text fields
#	
#	@Login_s7
  #Scenario: Verify text on the first text field   
    #Then Admin should see "User" in the first text field
#	
#	@Login_s8
  #Scenario: Verify asterisk next to Admin text   
    #Then Admin should see field mandatory * symbol next to Admin text
#	
#	@Login_s9
  #Scenario: Verify text on the second text field    
    #Then Admin should see "Password" in the second text field
#	
#	@Login_s10
  #Scenario: Verify asterisk next to password text    
    #Then Admin should see * symbol next to password text
#	
#	@Login_s11
  #Scenario: Verify the alignment of input field for the login    
    #Then Admin should see input field in the center of the page
#	
#	@Login_s12
  #Scenario: Verify Login button is present    
    #Then Admin should see login button 
#	
#	@Login_s13
  #Scenario: Verify the alignment of the login button    
    #Then Admin should see login button in the center of the page
#	
#	@Login_s14
  #Scenario: Verify input descriptive text in Admin field    
    #Then Admin should see "Admin" in gray color
#	
#	@Login_s15
  #Scenario: Verify input descriptive text in password field   
    #Then Admin should see "Password" in gray color
  #
  #@Login_s16
  #Scenario: Validate login with valid credentials 
  #Given Admin is in login Page  
#	When Admin enter valid credentials  and clicks login button  
#	Then Admin should land on dashboard page ( centre of the page will be empty , menu bar is present)
#	
#	@Login_s17
#	Scenario:  Validate login with invalid credentials   
#	Given Admin is in login Page  
#	When Admin enter invalid credentials  and clicks login button  
#	Then Error message please check Adminname/password
#	
#	@Login_s18
#	Scenario: Validate login credentials with null Adminname    
#	Given Admin is in login Page  
#	When Admin enter value only in password and clicks login button  
#	Then Error message please check Adminname/password
#	
#	@Login_s19
#	Scenario: Validate login credentials with null password   
#	Given Admin is in login Page  
#	When Admin enter value only in Adminname and clicks login button   
#	Then Error message please check Adminname/password
#	
#	@Login_s20
#	Scenario: verify login button action through keyboard   
#	Given Admin is in login Page  
#	When Admin enter valid credentials  and clicks login button through keyboard 
#	Then Admin should land on dashboard page
#	
#	@Login_s21
#	Scenario: verify login button action through mouse    
#	Given Admin is in login Page  
#	When Admin enter valid credentials  and clicks login button through mouse  
#	Then Admin should land on dashboard page
#	
#	@Login_s22
#	Scenario: Verify Admin is able to land on login page    
#	Given Admin launch the browser  
#	When Admin gives the correct LMS portal URL  
#	Then Admin should land on the login page
#	
#	@Login_s23
#	Scenario: Verify Admin is able to land on home page with invalid URL    
#	Given Admin launch the browser  
#	When Admin gives the invalid LMS portal URL  
#	Then Admin should recieve 404 page not found error 
#	
#	@Login_s24
#	Scenario: Verify for broken link    
#	Given Admin launch the browser  
#	When Admin gives the correct LMS portal URL  HTTP response >= 400. 
#	Then the link is broken
#

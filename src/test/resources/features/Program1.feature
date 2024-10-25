#Author: your.email@your.domain.com

@program
Feature: Program page  
  
Background: Admin is logged in to LMS Portal	
  
Scenario:1 Verify that Admin is able to navigate to Program module
Given Admin is on dashboard page after Login	
When Admin clicks "Program" on the navigation bar	
Then Admin should be navigated to Program module

Scenario:2 Verify any broken links on program page
Given Admin is on dashboard page after Login
When Admin clicks "Program" on the navigation bar	
Then Admin should not have any broken links for Program module


Feature: Class Page Validation Feature

Background: Admin Is on the Dashboard page after login

  Scenario: Validating the manage class text is available in the page
  	Given Admin Is on the Dashboard page after login
  	When Admin clicks the Class button on Navigation bar
  	Then Admin should see text Manage Class on class page

  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |

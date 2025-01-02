 
Feature: Login Feature
 Validating the test case of login feature --this is smoke and sanity testing.


  Scenario Outline: Validating login testcase with multiple test case
    Given User is Login page
    When User enters email id"<username>"
    And User enters password"<password>"
    And User clicks on sign in
   

    Examples: 
      | username  | password | 
      |Testing@gmail.com|P23433|
      |Nareshit@gmail.com|P248949|
      |Thvghvbihb@gmail.com|P23433|
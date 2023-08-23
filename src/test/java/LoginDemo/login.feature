

Feature: Login feature using Id and password

  @tag1

 Scenario Outline: Login scenario   
  Given open the browser
  When click on practice link
  And click on login page link
  And enter <username> and <password> 
  And click on submit button
  Then Validate by Capturing the text for login successfully
  
 Examples:
 
 |username|  password|
 |student |  Password123 | 
    

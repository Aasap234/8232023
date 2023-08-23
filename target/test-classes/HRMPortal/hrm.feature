
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag2
  Scenario Outline: Title of your scenario outline
    
    
    Given open the browser "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When user provides username and password
    |username | password |
    | Admin |     admin123 |
    And user click on PIM tab
    And user click on ADD Employee button
    And user enter "<FName>", "<MName>" and "<LName>"
    And user click on SAVE button
    And user move to Employeelist tab
    When user search using "<FName>"
    #And user click on search button
    Then user validates th record found 
    
    

    Examples: 
      | FName  |MName | LName | 
      | fname | mname |lname |
     

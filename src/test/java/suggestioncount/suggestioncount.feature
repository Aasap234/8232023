Feature: Title of your feature
  I want to use this template for my feature file

  @tag2
  Scenario Outline: Title of your scenario outline
    Given open browser URL
    When user search for "<websites>"
    And user search for mobile iphone "<data>"
    And verify the autosuggestioncount
    Then compare the count of both websites

    Examples: 
      | websites      | data |
    | flipkart      | i    |
    | www.amazon.in | i    |

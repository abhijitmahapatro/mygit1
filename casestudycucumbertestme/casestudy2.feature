

Feature: Demoweb shop
  I want to login into demo webshop



  @login
  Scenario Outline: sucessful demowebshop
    Given user clicks on demoweb url
     And user clicks on login button
    When user gives correct credentials like "<email>" and "<password>"
    Then user moves to home page

    Examples: 
      | email              | password     | 
      | pax@gmail.com      |  krish123    | 
      | kish1243@gmail.com |  krish1234   | 

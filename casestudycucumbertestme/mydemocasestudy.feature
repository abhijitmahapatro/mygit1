Feature: Demo Web Shop APP
   user  wants to REGISTER MULTIPLE USERS

  @registration
  Scenario Outline: Sucessful regisration
    Given user is  on demoweb url
    And user clicks on register button
    When user gives correct credentials like "<email>" and "<password>" and "<confirmpassword>" and "<firstname>" and "<lastname>" and "<gender>"
    Then user gets sucessful registration message

    Examples: 
      | gender | email              | password  | confirmpassword | firstname | lastname |
      | Male   | pax@gmail.com    | krish123  | krish123        | krishu    | sinh     |
      | Female | kish1243@gmail.com | krish1234 | krish1234       | paki      | sing     |

Feature: To test registration form

  Scenario: Verification of successful submssion when inputs were correct
    Given user on the registration form
    When user enter the registration form page
    And user enter name
    And user enter address
    And user select gender
    And user select hobbies
    And user select country
    And user select city
    And user enter dob
    Then user click on submit button it should be successful

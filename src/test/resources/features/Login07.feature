Feature: login

  Scenario: view particular user details
    Given User launch Chrome browser
    When User Opens URL "https://lms-sis-demo.sapphirus.in/login"
    And User Enter UserName as "srinivas.test" and PassWord as "Welcome1!"
    Then Click on login
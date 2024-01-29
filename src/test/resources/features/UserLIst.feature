Feature: UserList

  Scenario: View The User List
    Given User open Chrome Browser
    When User Enters URL "https://lms-sis-demo.sapphirus.in/login"
    And User types username as "srinivas.test" and password as "Welcome1!"
    When User click on the User Menu
    Then User Click on the GOButton
    And close the browser

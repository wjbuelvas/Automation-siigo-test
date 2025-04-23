Feature: Add a user with your information
  I as a app need to add a user with your first name and last name because i need save your data

  Scenario: add a new user
    When add a user with first name "wilson" and last name "Buelvas"
    Then response status code is 201
    And the user was saved correctly



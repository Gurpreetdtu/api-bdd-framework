Feature: Authentication API

Scenario: Generate auth token

  Given I have valid auth credentials
  When I send POST request to generate token
  Then status code should be 200
  And token should be generated

  
  Scenario: Get booking by first and last name 
  Given When I enter first name as Gurpreet and last name as Singh 
  Then it should return Https 200 
  And booking id should be returned
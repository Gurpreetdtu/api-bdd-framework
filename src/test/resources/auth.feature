Feature: Authentication API

Scenario: Generate auth token

  Given I have valid auth credentials
  When I send POST request to generate token
  Then status code should be 200
  And token should be generated

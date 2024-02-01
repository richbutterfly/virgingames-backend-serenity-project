Feature: Testing different request on the game application

  Scenario: Verify that jackpotId is Roxor Progressives
    When User sends a GET request to list all GBP data
    Then Verify Jackpot id is Roxor Progressives

  Scenario: Verify all currency are SEK
    When User sends a GET request to list SEK currency
    Then Verify user can get all SEK currency

  Scenario: Verify name of 8th Index is play-dond
    When User sends a GET request to list all GBP data
    Then Verify name of 8th Index is play-dond
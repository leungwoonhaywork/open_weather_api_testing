Feature: Collect the correct data from the API

  @coordinatesTests
  Scenario: Get the city name
    Given I input the longitude and latitude
    When I get the response
    Then I will get the city name

  Scenario: Get a response when coordinates inputted
    Given I input the longitude and latitude
    When I get the response
    Then I will get the response

  Scenario: Find the country the coordinates belongs to
    Given I input the longitude and latitude
    When I get the response
    Then I will find the country it belongs to

  Scenario: Find the timezone of coordinates
    Given I input the longitude and latitude
    When I get the response
    Then I receive the timezone in that city

  Scenario: Check status code equals 200 for the coordinates
    Given I input the longitude and latitude
    When I get the response
    Then I will see the status code

  Scenario: Check base is station for coordinates
    Given I input the longitude and latitude
    When I get the response
    Then I will see the base is station

  Scenario: Check longitude is Between minus 180 and 180 for coordinates input
    Given I input the longitude and latitude
    When I get the response
    Then I will see the valid longitude

  Scenario: Check latitude is Between minus 90 and 90 for coordinates input
    Given I input the longitude and latitude
    When I get the response
    Then I will see the valid latitude

  Scenario: Check if name weather is not empty for coordinates input
    Given I input the longitude and latitude
    When I get the response
    Then I will see the name weather which is not empty

  Scenario: Check if name weather is not empty for coordinates input
    Given I input the longitude and latitude
    When I get the response
    Then I will see the name weather which is not empty

  Scenario: Check is weather name valid from list for coordinates input
    Given I input the longitude and latitude
    When I get the response
    Then I will see the valid weather name

  Scenario: Check if description is empty for coordinates input
    Given I input the longitude and latitude
    When I get the response
    Then I will see the description which is not empty

  Scenario: check degree wind valid for coordinates input
    Given I input the longitude and latitude
    When I get the response
    Then I will see the valid degree wind

  Scenario: Converts wind speed from mph to meters per second for coordinates input
    Given I input the city
    When I get the response
    Then I will see the mph in meters per second for wind speed

  Scenario: Converts wind speed from mps to miles per hour for coordinates input
    Given I input the city
    When I get the response
    Then I will see the mps in miles per hour for wind speed

  Scenario: Converts gust speed from mph to meters per second for coordinates input
    Given I input the city
    When I get the response
    Then I will see the mph in meters per second for gust speed

  Scenario: Converts gust speed from mps to miles per hour
    Given I input the city
    When I get the response
    Then I will see the mps in miles per hour for gust speed

  Scenario: check cloud valid for coordinates input for coordinates input
    Given I input the longitude and latitude
    When I get the response
    Then I will see the valid cloud

  Scenario: Check rain valid with level 1hr between 0 and 320 and 3hr between 0 and 1000 for coordinates input
    Given I input the longitude and latitude
    When I get the response
    Then I will see the valid rain

  Scenario: Check weather name is not null for coordinates input
    Given I input the longitude and latitude
    When I get the response
    Then I will see the weather name which is not null

  Scenario: Check country is two letters for coordinates input
    Given I input the longitude and latitude
    When I get the response
    Then I will see the country with two letters

  Scenario: check city ID bigger then 0 for coordinates input
    Given I input the longitude and latitude
    When I get the response
    Then I will see the city ID

  Scenario: Check if weather ID is between 200 and 804 for coordinates input
    Given I input the longitude and latitude
    When I get the response
    Then I will see the valid weather ID

  Scenario: Check if weather icon file name format is valid for coordinates input
    Given I input the longitude and latitude
    When I get the response
    Then I will see the weather icon file name with valid format

  Scenario: Check pressure between 870 and 1085 for coordinates input
    Given I input the longitude and latitude
    When I get the response
    Then I will see the valid pressure

  Scenario: Check is humidity is valid between 0 and 100 for coordinates input
    Given I input the longitude and latitude
    When I get the response
    Then I will see the valid humidity

  Scenario: Check visibility is between 0 and 100 for coordinates input
    Given I input the longitude and latitude
    When I get the response
    Then I will see the valid visibility

  Scenario: Check if kelvin temperature is between 199 and 330 for coordinates input
    Given I input the longitude and latitude
    When I get the response
    Then I will see the valid kelvin

  Scenario: Check Celsius temperature is valid for coordinates input
    Given I input the longitude and latitude
    When I get the response
    Then I will see the valid Celsius

  Scenario: Check Fahrenheit temperature is valid for coordinates input
    Given I input the longitude and latitude
    When I get the response
    Then I will see the valid Fahrenheit

  Scenario: Check if weather results received today for coordinates input
    Given I input the longitude and latitude
    When I get the response
    Then I will see today date

  Scenario: Check if sunrise data is for today for coordinates input
    Given I input the longitude and latitude
    When I get the response
    Then I will see sunrise with today date

  Scenario: Check if sunset data is for today for coordinates input
    Given I input the longitude and latitude
    When I get the response
    Then I will see the sunset with today date

  Scenario: Check if time zone ranges between minus 12h and plus 14h from UTC for coordinates input
    Given I input the longitude and latitude
    When I get the response
    Then I will see the time zone

  Scenario: check the weather id is valid or not for coordinates input
    Given I input the longitude and latitude
    When I get the response
    Then I will see the valid weather id

  Scenario: check the main must match the corresponding id in weather conditions codes for coordinates input
    Given I input the longitude and latitude
    When I get the response
    Then I will see the weather main

  Scenario: check the description must match the corresponding id in weather conditions codes for coordinates input
    Given I input the longitude and latitude
    When I get the response
    Then I will see the weather description

  Scenario: check the icon must match the corresponding id in weather conditions codes for coordinates input
    Given I input the longitude and latitude
    When I get the response
    Then I will see the weather icon
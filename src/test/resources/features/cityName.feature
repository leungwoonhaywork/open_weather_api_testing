Feature: Collect the correct data from the API

  @cityNameTests
  Scenario: Get a longitude and latitude for city name input
    Given I input the city name
    When I get the response
    Then I will get the longitude and latitude

  Scenario: Get a response when city name inputted
    Given I input the city name
    When I get the response
    Then I will get the response

  Scenario: Find the country the city name belongs to
    Given I input the city name
    When I get the response
    Then I will find the country it belongs to

  Scenario: Find the timezone of a city name
    Given I input the city name
    When I get the response
    Then I receive the timezone in that city

  Scenario: Check status code equals 200 for city name name
    Given I input the city name
    When I get the response
    Then I will see the status code

  Scenario: Check base is station for city name input
    Given I input the city name
    When I get the response
    Then I will see the base is station

  Scenario: Check longitude is Between minus 180 and 180 for city name input
    Given I input the city name
    When I get the response
    Then I will see the valid longitude

  Scenario: Check latitude is Between minus 90 and 90 for city name input
    Given I input the city name
    When I get the response
    Then I will see the valid latitude

  Scenario: Check if name weather is not empty for city name input
    Given I input the city name
    When I get the response
    Then I will see the name weather which is not empty

  Scenario: Check is weather name valid from list for city name input
    Given I input the city name
    When I get the response
    Then I will see the valid weather name

  Scenario: Check if description is empty for city name input
    Given I input the city name
    When I get the response
    Then I will see the description which is not empty

  Scenario: check degree wind valid for city name input
    Given I input the city name
    When I get the response
    Then I will see the valid degree wind

  Scenario: Converts wind speed from mph to meters per second for city name input
    Given I input the city name
    When I get the response
    Then I will see the mph in meters per second for wind speed

  Scenario: Converts wind speed from mps to miles per hour for city name input
    Given I input the city name
    When I get the response
    Then I will see the mps in miles per hour for wind speed

  Scenario: Converts gust speed from mph to meters per second for city name input
    Given I input the city name
    When I get the response
    Then I will see the mph in meters per second for gust speed

  Scenario: Converts gust speed from mps to miles per hour for city name input
    Given I input the city name
    When I get the response
    Then I will see the mps in miles per hour for gust speed

  Scenario: check cloud valid for city name input
    Given I input the city name
    When I get the response
    Then I will see the valid cloud

  Scenario: Check rain valid with level 1hr between 0 and 320 and 3hr between 0 and 1000 for city name input
    Given I input the city name
    When I get the response
    Then I will see the valid rain

  Scenario: Check weather name is not null for city name input
    Given I input the city name
    When I get the response
    Then I will see the weather name which is not null

  Scenario: Check country is two letters for city name input
    Given I input the city name
    When I get the response
    Then I will see the country with two letters

  Scenario: Check city name ID bigger then 0 for city name input
    Given I input the city name
    When I get the response
    Then I will see the city ID

  Scenario: Check if weather ID is between 200 and 804 for city name input
    Given I input the city name
    When I get the response
    Then I will see the valid weather ID

  Scenario: Check if weather icon file name format is valid for city name input
    Given I input the city name
    When I get the response
    Then I will see the weather icon file name with valid format

  Scenario: Check pressure between 870 and 1085 for city name input
    Given I input the city name
    When I get the response
    Then I will see the valid pressure

  Scenario: Check is humidity is valid between 0 and 100 for city name input
    Given I input the city name
    When I get the response
    Then I will see the valid humidity

  Scenario: Check visibility is between 0 and 100 for city name input
    Given I input the city name
    When I get the response
    Then I will see the valid visibility

  Scenario: Check if kelvin temperature is between 199 and 330 for city name input
    Given I input the city name
    When I get the response
    Then I will see the valid kelvin

  Scenario: Check Celsius temperature is valid for city name input
    Given I input the city name
    When I get the response
    Then I will see the valid Celsius

  Scenario: Check Fahrenheit temperature is valid for city name input
    Given I input the city name
    When I get the response
    Then I will see the valid Fahrenheit

  Scenario: Check if weather results received today for city name input
    Given I input the city name
    When I get the response
    Then I will see today date

  Scenario: Check if sunrise data is for today for city name input
    Given I input the city name
    When I get the response
    Then I will see sunrise with today date

  Scenario: Check if sunset data is for today for city name input
    Given I input the city name
    When I get the response
    Then I will see the sunset with today date

  Scenario: Check if time zone ranges between minus 12h and plus 14h from UTC for city name input
    Given I input the city name
    When I get the response
    Then I will see the time zone

  Scenario: Check the weather id is valid or not for city name input
    Given I input the city name
    When I get the response
    Then I will see the valid weather id

  Scenario: check the main must match the corresponding id in weather conditions codes for city name input
    Given I input the city name
    When I get the response
    Then I will see the weather main

  Scenario: check the description must match the corresponding id in weather conditions codes for city name input
    Given I input the city name
    When I get the response
    Then I will see the weather description

  Scenario: check the icon must match the corresponding id in weather conditions codes for city name input
    Given I input the city name
    When I get the response
    Then I will see the weather icon

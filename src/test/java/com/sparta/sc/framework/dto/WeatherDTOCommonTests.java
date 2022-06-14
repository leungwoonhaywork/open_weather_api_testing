package com.sparta.sc.framework.dto;

import com.sparta.sc.framework.Injector;
import com.sparta.sc.utilities.SpeedConverter;
import com.sparta.sc.utilities.TemperatureConverter;
import org.junit.jupiter.api.*;

import static com.sparta.sc.framework.ConnectionManager.getConnection;
import static com.sparta.sc.framework.ConnectionManager.getConnectionCNSCCC;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WeatherDTOCommonTests {

    WeatherDTO response;

    @BeforeEach
    void setup() {

        // 1: GET RESPONSE BY CITY NAME
        // 2: GET RESPONSE BY LON AND LAT
        // 3: GET RESPONSE BY CITY ID
        // 4: GET RESPONSE BY ZIP, COUNTRY CODE
        // 5: GER RESPONSE BY CITY NAME, STATE CODE AND COUNTRY CODE

        int choice = 5;

        switch (choice) {
            case 1:
                response = Injector.injectDTO(getConnection("London"));
                break;
            case 2:
                response = Injector.injectDTO(getConnection("-75.4557", "43.2128"));
                break;
            case 3:
                response = Injector.injectDTO(getConnection(2643743));
                break;
            case 4:
                response = Injector.injectDTO(getConnection(94040,"us"));
                break;
            case 5:
                response = Injector.injectDTO(getConnectionCNSCCC("Henderson", "TX", "US"));

        }
    }

    @Test
    @DisplayName("check response is not null")
    void checkResponseIsNotNull() {
        Assertions.assertNotNull(response);
    }

    @Test
    @DisplayName("check status is ok")
    void checkStatusIsOk() {
        Assertions.assertTrue(response.isStatusCode200());
    }

    @Test
    @DisplayName("Check base is station")
    void checkBaseIsStation() {
        Assertions.assertEquals("stations", response.getBase());
    }

    @Test
    @DisplayName("Longitude is Between minus 180 and 180")
    void longitudeIsBetweenMinus180And180() {
        Assertions.assertTrue(response.isLonValid());
    }

    @Test
    @DisplayName("Longitude is Between minus 90 and 90")
    void longitudeIsBetweenMinus90And90() {
        Assertions.assertTrue(response.isLatValid());
    }

    @Test
    @DisplayName("Check if name weather is not empty")
    void checkIfNameWeatherIsNotEmpty() {
        Assertions.assertFalse(response.isNameWeatherEmpty());
    }

    @Test
    @DisplayName("Check weather name is not null")
    void checkWeatherNameIsNotNull() {
        Assertions.assertFalse(response.isNameNull());
    }

    @Test
    @DisplayName("Check is weather name valid from list")
    void checkIsWeatherNameValidFromList() {
        Assertions.assertTrue(response.isNameWeatherValid());
    }

    @Test
    @DisplayName("Check if description is not empty")
    void checkIfDescriptionIsNotEmpty() {
        Assertions.assertFalse(response.isDescriptionEmpty());
    }

    @Test
    @DisplayName("Check wind degrees between 0 and 360")
    void checkWindDegreesBetween0And360() {
        Assertions.assertTrue(response.isDegreeWindValid());
    }

    @Test
    @DisplayName("Converts wind speed from mph to metres per second")
    void convertsWindSpeedFromMphToMetresPerSecond() {
        double windInMps = SpeedConverter.mphToMps(response.getWind().getSpeed());
        assertEquals(windInMps, response.getWindInMps());
    }

    @Test
    @DisplayName("Converts wind speed from mps to miles per hour")
    void convertsWindSpeedFromMpsToMilesPerHour() {
        double windInMph = SpeedConverter.mpsToMph(response.getWind().getSpeed());
        assertEquals(windInMph, response.getWindInMph());
    }

    @Test
    @DisplayName("Converts gust speed from mph to metres per second")
    void convertsGustSpeedFromMphToMetresPerSecond() {
        assertEquals(response.getWind().getGust() / 2.237, response.getGustInMps());
    }

    @Test
    @DisplayName("Converts gust speed from mps to miles per hour")
    void convertsGustSpeedFromMpsToMilesPerHour() {
        assertEquals(response.getWind().getGust() * 2.237, response.getGustInMph());
    }

    @Test
    @DisplayName("Check cloud level between 0 and 100")
    void checkCloudLevelBetween0And100() {
        // not all the calls return clouds
        Assumptions.assumeTrue(response.isCloudValid());
    }

    @Test
    @DisplayName("Check rain is valid")
    void checkRainIsValid() {
        // not all responses contain rain
        Assumptions.assumeTrue(response.isRainValid());
    }

    @Test
    @DisplayName("Check snow is valid")
    void checkSnowIsValid() {
        // not all responses contain snow
        Assumptions.assumeTrue(response.isSnowValid());
    }

    @Test
    @DisplayName("Check if country has two letters")
    void checkIfCountryHasTwoLetters() {
        Assertions.assertTrue(response.isCountryTwoLetters());
    }

    @Test
    @DisplayName("Check city id is greater than zero")
    void checkCityIdIsGreaterAndEqualToZero() {
        Assertions.assertTrue(response.isCityIdBiggerAndEqualToO());
    }

    @Test
    @DisplayName("Check if weather ID is between 200 and 804")
    void checkIfWeatherIdIsBetween200And804() {
        Assertions.assertTrue(response.isWeatherIDValid());
    }

    @Test
    @DisplayName("Check if weather icon file name format is valid")
    void checkIfWeatherIconFileNameFormatIsValid() {
        Assertions.assertTrue(response.isIconValid());
    }

    @Test
    @DisplayName("Check pressure between 870 and 1085")
    void checkPressureBetween870And1085() {
        Assertions.assertTrue(response.isPressureValid());
    }

    @Test
    @DisplayName("Check is humidity is valid between 0 and 100")
    void checkIsHumidityIsValidBetween0And100() {
        assertTrue(response.isHumidityValid());
    }

    @Test
    @DisplayName("Check visibility is between 0 and 100")
    void checkVisibilityIsBetween0And100() {
        Assertions.assertTrue(response.isVisibilityValid());
    }

    @Test
    @DisplayName("Check if default kelvin temperature is between 199 and 330")
    void checkIfDefaultKelvinTemperatureIsBetween199And330() {
        Assertions.assertTrue(response.isKelvinValid());
    }

    @Test
    @DisplayName("Check celsius temperature is valid")
    void checkCelsiusTemperatureIsValid() {
        double tempInCelsius = TemperatureConverter.ConvertKelvinToCelsius(response.getMain().getTemp());
        Assertions.assertTrue(response.isCelsiusValid(tempInCelsius));
    }

    @Test
    @DisplayName("Check fahrenheit temperature is valid")
    void checkFahrenheitTemperatureIsValid() {
        double tempInFahrenheit = TemperatureConverter.ConvertKelvinToFahreinheit(response.getMain().getTemp());
        Assertions.assertTrue(response.isFahreinheitValid(tempInFahrenheit));
    }

    @Test
    @DisplayName("Check if date is today")
    void checkIfDateIsToday() {
        Assertions.assertTrue(response.isDateToday());
    }

    @Test
    @DisplayName("Check if sunrise is today")
    void checkIfSunriseIsToday() {
        Assertions.assertTrue(response.isSunriseToday());
    }

    @Test
    @DisplayName("Check if sunset is today")
    void checkIfSunsetIsToday() {
        Assertions.assertTrue(response.isSunsetToday());
    }

    @Test
    @DisplayName("Check if timezone is in range")
    void checkIfTimezoneIsInRange() {
        Assertions.assertTrue(response.isTimezoneInRange());
    }

    @Test
    @DisplayName("check id is in the weather condition id list")
    void checkIDIsValid() {
        Assertions.assertTrue(response.checkIDValid());
    }

    @Test
    @DisplayName("check the main must match the corresponding ID in weather condition codes")
    void checkMainMatchCorrespondingID() {
        Assertions.assertTrue(response.checkMainMatchTheID());
    }

    @Test
    @DisplayName("check the description must match the corresponding ID in weather condition codes")
    void checkDescriptionMatchCorrespondingID() {
        Assertions.assertTrue(response.checkDescriptionMatchTheID());
    }

    @Test
    @DisplayName("check the icon must match the corresponding ID in weather condition codes")
    void checkIconMatchCorrespondingID() {
        Assertions.assertTrue(response.checkIconMatchTheID());
    }

}

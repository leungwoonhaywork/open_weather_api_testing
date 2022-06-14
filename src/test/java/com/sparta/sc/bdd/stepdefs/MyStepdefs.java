package com.sparta.sc.bdd.stepdefs;

import com.sparta.sc.framework.ConnectionManager;
import com.sparta.sc.bdd.Miami;
import com.sparta.sc.framework.dto.WeatherDTO;
import com.sparta.sc.framework.Injector;
import com.sparta.sc.utilities.SpeedConverter;
import com.sparta.sc.utilities.TemperatureConverter;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.net.http.HttpResponse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class MyStepdefs {
    private WeatherDTO weatherDTO;
    HttpResponse connection;



    @Given("I input the city")
    public void iInputTheCity() {
        connection = ConnectionManager.getConnection(Miami.cityName);
    }

    @Given("I input the city id")
    public void iInputTheCityId() {
        connection = ConnectionManager.getConnection(Miami.cityId);
    }

    @Given("I input the city name")
    public void iInputTheCityName() {
        connection = ConnectionManager.getConnectionCNSCCC(Miami.cityName, Miami.stateCode, Miami.countryCode);
    }

    @Given("I input the longitude and latitude")
    public void iInputTheLongitudeAndLatitude() {
        connection = ConnectionManager.getConnection(Miami.lon, Miami.lat);
    }

    @Given("I input the zipcode")
    public void iInputTheZipcode() {
        connection = ConnectionManager.getConnection(Miami.zipCode, Miami.countryCode);
    }

    @When("I get the response")
    public void iGetTheResponse() {
        weatherDTO = Injector.injectDTO(connection);
    }

    @Then("I will get the longitude and latitude")
    public void iWillGetTheLongitudeAndLatitude() {
        Assertions.assertEquals(Double.parseDouble(Miami.lon), weatherDTO.getCoord().getLon());
        Assertions.assertEquals(Double.parseDouble(Miami.lat), weatherDTO.getCoord().getLat());
    }

    @Then("I will get the city name")
    public void iWillGetTheCityName() {
        Assertions.assertEquals(Miami.cityName, weatherDTO.getName());
    }

    @Then("I will get the response")
    public void iWillGetTheResponse() {
        Assertions.assertNotNull(weatherDTO);
    }

    @Then("I will find the country it belongs to")
    public void iWillFindTheCountryItBelongsTo() {
        Assertions.assertEquals(Miami.countryCode, weatherDTO.getSys().getCountry());
    }

    @Then("I receive the timezone in that city")
    public void iReceiveTheTimezoneInThatCity() {
        Assertions.assertEquals(Miami.timeZone, weatherDTO.getTimezone());
    }

    @Then("I will see the valid weather id")
    public void iWillSeeTheValidWeatherId() {
        Assertions.assertTrue(weatherDTO.checkIDValid());
    }

    @Then("I will see the weather main")
    public void iWillSeeTheWeatherMain() {
        Assertions.assertTrue(weatherDTO.checkMainMatchTheID());
    }

    @Then("I will see the weather description")
    public void iWillSeeTheWeatherDescription() {
        Assertions.assertTrue(weatherDTO.checkDescriptionMatchTheID());
    }

    @Then("I will see the weather icon")
    public void iWillSeeTheWeatherIcon() {
        Assertions.assertTrue(weatherDTO.checkIconMatchTheID());
    }

    @Then("I will see the valid degree wind")
    public void iWillSeeTheValidDegreeWind() {
        Assertions.assertTrue(weatherDTO.isDegreeWindValid());
    }

    @Then("I will see the mph in meters per second for wind speed")
    public void iWillSeeTheMphInMetersPerSecondForWindSpeed() {
        double windInMps = SpeedConverter.mphToMps(weatherDTO.getWind().getSpeed());
        Assertions.assertEquals(windInMps, weatherDTO.getWindInMps());
    }

    @Then("I will see the mps in miles per hour for wind speed")
    public void iWillSeeTheMpsInMilesPerHourForWindSpeed() {
        double windInMph = SpeedConverter.mpsToMph(weatherDTO.getWind().getSpeed());
        Assertions.assertEquals(windInMph, weatherDTO.getWindInMph());
    }

    @Then("I will see the mph in meters per second for gust speed")
    public void iWillSeeTheMphInMetersPerSecondForGustSpeed() {
        Assertions.assertEquals(weatherDTO.getWind().getGust() / 2.237, weatherDTO.getGustInMps());
    }

    @Then("I will see the mps in miles per hour for gust speed")
    public void iWillSeeTheMpsInMilesPerHourForGustSpeed() {
        Assertions.assertEquals(weatherDTO.getWind().getGust() * 2.237, weatherDTO.getGustInMph());
    }

    @Then("I will see the valid cloud")
    public void iWillSeeTheValidCloud() {
        Assertions.assertTrue(weatherDTO.isCloudValid());
    }

    @Then("I will see the country with two letters")
    public void iWillSeeTheCountryWithTwoLetters() {
        Assertions.assertTrue(weatherDTO.isCountryTwoLetters());
    }

    @Then("I will see the status code")
    public void iWillSeeTheStatusCode() {
        Assertions.assertTrue(weatherDTO.isStatusCode200());
    }

    @Then("I will see the city ID")
    public void iWillSeeTheCityID() {
        Assertions.assertTrue(weatherDTO.isCityIdBiggerAndEqualToO());
    }

    @Then("I will see the base is station")
    public void iWillSeeTheBaseIsStation() {
        Assertions.assertEquals("stations", weatherDTO.getBase());
    }

    @Then("I will see the valid longitude")
    public void iWillSeeTheValidLongitude() {
        Assertions.assertTrue(weatherDTO.isLonValid());
    }

    @Then("I will see the valid latitude")
    public void iWillSeeTheValidLatitude() {
        Assertions.assertTrue(weatherDTO.isLatValid());
    }

    @Then("I will see the name weather which is not empty")
    public void iWillSeeTheNameWeatherWhichIsNotEmpty() {
        Assertions.assertFalse(weatherDTO.isNameWeatherEmpty());
    }

    @Then("I will see the valid weather name")
    public void iWillSeeTheValidWeatherName() {
        Assertions.assertTrue(weatherDTO.isNameWeatherValid());
    }

    @Then("I will see the description which is not empty")
    public void iWillSeeTheDescriptionWhichIsNotEmpty() {
        Assertions.assertFalse(weatherDTO.isDescriptionEmpty());
    }

    @Then("I will see the valid rain")
    public void iWillSeeTheValidRain() {
        Assertions.assertTrue(weatherDTO.isDegreeWindValid());
    }

    @Then("I will see the weather name which is not null")
    public void iWillSeeTheWeatherNameWhichIsNotNull() {
        Assertions.assertFalse(weatherDTO.isNameNull());
    }

    @Then("I will see the valid weather ID")
    public void iWillSeeTheValidWeatherID() {
        Assertions.assertTrue(weatherDTO.isWeatherIDValid());
    }

    @Then("I will see the weather icon file name with valid format")
    public void iWillSeeTheWeatherIconFileNameWithValidFormat() {
        Assertions.assertTrue(weatherDTO.isIconValid());
    }

    @Then("I will see the valid pressure")
    public void iWillSeeTheValidPressure() {
        Assertions.assertTrue(weatherDTO.isPressureValid());
    }

    @Then("I will see the valid humidity")
    public void iWillSeeTheValidHumidity() {
        assertTrue(weatherDTO.isHumidityValid());
    }

    @Then("I will see the valid visibility")
    public void iWillSeeTheValidVisibility() {
        Assertions.assertTrue(weatherDTO.isVisibilityValid());
    }

    @Then("I will see the valid kelvin")
    public void iWillSeeTheValidKelvin() {
        Assertions.assertTrue(weatherDTO.isKelvinValid());
    }

    @Then("I will see today date")
    public void iWillSeeTodayDate() {
        Assertions.assertTrue(weatherDTO.isDateToday());
    }

    @Then("I will see sunrise with today date")
    public void iWillSeeSunriseWithTodayDate() {
        Assertions.assertTrue(weatherDTO.isSunriseToday());
    }

    @Then("I will see the sunset with today date")
    public void iWillSeeTheSunsetWithTodayDate() {
        Assertions.assertTrue(weatherDTO.isSunsetToday());
    }

    @Then("I will see the time zone")
    public void iWillSeeTheTimeZone() {
        Assertions.assertTrue(weatherDTO.isTimezoneInRange());
    }

    @Then("I will see the valid Celsius")
    public void iWillSeeTheValidCelsius() {
        double tempInCelsius = TemperatureConverter.ConvertKelvinToCelsius(weatherDTO.getMain().getTemp());
        Assertions.assertTrue(weatherDTO.isCelsiusValid(tempInCelsius));
    }

    @Then("I will see the valid Fahrenheit")
    public void iWillSeeTheValidFahrenheit() {
        double tempInFahrenheit = TemperatureConverter.ConvertKelvinToFahreinheit(weatherDTO.getMain().getTemp());
        Assertions.assertTrue(weatherDTO.isFahreinheitValid(tempInFahrenheit));
    }
}

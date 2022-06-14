package com.sparta.sc.framework.dto;

import com.sparta.sc.framework.Injector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.sparta.sc.framework.ConnectionManager.getConnection;

public class WeatherDTOByCityTests {

    WeatherDTO response;
    String city = "London";

    @BeforeEach
    void setup() {
        response = Injector.injectDTO(getConnection("London"));
    }

    @Test
    @DisplayName("Check city is same as entered")
    void checkCityIsSameAsEntered() {
        Assertions.assertTrue(response.isSameCity(city));
    }
}

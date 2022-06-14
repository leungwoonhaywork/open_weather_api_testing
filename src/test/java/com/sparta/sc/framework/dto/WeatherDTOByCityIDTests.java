package com.sparta.sc.framework.dto;

import com.sparta.sc.framework.Injector;

import org.junit.jupiter.api.*;

import static com.sparta.sc.framework.ConnectionManager.getConnection;


public class WeatherDTOByCityIDTests {

    private WeatherDTO response;

    private int cityId = 8084;

    @BeforeEach
    void setup() {
        response = Injector.injectDTO(getConnection(cityId));
    }

    @Test
    @DisplayName("Is city id same as entered")
    void isCityIdSameAsEntered() {
        Assertions.assertTrue(response.isSameCityId(cityId));
    }
}

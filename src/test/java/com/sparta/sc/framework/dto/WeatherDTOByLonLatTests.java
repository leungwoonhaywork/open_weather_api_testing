package com.sparta.sc.framework.dto;

import com.sparta.sc.framework.Injector;
import org.junit.jupiter.api.*;

import static com.sparta.sc.framework.ConnectionManager.getConnection;

public class WeatherDTOByLonLatTests {

    private WeatherDTO response;
    private String lon = "-75.4557";
    private String lat = "43.2128";

    @BeforeEach
    void setup() {
        response = Injector.injectDTO(getConnection(lon, lat));
    }

    @Test
    @DisplayName("Is lon same as entered")
    void isLonSameAsEntered() {
        Assertions.assertTrue(response.isSameLon(lon));
    }

    @Test
    @DisplayName("Is lat same as entered")
    void isLatSameAsEntered() {
        Assertions.assertTrue(response.isSameLat(lat));
    }

}

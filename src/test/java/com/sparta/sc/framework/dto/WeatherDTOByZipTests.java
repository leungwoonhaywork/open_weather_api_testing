package com.sparta.sc.framework.dto;

import com.sparta.sc.framework.Injector;
import org.junit.jupiter.api.*;

import static com.sparta.sc.framework.ConnectionManager.getConnection;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WeatherDTOByZipTests {
    private WeatherDTO response;
    private int Zip= 94040;
    private String CountryCode= "us";

    @BeforeEach
    void setup() {
        response = Injector.injectDTO(getConnection(Zip, CountryCode));
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
}

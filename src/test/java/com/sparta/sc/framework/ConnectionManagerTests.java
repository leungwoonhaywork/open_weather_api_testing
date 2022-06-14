package com.sparta.sc.framework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.net.http.HttpResponse;

import static com.sparta.sc.framework.ConnectionManager.*;

public class ConnectionManagerTests {

    HttpResponse<String> response = null;

    String[] headerKeys = new String[]{"server", "date", "content-type", "content-length", "connection", "x-cache-key", "access-control-allow-origin", "access-control-allow-credentials", "access-control-allow-methods"};

    @BeforeEach
    void setup() {

        // 1: GET RESPONSE BY CITY NAME
        // 2: GET RESPONSE BY LON AND LAT
        // 3: GET RESPONSE BY CITY ID
        // 4: GET RESPONSE BY ZIP, COUNTRY CODE
        int choice = 2;
        switch (choice) {
            case 1:
                response = getConnection("london");
                break;
            case 2:
                response = getConnection("-122.08", "37.39");
                break;
            case 3:
                response = getConnection(8084);
                break;
            case 4:
                response = getConnection(94040, "us");
                break;
        }
    }

    @Test
    @DisplayName("test url is not empty")
    void testUrlIsNotEmpty() {
        Assertions.assertNotEquals("", getUrl());
    }

    @Test
    @DisplayName("test get connection return response")
    void testGetConnectionReturnResponse() {
        Assertions.assertNotNull(response);
    }

    @Test
    @DisplayName("test get status code return a number")
    void testGetStatusCodeReturnANumber() {
        Assertions.assertNotNull(getStatusCode());
    }

    @Test
    @DisplayName("test get status code is ok")
    void testGetStatusCodeIsOk() {
        Assertions.assertEquals(200, getStatusCode());
    }

    @Test
    @DisplayName("test headers are not null or contain empty values")
    void testHeadersAreNotNullOrContainEmptyValues() {
        for(String headerKey : headerKeys){
            Assertions.assertFalse(getHeader(headerKey).equals("") && getHeader(headerKey) == null);
        }
    }

    @Test
    @DisplayName("test get body is not null")
    void testGetBodyIsNotNull() {
        Assertions.assertNotNull(getBody());
    }
}

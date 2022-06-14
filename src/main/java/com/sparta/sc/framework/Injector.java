package com.sparta.sc.framework;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.sc.framework.dto.WeatherDTO;

import java.io.IOException;
import java.net.http.HttpResponse;

public class Injector {
    public static WeatherDTO injectDTO(HttpResponse<String> response){
        WeatherDTO weatherDTO = new WeatherDTO();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            weatherDTO = objectMapper.readValue(response.body(), WeatherDTO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return weatherDTO;
    }
}

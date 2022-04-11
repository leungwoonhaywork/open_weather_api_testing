package com.sparta.sc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.sc.DTO.WeatherDTO;

import java.io.IOException;

public class Injector {
    public WeatherDTO injectDTO(String url){
        WeatherDTO weatherDTO = new WeatherDTO();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            weatherDTO = objectMapper.readValue(ConnectionManager.getConnectionResponse().body(), WeatherDTO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return weatherDTO;
    }
}

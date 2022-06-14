package com.sparta.sc.framework.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class WeatherConditionCodes {
    public static List<WeatherConditionDTO> getWeatherCondition() {
        List<WeatherConditionDTO> weatherConditionDTOList = new ArrayList<>();

        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"200", "Thunderstorm", "thunderstorm with light rain", "11d"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"201", "Thunderstorm", "thunderstorm with rain", "11d"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"202", "Thunderstorm", "thunderstorm with heavy rain", "11d"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"210", "Thunderstorm", "light thunderstorm", "11d"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"211", "Thunderstorm", "thunderstorm", "11d"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"212", "Thunderstorm", "heavy thunderstorm", "11d"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"221", "Thunderstorm", "ragged thunderstorm", "11d"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"230", "Thunderstorm", "thunderstorm with light drizzle", "11d"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"231", "Thunderstorm", "thunderstorm with drizzle", "11d"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"232", "Thunderstorm", "thunderstorm with heavy drizzle", "11d"}));

        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"300", "Drizzle", "light intensity drizzle", "09d"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"301", "Drizzle", "drizzle", "09d"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"302", "Drizzle", "heavy intensity drizzle", "09d"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"310", "Drizzle", "light intensity drizzle rain", "09d"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"311", "Drizzle", "drizzle rain", "09d"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"312", "Drizzle", "heavy intensity drizzle rain", "09d"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"313", "Drizzle", "shower rain and drizzle", "09d"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"314", "Drizzle", "heavy shower rain and drizzle", "09d"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"321", "Drizzle", "shower drizzle", "09d"}));

        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"500", "Rain", "light rain", "10d"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"501", "Rain", "moderate rain", "10d"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"502", "Rain", "heavy intensity rain", "10d"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"503", "Rain", "very heavy rain", "10d"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"504", "Rain", "extreme rain", "10d"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"511", "Rain", "freezing rain", "13d"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"520", "Rain", "light intensity shower rain", "09d"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"521", "Rain", "shower rain", "09d"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"522", "Rain", "heavy intensity shower rain", "09d"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"531", "Rain", "ragged shower rain", "09d"}));

        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"600", "Snow", "light snow", "13d"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"601", "Snow", "Snow", "13d"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"602", "Snow", "Heavy snow", "13d"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"611", "Snow", "Sleet", "13d"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"612", "Snow", "Light shower sleet", "13d"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"613", "Snow", "Shower sleet", "13d"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"615", "Snow", "Light rain and snow", "13d"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"616", "Snow", "Rain and snow", "13d"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"620", "Snow", "Light shower snow", "13d"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"621", "Snow", "Shower snow", "13d"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"622", "Snow", "Heavy shower snow", "13d"}));

        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"701", "Mist", "light snow", "50d"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"711", "Smoke", "Snow", "50d"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"721", "Haze", "Heavy snow", "50d"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"731", "Dust", "Sleet", "50d"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"741", "Fog", "Light shower sleet", "50d"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"751", "Sand", "Shower sleet", "50d"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"761", "Dust", "Light rain and snow", "50d"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"762", "Ash", "Rain and snow", "50d"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"771", "Squall", "Light shower snow", "50d"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"781", "Tornado", "Shower snow", "50d"}));

        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"800", "Clear", "clear sky", "01d", "01n"}));

        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"801", "Clouds", "few clouds", "02d", "02n"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"802", "Clouds", "scattered clouds", "03d", "03n"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"803", "Clouds", "broken clouds", "04d", "04n"}));
        weatherConditionDTOList.add(new WeatherConditionDTO(new String[]{"804", "Clouds", "overcast clouds", "04d", "04n"}));

        return weatherConditionDTOList;
    }

    public static Stream<WeatherConditionDTO> getWeatherConditionStream() {
        return getWeatherCondition().stream();
    }
}

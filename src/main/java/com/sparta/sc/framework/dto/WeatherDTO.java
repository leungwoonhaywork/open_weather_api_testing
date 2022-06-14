package com.sparta.sc.framework.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sparta.sc.utilities.SpeedConverter;
import com.sparta.sc.utilities.TimeConverter;

import static com.fasterxml.jackson.annotation.JsonInclude.*;

public class WeatherDTO {

    private static List<WeatherConditionDTO> weatherConditionDTOList = new ArrayList<>();

    private static final String[] weatherNames = new String[]{"Thunderstorm", "Drizzle", "Rain", "Snow", "Mist", "Smoke", "Haze", "Dust", "Fog", "Sand", "Dust", "Ash", "Squall", "Tornado", "Clear", "Clouds"};

    @JsonProperty("visibility")
    private int visibility;

    @JsonProperty("timezone")
    private int timezone;

    @JsonProperty("main")
    private Main main;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("clouds")
    private Clouds clouds;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("rain")
    private Rain rain;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("snow")
    private Snow snow;

    @JsonProperty("sys")
    private Sys sys;

    @JsonProperty("dt")
    private int dt;

    @JsonProperty("coord")
    private Coord coord;

    @JsonProperty("weather")
    private List<WeatherItem> weather;

    @JsonProperty("name")
    private String name;

    @JsonProperty("cod")
    private int cod;

    @JsonProperty("id")
    private int id;

    @JsonProperty("base")
    private String base;

    @JsonProperty("wind")
    private Wind wind;

    public int getVisibility() {
        return visibility;
    }

    public int getTimezone() {
        return timezone;
    }

    public Main getMain() {
        return main;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public Rain getRain() {
        return rain;
    }

    public Snow getSnow() {
        return snow;
    }

    public Sys getSys() {
        return sys;
    }

    public int getDt() {
        return dt;
    }

    public Coord getCoord() {
        return coord;
    }

    public List<WeatherItem> getWeather() {
        return weather;
    }

    public String getName() {
        return name;
    }

    public int getCod() {
        return cod;
    }

    public int getId() {
        return id;
    }

    public String getBase() {
        System.out.println(base);
        return base;
    }

    public Wind getWind() {
        return wind;
    }

    //Ryan
    public boolean checkIDValid() {
        return WeatherConditionCodes.getWeatherConditionStream().anyMatch(weatherCondition -> weatherCondition.getId() == getWeather().get(0).getId());
    }

    public boolean checkMainMatchTheID() {
        boolean isMatch = false;
        weatherConditionDTOList = WeatherConditionCodes.getWeatherCondition();
        for (int i = 0; i < weatherConditionDTOList.size(); i++) {
            if (weatherConditionDTOList.get(i).getId() == getWeather().get(0).getId()) {
                if (weatherConditionDTOList.get(i).getMain().equals(getWeather().get(0).getMain())) {
                    isMatch = true;
                }
            }
        }
        return isMatch;
    }

    public boolean checkDescriptionMatchTheID() {
        boolean isMatch = false;
        weatherConditionDTOList = WeatherConditionCodes.getWeatherCondition();
        for (int i = 0; i < weatherConditionDTOList.size(); i++) {
            if (weatherConditionDTOList.get(i).getId() == getWeather().get(0).getId()) {
                if (weatherConditionDTOList.get(i).getDescription().equals(getWeather().get(0).getDescription())) {
                    isMatch = true;
                }
            }
        }
        return isMatch;
    }

    public boolean checkIconMatchTheID() {
        boolean isMatch = false;
        weatherConditionDTOList = WeatherConditionCodes.getWeatherCondition();
        for (int i = 0; i < weatherConditionDTOList.size(); i++) {
            if (weatherConditionDTOList.get(i).getId() == getWeather().get(0).getId()) {
                if (weatherConditionDTOList.get(i).getIcon().length == 1) {
                    if (weatherConditionDTOList.get(i).getIcon()[0].equals(getWeather().get(0).getIcon())) {
                        isMatch = true;
                    }
                } else {
                    if (weatherConditionDTOList.get(i).getIcon()[0].equals(getWeather().get(0).getIcon()) || weatherConditionDTOList.get(i).getIcon()[1].equals(getWeather().get(0).getIcon())) {
                        isMatch = true;
                    }
                }
            }
        }
        return isMatch;
    }

    //SimWeatherDTO
    // check if the lon is the same we passed as a parameter
    public boolean isSameLon(String lon) {
        return Double.parseDouble(lon) == getCoord().getLon();
    }

    // check if the lat is the same we passed as a parameter
    public boolean isSameLat(String lat) {
        return Double.parseDouble(lat) == getCoord().getLat();
    }

    public boolean isSameCityId(int cityId){
        return cityId == getId();
    }

    public boolean isSameCity(String city) {
        return getName().equals(city);
    }

    public boolean isSameCountryCode(String country){
        return getSys().getCountry().equalsIgnoreCase(country);
    }

    public boolean isLonValid() {
        return getCoord().getLon() >= -180 && getCoord().getLon() <= 180;
    }

    public boolean isLatValid() {
        return getCoord().getLon() >= -90 && getCoord().getLon() <= 90;
    }

    public boolean isNameWeatherEmpty() {
        return getWeather().get(0).getMain().equals("");
    }

    public boolean isNameWeatherValid() {
        return Arrays.stream(weatherNames).anyMatch(name -> name.equals(getWeather().get(0).getMain()));
    }

    public boolean isDescriptionEmpty() {
        return getWeather().get(0).getDescription().equals("");
    }

    public boolean isDegreeWindValid() {
        return getWind().getDeg() >= 0 && getWind().getDeg() <= 360;
    }

    public double getWindInMps() {
        return SpeedConverter.mphToMps(getWind().getSpeed());
    }

    public double getWindInMph() {
        return SpeedConverter.mpsToMph(getWind().getSpeed());
    }

    public double getGustInMps() {
        return SpeedConverter.mphToMps(getWind().getGust());
    }

    public double getGustInMph() {
        return SpeedConverter.mpsToMph(getWind().getGust());
    }

    public boolean isCloudValid() {
        if(getClouds()!=null){
            return getClouds().getAll() >= 0 && getClouds().getAll() <= 100;
        } return false;
    }

    public boolean isRainValid(){
        if(getRain()!=null){
            return getRain().getJsonMember1h()>= 0 && getRain().getJsonMember1h() <= 320 || getRain().getJsonMember3h() >= 0 && getRain().getJsonMember3h() <= 1000;
        } return false;
    }

    public boolean isSnowValid(){
        if(getSnow()!=null){
            return getSnow().getJsonMember1h()>= 0 && getSnow().getJsonMember1h() <= 107 || getSnow().getJsonMember3h() >= 0 && getSnow().getJsonMember3h() <= 320;
        } return false;
    }

    public boolean isNameEmpty() {
        return getName().equals("");
    }

    public boolean isNameNull() {
        return getName() == null;
    }

    public boolean isCountryTwoLetters() {
        return getSys().getCountry().matches("[A-Za-z]{2}");
    }

    public boolean isStatusCode200() {
        return getCod() == 200;
    }

    public boolean isCityIdBiggerAndEqualToO() {
        return getId() >= 0;
    }

    //WeatherDTOM
    public boolean isWeatherIDValid() {
        return getWeather().get(0).getId() >= 200 && getWeather().get(0).getId() <= 804;
    }

    public boolean isIconValid() {
        return getWeather().get(0).getIcon().matches("\\d{2}[d|n]");
    }

    public boolean isPressureValid() {
        return getMain().getPressure() >= 870 && getMain().getPressure() <= 1085;

    }

    public boolean isHumidityValid() {
        return getMain().getHumidity() >= 0 && getMain().getHumidity() <= 100;
    }

    public boolean isVisibilityValid() {
        return getVisibility() >= 0 && getVisibility() <= 10000;
    }

    public boolean isCelsiusValid(double celsius) {
        double cel = celsius;
        return cel >= -74 && cel <= 56.7;
    }

    public boolean isFahreinheitValid(double fahreinheit) {
        double fah = fahreinheit;
        return fah >= -101.2 && fah <= 135;
    }

    public boolean isKelvinValid() {
        return getMain().getTemp() >= 199 && getMain().getTemp() <= 330;
    }

    //WeatherDTOSim2
    public boolean isDateToday() {
        return LocalDate.now().equals(TimeConverter.epochToLocalDate(getDt()));
    }

    public boolean isSunriseToday() {
        return LocalDate.now().equals(TimeConverter.epochToLocalDate(getSys().getSunrise()));
    }

    public boolean isSunsetToday() {
        return LocalDate.now().equals(TimeConverter.epochToLocalDate(getSys().getSunset()));
    }

    public boolean isTimezoneInRange() {
        // timezone range goes from -12h to +14h
        // -12h = -43200sec
        // +14h = 50400sec
        return getTimezone() >= -43200 && getTimezone() <= 50400;
    }

}
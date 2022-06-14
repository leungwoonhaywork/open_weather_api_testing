package com.sparta.sc.framework;

import com.sparta.sc.PropertiesLoader;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

public class ConnectionManager {

    private static String key = PropertiesLoader.getProperties().getProperty("key");

    private static HttpResponse response = null;

    private static final String BASEURL = "https://api.openweathermap.org/data/2.5/weather?";
    private static String url = "";


    public static String getUrl() {
        return url;
    }

    public static HttpResponse<String> getConnection(String city) {
        url = BASEURL + "q=" + city + "&appid=" + key;
        return getResponse();
    }

    public static HttpResponse<String> getConnection(String lon, String lat) {
        url = BASEURL + "lon=" + lon + "&lat=" + lat + "&appid=" + key;
        return getResponse();
    }

    public static HttpResponse<String> getConnection(int cityiD){
        String iD = String.valueOf(cityiD);
        url = BASEURL + "id=" + iD + "&appid=" + key;
        return getResponse();
    }

    public static HttpResponse<String> getConnectionCNSCCC(String cityName, String stateCode, String countryCode){
        url = BASEURL + "q=" + cityName + "," + stateCode + "," + countryCode + "&appid=" + key;
        return getResponse();
    }
    public static HttpResponse<String> getConnection(int Zip, String CountryCode){
        url = BASEURL + "zip=" + Zip + "," + CountryCode + "&appid=" + key;
        return getResponse();
    }

    private static HttpResponse<String> getResponse() {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(getUrl()))
                .build();
        response = null;
        try {
            response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return response;
    }
    public static HttpResponse<String> getConnectionResponse() {
        return getResponse();
    }

    public static Integer getStatusCode() {
        return response.statusCode();
    }

    public static String getHeader(String key) {
        return response.headers().allValues(key).get(0);
    }

    public static Object getBody() {
        return response.body();
    }

}

package com.sparta.sc;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConnectionManager {
    private static final String BASEURL = "https://api.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=97c6edb288230b9ed8dcbd4680220d4f";

    public static String getConnection() {
        getResponse();
        return BASEURL;
    }

    private static HttpResponse<String> getResponse() {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(getConnection())).build();
        HttpResponse<String> httpResponse = null;
        try {
            httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return httpResponse;
    }

    public static HttpResponse<String> getConnectionResponse() {
        return getResponse();
    }
}
package com.sparta.sc.framework.dto;

public class WeatherConditionDTO {
    private int id;
    private String main;
    private String description;
    private String[] icon;

    public WeatherConditionDTO(int id, String main, String description, String[] icon) {
        this.id = id;
        this.main = main;
        this.description = description;
        this.icon = icon;
    }

    public WeatherConditionDTO(String[] weatherCondition) {
        this.id = Integer.parseInt(weatherCondition[0]);
        this.main = weatherCondition[1];
        this.description = weatherCondition[2];
        if (weatherCondition.length <= 4) {
            this.icon = new String[1];
            this.icon[0] = weatherCondition[3];
        }
        else {
            this.icon = new String[2];
            this.icon[0] = weatherCondition[3];
            this.icon[1] = weatherCondition[4];
        }
    }

    public int getId() {
        return id;
    }

    public String getMain() {
        return main;
    }

    public String getDescription() {
        return description;
    }

    public String[] getIcon() {
        return icon;
    }
}

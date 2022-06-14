package com.sparta.sc.framework.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Sys{

	@JsonProperty("country")
	private String country;

	@JsonProperty("sunrise")
	private int sunrise;

	@JsonProperty("sunset")
	private int sunset;

	@JsonProperty("id")
	private int id;

	@JsonProperty("type")
	private int type;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("message")
	private double message;

	public String getCountry(){
		return country;
	}

	public int getSunrise(){
		return sunrise;
	}

	public int getSunset(){
		return sunset;
	}

	public int getId(){
		return id;
	}

	public int getType(){
		return type;
	}

	public double getMessage(){
		return message;
	}
}
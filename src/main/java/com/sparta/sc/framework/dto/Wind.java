package com.sparta.sc.framework.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Wind{

	@JsonProperty("deg")
	private int deg;

	@JsonProperty("speed")
	private double speed;

	@JsonIgnore
	@JsonProperty("gust")
	private double gust;

	public int getDeg(){
		return deg;
	}

	public double getSpeed(){
		return speed;
	}

	public double getGust() {
		return gust;
	}


}
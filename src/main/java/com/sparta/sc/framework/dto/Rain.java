package com.sparta.sc.framework.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Rain {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("1h")
    private double jsonMember1h;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("3h")
    private double jsonMember3h;

    public double getJsonMember1h() {
        return jsonMember1h;
    }

    public double getJsonMember3h() {
        return jsonMember3h;
    }


}
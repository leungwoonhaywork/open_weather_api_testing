package com.sparta.sc.utilities;

import io.cucumber.java.hu.De;

import java.text.DecimalFormat;

import static com.sparta.sc.utilities.Formatter.df;

public class TemperatureConverter {



    public static double CovertCelsiusToFahreinheit(double celsius){
        double Fahreinheit = Double.parseDouble(df.format((celsius * 9 / 5) + 32));
        return Fahreinheit;
    }

    public static double CovertCelsiusToKelvin(double celsius){
        double kelvin = Double.parseDouble(df.format(celsius + 273.15));
        return kelvin;
    }

    public static double CovertFahreinheitToCelsius(double fahreinheit){
        double celsius = Double.parseDouble(df.format((fahreinheit - 32) * 5 / 9));
        return celsius;
    }

    public static double ConvertFahreinheitToKelvin(double fahreinheit){
        double  kelvin = Double.parseDouble(df.format((fahreinheit - 32) * 5 / 9 + 273.15)) ;
        return kelvin;
    }

    public static double ConvertKelvinToCelsius(double kelvin){
        double Celsius = Double.parseDouble(df.format(kelvin - 273.15));
        return Celsius;
    }

    public static double ConvertKelvinToFahreinheit(double kelvin){
        double Fahreinheit = Double.parseDouble(df.format((kelvin - 273.15) * 9 / 5 + 32));
        return Fahreinheit;
    }

}

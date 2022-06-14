package com.sparta.sc.utilities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import com.sparta.sc.utilities.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtilityTests {

    @Nested
    @DisplayName("SpeedTests")
    class speedTests{
        @Test
        @DisplayName("Convert mph to mps")
        void convertMphToMps() {
            assertEquals(SpeedConverter.mphToMps(2237),1000);
        }

        @Test
        @DisplayName("Convert mps to mph")
        void convertMpsToMph() {
            assertEquals(SpeedConverter.mpsToMph(1000),2237);
        }
    }
    
    @Nested
    @DisplayName("TemperatureConverter")
    class TemperatureTests{
        @Test
        @DisplayName("Convert Celsius To Fahreinheit")
        void convertCelsiusToFahreinheit() {
            assertEquals(TemperatureConverter.CovertCelsiusToFahreinheit(3),37.4);
        }

        @Test
        @DisplayName("Convert Celsius To Kelvin")
        void convertCelsiusToKelvin() {
            assertEquals(TemperatureConverter.CovertCelsiusToKelvin(32),305.15);
        }

        @Test
        @DisplayName("Convert Fahreinheit To Celsius")
        void convertFahreinheitToCelsius() {
            assertEquals(TemperatureConverter.CovertFahreinheitToCelsius(32),0);
        }

        @Test
        @DisplayName("Convert Fahreinheit To Kelvin")
        void convertFahreinheitToKelvin() {
            assertEquals(TemperatureConverter.ConvertFahreinheitToKelvin(332),439.82);
        }

        @Test
        @DisplayName("Convert Kelvin To Celsius")
        void convertKelvinToCelsius() {
            assertEquals(TemperatureConverter.ConvertKelvinToCelsius(332), 58.85);

        }

        @Test
        @DisplayName("Convert Kelvin To Fahreinheit")
        void convertKelvinToFahreinheit() {
            Assertions.assertEquals(TemperatureConverter.ConvertKelvinToFahreinheit(332),137.93);
        }
    }

}

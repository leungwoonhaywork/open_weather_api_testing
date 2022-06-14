package com.sparta.sc.utilities;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import static java.time.ZoneId.SHORT_IDS;

public class TimeConverter {

    public static LocalDate epochToLocalDate(int time){
        return LocalDate.ofInstant(Instant.ofEpochSecond(time), ZoneId.of(SHORT_IDS.get("CST")));
    }

    public static long localDateToEpoch(LocalDate localDate){
        return localDate.toEpochDay();
    }
}

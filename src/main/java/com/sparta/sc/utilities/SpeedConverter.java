package com.sparta.sc.utilities;

import java.text.DecimalFormat;

import static com.sparta.sc.utilities.Formatter.df;

public class SpeedConverter {



    public static double mpsToMph(double mps) {
        double mph = Double.parseDouble(df.format(mps * 2.237));
        return mph;
    }

    public static double mphToMps(double mph) {
        double mps = Double.parseDouble(df.format(mph / 2.237));
        return mps;
    }

}




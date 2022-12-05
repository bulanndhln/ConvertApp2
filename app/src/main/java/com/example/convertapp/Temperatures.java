package com.example.convertapp;

import android.content.Context;

public class Temperatures {

    private Context context;

    public Temperatures(Context context) {
        this.context = context;
    }

    /**
     * CELCIUS
     **/
    // formula conversion celcius to reamur
    public String CelciusToReamur(double celcius) {
        // R = (4/5) x C  atau R = C x 0,8 */
        double R = (4.0 / 5.0) * celcius;
        return check_after_decimal_point(R);
    }

    // formula conversion celcius to fahrenheit
    public String CelciusToFahrenheit(double celcius) {
        // F = (9/5) x C + 32 atau F = C x 1.8 + 32
        double F = (9.0 / 5.0) * celcius + 32;
        return check_after_decimal_point(F);
    }

    // formula conversion celcius to kelvin
    public String CelciusToKelvin(double celcius) {
        double K = celcius + 273.15;
        return check_after_decimal_point(K);
    }

    /**
     * REAMUR
     **/
    // R to C
    public String ReamurToCelcius(double reamur) {
        // rumus : R = C / 0,8
        double C = reamur / 0.8;
        return check_after_decimal_point(C);
    }

    // R to F
    public String ReamurToFahrenheit(double reamur) {
        // rumus : F = R x 2,25 + 32
        double F = reamur * 2.25 + 32;
        return check_after_decimal_point(F);
    }

    // R to K
    public String ReamurToKelvin(double reamur) {
        // rumus : K = R / 0,8 + 273,15
        double K = reamur / 0.8 + 273.15;
        return check_after_decimal_point(K);
    }

    /**
     * Fahrenheit
     **/
    // F to C
    public String FahrenheitToCelcius(double fahrenheit) {
        // rumus : C = (F - 32) / 1,8
        double C = (fahrenheit - 32) / 1.8;
        return check_after_decimal_point(C);
    }

    // F to R
    public String FahrenheitToReamur(double fahrenheit) {
        // rumus : R = (F - 32) / 0,44
        double R = (fahrenheit - 32) / 0.44;
        return check_after_decimal_point(R);
    }

    // F to K
    public String FahrenheitToKelvin(double fahrenheit) {
        // rumus : K = (F + 459,67) / 1,8
        double K = (fahrenheit + 459.67) / 1.8;
        return check_after_decimal_point(K);
    }
    /**
     * Kelvin
     **/
    // F to C
    public String KelvinToCelcius(double kelvin) {
        // rumus : C = (F - 32) / 1,8
        double C = kelvin - 273;
        return check_after_decimal_point(C);
    }

    // F to R
    public String KelvinToReamur(double kelvin) {
        // rumus : R = (F - 32) / 0,44
        double R = (kelvin - 273) / 0.8;
        return check_after_decimal_point(R);
    }

    // F to K
    public String KelvinToFahrenheit(double kelvin) {
        // rumus : K = (F + 459,67) / 1,8
        double K = ((kelvin - 273 )/ 1.8 ) + 32;
        return check_after_decimal_point(K);
    }
    //check after decimal point
    public String check_after_decimal_point(double decimal) {
        String result = null;
        String[] after_point = String.valueOf(decimal).split("[:.]");
        if (after_point[after_point.length - 1].equals("0")) {
            result = after_point[0];
        } else {
            result = String.valueOf(decimal).replace(".", ",");
        }
        return result;
    }

    /**
     * GET FORMULA
     **/
    public String getFormula(String symbol1, String symbol2, double value_to_conversion, String result) {
        String results = null;
        // C to R
        if (symbol1.equals("\u00B0C") && symbol2.equals("\u00B0R")) {
            results = symbol2 + "  =  " + symbol1 + "  x  0,8\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  0,8\n" + symbol2 + "  =  " + result;
        }
        // C to F
        else if (symbol1.equals("\u00B0C") && symbol2.equals("\u00B0F")) {
            results = symbol2 + "  =  " + symbol1 + "  x  1,8  +  32\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  1,8  +  32\n" + symbol2 + "  =  " + result;
        }
        // C to K
        else if (symbol1.equals("\u00B0C") && symbol2.equals("\u00B0K")) {
            results = symbol2 + "  =  " + symbol1 + "  +  273,15\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  +  273,15\n" + symbol2 + "  =  " + result;
        }
        // R to C
        else if (symbol1.equals("\u00B0R") && symbol2.equals("\u00B0C")) {
            results = symbol2 + "  =  " + symbol1 + "  /  0,8\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  0,8\n" + symbol2 + "  =  " + result;
        }
        // R to F
        else if (symbol1.equals("\u00B0R") && symbol2.equals("\u00B0F")) {
            results = symbol2 + "  =  " + symbol1 + "  x  2,25  +  32\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion) + "  x  2,25  +  32\n" + symbol2 + "  =  " + result;
        }
        // R to K
        else if (symbol1.equals("\u00B0R") && symbol2.equals("\u00B0K")) {
            results = symbol2 + "  =  " + symbol1 + "  /  0,8  +  273,15\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion)
                    + "  /  0,8  +  273,15\n" + symbol2 + "  =  " + result;
        }
        // F to C
        else if (symbol1.equals("\u00B0F") && symbol2.equals("\u00B0C")) {
            results = symbol2 + "  =  (" + symbol1 + "  -  32)  /  1,8\n" + symbol2
                    + "  =  (" + check_after_decimal_point(value_to_conversion) + "  -  32)  /  1,8\n" + symbol2 + "  =  " + result;
        }
        // F to R
        else if (symbol1.equals("\u00B0F") && symbol2.equals("\u00B0R")) {
            results = symbol2 + "  =  (" + symbol2 + "  -  32)  /  0,44\n" + symbol2
                    + "  =  (" + check_after_decimal_point(value_to_conversion) + "  -  32)  /  0,44\n" + symbol2 + "  =  " + result;
        }
        // F to K K = (fahrenheit + 459.67) / 1.8
        else if (symbol1.equals("\u00B0F") && symbol2.equals("\u00B0K")) {
            results = symbol2 + "  =  (" + symbol2 + "  +  459,67)  /  1,8\n" + symbol2
                    + "  =  (" + check_after_decimal_point(value_to_conversion) + "  +  459,68)  /  1,8\n" + symbol2 + "  =  " + result;
        }
        // K to C
        else if (symbol1.equals("\u00B0K") && symbol2.equals("\u00B0C")) {
            results = symbol2 + "  =  " + symbol1 + "  -  273\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion) + "  -  273\n" + symbol2 + "  =  " + result;
        }
        // K to R
        else if (symbol1.equals("\u00B0K") && symbol2.equals("\u00B0R")) {
            results = symbol2 + "  =  (" + symbol2 + "  -  273)  /  0,8\n" + symbol2
                    + "  =  (" + check_after_decimal_point(value_to_conversion) + "  -  273)  /  0,8\n" + symbol2 + "  =  " + result;
        }
        // K to F
        else if (symbol1.equals("\u00B0K") && symbol2.equals("\u00B0F")) {
            results = symbol2 + "  =  ((" + symbol2 + "  -  273)  /  1,8)  +  32\n" + symbol2
                    + "  =  ((" + check_after_decimal_point(value_to_conversion) + "  -  273)  /  1,8)  +  32  \n" + symbol2 + "  =  " + result;
        }
        return results;
    }
}

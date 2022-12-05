package com.example.convertapp;

import android.content.Context;

public class Moneys {
    private Context context;

    public Moneys(Context context) {
        this.context = context;
    }

    /**
     * RUPIAH
     **/
    // formula conversion Rp to $
    public String RptoUsd(double rp) {
        // 1 Rp = 0.000064257 USD
        //1 USD = 15.562,50 rp
        double usd =  rp/15562.50 ;
        return check_after_decimal_point(usd);
    }

    // formula conversion Rp to €
    public String RptoEuro(double rp) {
        //1 EURO = 16.345,30 Rp
        double euro = rp/16345.30 ;
        return check_after_decimal_point(euro);
    }

    // formula conversion Rp to £
    public String RptoPoundsterling(double rp) {
        // Poundsterling = 18849.46 Rp
        double pounds = rp / 18849.46;
        return check_after_decimal_point(pounds);
    }
    // formula conversion Rp to ¥
    public String RptoYen(double rp) {
        // Poundsterling = 113,94 Rp
        double yen = rp / 113.94;
        return check_after_decimal_point(yen);
    }

    /**
     * USD
     **/
    // formula conversion Usd to RP
    public String UsdtoRp(double usd) {
        // Rp = 0.000065 usd
        double Rp = usd * 15414.05;
        return check_after_decimal_point(Rp);
    }

    // formula conversion Usd to €
    public String UsdtoEuro(double usd) {
        double Euro = usd *0.95;
        return check_after_decimal_point(Euro);
    }

    // formula conversion Usd to £
    public String UsdtoPounds(double usd) {
        double pounds = usd * 0.82;
        return check_after_decimal_point(pounds);
    }
    // formula conversion Usd to ¥
    public String UsdtoYen(double usd) {
        // rumus : K = R / 0,8 + 273,15
        double yen = usd * 134.13;
        return check_after_decimal_point(yen);
    }

    /**
     * EURO
     **/
    // formula conversion Euro to RP
    public String EurotoRp(double euro) {
        double Rp = euro * 16210.25 ;
        return check_after_decimal_point(Rp);
    }

    // formula conversion Euro to $
    public String EurotoUsd(double euro) {
        double Usd = euro * 1.05;
        return check_after_decimal_point(Usd);
    }

    // formula conversion Euro to £
    public String EurotoPounds(double euro ) {
        double Pounds = euro * 0.86;
        return check_after_decimal_point(Pounds);
    }

    // formula conversion Euro to ¥
    public String EurotoYen(double euro) {
        double Yen = euro * 141.13;
        return check_after_decimal_point(Yen);
    }
    /**
     * POUNDSTERLING
     **/
    // formula conversion Poundsterling to Rp
    public String PoundstoRp(double pounds) {
        double Rp = pounds * 18894.66;
        return check_after_decimal_point(Rp);
    }

    // formula conversion Poundsterling to Usd
    public String PoundstoUsd(double pounds) {
        double Usd = pounds * 1.23;
        return check_after_decimal_point(Usd);
    }

    // formula conversion Poundsterling to Euro
    public String PoundtoEuro(double pounds) {
        double Euro = pounds * 1.17;
        return check_after_decimal_point(Euro);
    }

    // formula conversion poundsterling to ¥
    public String PoundtoYen(double pounds) {
        double Yen = pounds * 164.44;
        return check_after_decimal_point(Yen);
    }

    /**
     * YEN
     **/
    // formula conversion Yen to Rp
    public String YentoRp(double yen) {
        double Rp = yen *114.90;
        return check_after_decimal_point(Rp);
    }

    // formula conversion Yen to Usd
    public String YentoUsd(double yen) {
        double Usd = yen * 0.0075;
        return check_after_decimal_point(Usd);
    }

    // formula conversion Yen to Euro
    public String YentoEuro(double yen) {
        // rumus : K = R / 0,8 + 273,15
        double Euro = yen * 0.0071;
        return check_after_decimal_point(Euro);
    }

    // formula conversion Yen to Poundsterling
    public String YentoPounds(double yen) {
        double Pounds = yen * 0.0061;
        return check_after_decimal_point(Pounds);
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
        //RP to USD
        if (symbol1.equals("Rupiah") && symbol2.equals("Dollar")) {
            results = symbol2 + "  =  " + symbol1 + "  /  15562,50\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  15562,50\n" + symbol2 + "  =  " + result;
        }
        //RP to Euro
        else if (symbol1.equals("Rupiah") && symbol2.equals("Euro")) {
            results = symbol2 + "  =  " + symbol1 + "  /  16345,30\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  16345,30\n" + symbol2 + "  =  " + result;
        }
        //Rupiah to Poundsterling
        else if (symbol1.equals("Rupiah") && symbol2.equals("Poundsterling")) {
            results = symbol2 + "  =  " + symbol1 + "  /  18849,46\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  18849,46\n" + symbol2 + "  =  " + result;
        }
        //Rupiah to Yen
        else if (symbol1.equals("Rupiah") && symbol2.equals("Yen")) {
            results = symbol2 + "  =  " + symbol1 + "  /  113,94\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion)
                    + "  /  113,94\n" + symbol2 + "  =  " + result;
        }

        // Usd to Rupiah
        else if (symbol1.equals("Dollar") && symbol2.equals("Rupiah")) {
            results = symbol2 + "  =  " + symbol1 + "  X  15414,05\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  X  15414,05\n" + symbol2 + "  =  " + result;
        }
        // Usd to Euro
        else if (symbol1.equals("Dollar") && symbol2.equals("Euro")) {
            results = symbol2 + "  =  " + symbol1 + "  X  0,95\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion) + "  X  0,95\n" + symbol2 + "  =  " + result;
        }
        //Usd to Poundsterling
        else if (symbol1.equals("Dollar") && symbol2.equals("Poundsterling")) {
            results = symbol2 + "  =  " + symbol1 + "  X  0,82\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion) + "  X  0,82\n" + symbol2 + "  =  " + result;
        }
        // Usd to Yen
        else if (symbol1.equals("Dollar") && symbol2.equals("Yen")) {
            results = symbol2 + "  =  " + symbol1 + "  X  134,13\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion)
                    + "  X  134,13\n" + symbol2 + "  =  " + result;
        }
        // Ero to Rupiah
        else if (symbol1.equals("Euro") && symbol2.equals("Rupiah")) {
            results = symbol2 + "  =  (" + symbol1 + "  X  16210,258\n" + symbol2
                    + "  =  (" + check_after_decimal_point(value_to_conversion) + "  *  16210,25\n" + symbol2 + "  =  " + result;
        }
        // Euro to Usd
        else if (symbol1.equals("Euro") && symbol2.equals("Dollar")) {
            results = symbol2 + "  =  " + symbol2 + "  X  1,05\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion) + "  *  1,05\n" + symbol2 + "  =  " + result;
        }
        // Euro to Poundsterling
        else if (symbol1.equals("Euro") && symbol2.equals("Poundsterling")) {
            results = symbol2 + "  =  " + symbol1 + "  X  0,86\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion) + "  X  0,86\n" + symbol2 + "  =  " + result;
        }
        // Euro to Yen
        else if (symbol1.equals("Euro") && symbol2.equals("Yen")) {
            results = symbol2 + "  =  " + symbol2 + "  X  141,13\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion) + "  x  141,13\n" + symbol2 + "  =  " + result;
        }
        // Poundsterling to Rupiah
        else if (symbol1.equals("Poundsterling") && symbol2.equals("Rupiah")) {
            results = symbol2 + "  =  " + symbol1 + "  X  18894,66\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion) + "  X  18894,66\n" + symbol2 + "  =  " + result;
        }
        // Poundsterling to Dollar
        else if (symbol1.equals("Poundsterling") && symbol2.equals("Dollar")) {
            results = symbol2 + "  =  " + symbol2 + "  X  1,23\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion) + "  X  1,23\n" + symbol2 + "  =  " + result;
        }
        // Poundsteling to Euro
        else if (symbol1.equals("Poundsterling") && symbol2.equals("Euro")) {
            results = symbol2 + "  =  " + symbol1 + "  X  1,17\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion) + "  X  1,17\n" + symbol2 + "  =  " + result;
        }
        // Poundsterling to Yen
        else if (symbol1.equals("Poundsterling") && symbol2.equals("Yen")) {
            results = symbol2 + "  =  " + symbol2 + "  X  164,44\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion) + "  X  164,44\n" + symbol2 + "  =  " + result;
        }
        // Yen to Rupiah
        else if (symbol1.equals("Yen") && symbol2.equals("Rupiah")) {
            results = symbol2 + "  =  " + symbol1 + "  X  114,90\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion) + "  X  114,90\n" + symbol2 + "  =  " + result;
        }
        // Yen to Usd
        else if (symbol1.equals("Yen") && symbol2.equals("Dollar")) {
            results = symbol2 + "  =  " + symbol2 + "  X  0,0075\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion) + "  X  0,0075\n" + symbol2 + "  =  " + result;
        }
        // Yen to Euro
        else if (symbol1.equals("Yen") && symbol2.equals("Euro")) {
            results = symbol2 + "  =  " + symbol2 + "  X  0,0071\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion) + "  X  0.0071\n" + symbol2 + "  =  " + result;
        }
        // Yen to Poundsterling
        else if (symbol1.equals("Yen") && symbol2.equals("Poundsterling")) {
            results = symbol2 + "  =  " + symbol1 + "  X  0.0061\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion) + "  X  0.0061\n" + symbol2 + "  =  " + result;
        }

        return results;
    }
}

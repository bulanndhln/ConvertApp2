package com.example.convertapp;

import android.content.Context;
public class Distances {
    private Context context;

    public Distances(Context context) {
        this.context = context;
    }

    /**
     * KILOMETER
     **/
    // formula conversion KM to HM
    public String KmtoHm(double km) {
        double hm =  km * 10;
        return check_after_decimal_point(hm);
    }

    // formula conversion KM to DAM
    public String KmtoDam(double km) {
        double dam = km * 100;
        return check_after_decimal_point(dam);
    }

    // formula conversion KM to M
    public String KmtoM(double km) {
        double m = km * 1000;
        return check_after_decimal_point(m);
    }
    // formula conversion KM to DM
    public String KmtoDm(double km) {
        double dm = km * 10000;
        return check_after_decimal_point(dm);
    }

    // formula conversion KM to CM
    public String KmtoCm(double km) {
        double cm = km * 100000;
        return check_after_decimal_point(cm);
    }

    // formula conversion KM to MM
    public String KmtoMm(double km) {
        double mm = km * 1000000 ;
        return check_after_decimal_point(mm);
    }

    /**
     * HEKTOMETER
     **/
    // HM to KM
    public String HmtoKm(double hm) {
        double km = hm / 10;
        return check_after_decimal_point(km);
    }

    //HM to DAM
    public String HmtoDam(double hm) {
        double dam = hm * 10;
        return check_after_decimal_point(dam);
    }

    // HM to M
    public String HmtoM(double hm) {
        double m = hm * 100;
        return check_after_decimal_point(m);
    }
    // HM to DM
    public String HmtoDm(double hm) {
        double dm = hm * 1000;
        return check_after_decimal_point(dm);
    }

    // HM to CM
    public String HmtoCm(double hm) {
        double cm = hm * 10000;
        return check_after_decimal_point(cm);
    }

    // HM to MM
    public String HmtoMm(double hm) {
        double mm = hm * 100000;
        return check_after_decimal_point(mm);
    }
    /**
     * DEKAMETER
     **/
    // DAM to KM
    public String DamtoKm(double dam) {
        double km = dam / 100;
        return check_after_decimal_point(km);
    }

    // DAM to HM
    public String DamtoHm(double dam) {
        double hm = dam / 10;
        return check_after_decimal_point(hm);
    }

    // DAM to M
    public String DamtoM(double dam) {
        double m = dam * 10;
        return check_after_decimal_point(m);
    }
    // DAM to DM
    public String DamtoDm(double dam) {
        double dm = dam * 100;
        return check_after_decimal_point(dm);
    }

    // DAM to CM
    public String DamtoCm(double dam) {
        double cm = dam * 1000;
        return check_after_decimal_point(cm);
    }

    // DAM to MM
    public String DamtoMm(double dam) {
        double mm = dam * 10000;
        return check_after_decimal_point(mm);
    }
    /**
     * METER
     **/
    // formula conversion M to KM
    public String MtoKm(double m) {
        double km = m / 1000;
        return check_after_decimal_point(km);
    }

    // formula conversion M to HM
    public String MtoHm(double m) {
        double hm = m / 100;
        return check_after_decimal_point(hm);
    }

    // formula conversion M to DAM
    public String MtoDam(double m) {
        double dam = m / 10;
        return check_after_decimal_point(m);
    }
    // formula conversion M to DM
    public String MtoDm(double m) {
        double dm = m * 10;
        return check_after_decimal_point(dm);
    }

    // formula conversion M to CM
    public String MtoCm(double m) {
        double cm = m * 100;
        return check_after_decimal_point(cm);
    }

    // formula conversion M to MM
    public String MtoMm(double m) {
        double mm = m * 1000;
        return check_after_decimal_point(mm);
    }

    /**
     * DESIMETER
     **/
    // DM to KM
    public String DmtoKm(double dm) {
        double km = dm / 10000;
        return check_after_decimal_point(km);
    }

    // DM to HM
    public String DmtoHm(double dm) {
        double hm = dm /1000;
        return check_after_decimal_point(hm);
    }

    // DM to DAM
    public String DmtoDam(double dm) {
        double dam = dm / 100;
        return check_after_decimal_point(dam);
    }
    // DM to M
    public String DmtoM(double dm) {
        double m = dm / 10;
        return check_after_decimal_point(m);
    }

    // DM to CM
    public String DmtoCm(double dm) {
        double cm = dm * 10;
        return check_after_decimal_point(cm);
    }

    // DM to MM
    public String DmtoMm(double dm) {
        double mm = dm * 100;
        return check_after_decimal_point(mm);
    }
    /**
     * CENTIMETER
     **/
    // CM to KM
    public String CmtoKm(double cm) {
        double km = cm /100000;
        return check_after_decimal_point(km);
    }

    // CD to HM
    public String CmtoHm(double cm) {
        double hm = cm / 10000;
        return check_after_decimal_point(hm);
    }

    // CM to DAM
    public String CmtoDam(double cm) {
        double dam = cm / 1000;
        return check_after_decimal_point(dam);
    }
    // CM to M
    public String CmtoM(double cm) {
        double m = cm / 100;
        return check_after_decimal_point(m);
    }

    // CM to DM
    public String CmtoDm(double cm) {
        double dm = cm / 10 ;
        return check_after_decimal_point(cm);
    }

    // CM to MM
    public String CmtoMm(double cm) {
        double mm = cm * 10;
        return check_after_decimal_point(mm);
    }
    /**
     * MILIMETER
     **/
    // MM to KM
    public String MmtoKm(double mm) {
        double km = mm / 1000000;
        return check_after_decimal_point(km);
    }

    //MM to HM
    public String MmtoHm(double mm) {
        double hm = mm / 100000;
        return check_after_decimal_point(hm);
    }

    // MM to DAM
    public String MmtoDam(double mm) {
        double dam = mm / 10000;
        return check_after_decimal_point(dam);
    }
    // MM to M
    public String MmtoM(double mm) {
        double m = mm / 1000;
        return check_after_decimal_point(m);
    }

    // MM to DM
    public String MmtoDm(double cm) {
        double dm = cm /100;
        return check_after_decimal_point(dm);
    }

    // MM to CM
    public String MmtoCm(double mm) {
        double cm = mm / 10;
        return check_after_decimal_point(cm);
    }
    //----------------------------------------------------------------
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
    //-----------------------------------------------------------------------------
    /**
     * GET FORMULA
     **/
    public String getFormula(String symbol1, String symbol2, double value_to_conversion, String result) {
        String results = null;
        // Km to Hm
        if (symbol1.equals("km") && symbol2.equals("hm")) {
            results = symbol2 + "  =  " + symbol1 + "  x  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  10\n" + symbol2 + "  =  " + result;
        }
        // Km to Dam
        else if (symbol1.equals("km") && symbol2.equals("dam")) {
            results = symbol2 + "  =  " + symbol1 + "  x  100\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  100\n" + symbol2 + "  =  " + result;
        }
        // Km to M
        else if (symbol1.equals("km") && symbol2.equals("m")) {
            results = symbol2 + "  =  " + symbol1 + "  x  1000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  1000\n" + symbol2 + "  =  " + result;
        }
        // Km to Dm
        else if (symbol1.equals("km") && symbol2.equals("dm")) {
            results = symbol2 + "  =  " + symbol1 + "  x  10000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  10000\n" + symbol2 + "  =  " + result;
        }
        // Km to Cm
        else if (symbol1.equals("km") && symbol2.equals("cm")) {
            results = symbol2 + "  =  " + symbol1 + "  x  100000\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion) + "  x  100000\n" + symbol2 + "  =  " + result;
        }
        // Km to Mm
        else if (symbol1.equals("km") && symbol2.equals("mm")) {
            results = symbol2 + "  =  " + symbol1 + "  x  1000000\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion)
                    + "  x  1000000\n" + symbol2 + "  =  " + result;
        }
        // Hm to Km
        else if (symbol1.equals("hm") && symbol2.equals("km")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion) + "  /  10\n" + symbol2 + "  =  " + result;
        }
        // Hm to Dam
        else if (symbol1.equals("hm") && symbol2.equals("dam")) {
            results = symbol2 + "  =  " + symbol2 + "  x  10\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion) + "  x  10\n" + symbol2 + "  =  " + result;
        }
        // Hm to M
        else if (symbol1.equals("hm") && symbol2.equals("m")) {
            results = symbol2 + "  =  " + symbol1 + "  x  100\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion) + "  x  100\n" + symbol2 + "  =  " + result;
        }
        // Hm to Dm
        else if (symbol1.equals("hm") && symbol2.equals("dm")) {
            results = symbol2 + "  =  " + symbol1 + "  x  1000\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion)
                    + "  x  1000\n" + symbol2 + "  =  " + result;
        }
        // Hm to Cm
        else if (symbol1.equals("hm") && symbol2.equals("cm")) {
            results = symbol2 + "  =  " + symbol1 + "  x  10000\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion) + "  x  10000\n" + symbol2 + "  =  " + result;
        }
        // Hm to Mm
        else if (symbol1.equals("hm") && symbol2.equals("mm")) {
            results = symbol2 + "  =  " + symbol2 + "  x  100000\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion) + "  x  100000\n" + symbol2 + "  =  " + result;
        }
        // Dam to Km
        else if (symbol1.equals("dam") && symbol2.equals("km")) {
            results = symbol2 + "  =  " + symbol1 + "  /  100\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  100\n" + symbol2 + "  =  " + result;
        }
        // Dam to Hm
        else if (symbol1.equals("dam") && symbol2.equals("hm")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  10\n" + symbol2 + "  =  " + result;
        }
        // Dam to M
        else if (symbol1.equals("dam") && symbol2.equals("m")) {
            results = symbol2 + "  =  " + symbol1 + "  x  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  10\n" + symbol2 + "  =  " + result;
        }
        //Dam to Dm
        else if (symbol1.equals("dam") && symbol2.equals("dm")) {
            results = symbol2 + "  =  " + symbol1 + "  x  100\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion) + "  x  100\n" + symbol2 + "  =  " + result;
        }
        // Dam to Cm
        else if (symbol1.equals("dam") && symbol2.equals("cm")) {
            results = symbol2 + "  =  " + symbol1 + "  x  1000\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion)
                    + "  x  1000\n" + symbol2 + "  =  " + result;
        }
        // Dam to Mm
        else if (symbol1.equals("dam") && symbol2.equals("mm")) {
            results = symbol2 + "  =  " + symbol1 + "  x  10000\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion) + "  x  10000\n" + symbol2 + "  =  " + result;
        }
        // M to Km
        else if (symbol1.equals("m") && symbol2.equals("km")) {
            results = symbol2 + "  =  " + symbol2 + "  /  1000\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion) + "  /  1000\n" + symbol2 + "  =  " + result;
        }
        // M to Hm
        else if (symbol1.equals("m") && symbol2.equals("hm")) {
            results = symbol2 + "  =  " + symbol1 + "  /  100\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion) + "  /  100\n" + symbol2 + "  =  " + result;
        }
        // M to Dam
        else if (symbol1.equals("m") && symbol2.equals("dam")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion)
                    + "  /  10\n" + symbol2 + "  =  " + result;
        }
        // M to Dm
        else if (symbol1.equals("m") && symbol2.equals("dm")) {
            results = symbol2 + "  =  " + symbol1 + "  x  10\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion) + "  x  10\n" + symbol2 + "  =  " + result;
        }
        // M to Cm
        else if (symbol1.equals("m") && symbol2.equals("cm")) {
            results = symbol2 + "  =  " + symbol2 + "  x  100\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion) + "  x  100\n" + symbol2 + "  =  " + result;
        }
        // M to Mm
        else if (symbol1.equals("m") && symbol2.equals("mm")) {
            results = symbol2 + "  =  " + symbol1 + "  x  1000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  1000\n" + symbol2 + "  =  " + result;
        }
        // Dm to Km
        else if (symbol1.equals("dm") && symbol2.equals("km")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  10000\n" + symbol2 + "  =  " + result;
        }
        // Dm to Hm
        else if (symbol1.equals("dm") && symbol2.equals("hm")) {
            results = symbol2 + "  =  " + symbol1 + "  /  1000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  1000\n" + symbol2 + "  =  " + result;
        }
        // Dm to Dam
        else if (symbol1.equals("dm") && symbol2.equals("dam")) {
            results = symbol2 + "  =  " + symbol1 + "  /  100\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion) + "  /  100\n" + symbol2 + "  =  " + result;
        }
        // Dm to M
        else if (symbol1.equals("dm") && symbol2.equals("m")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion)
                    + "  /  10\n" + symbol2 + "  =  " + result;
        }
        // Dm to Cm
        else if (symbol1.equals("dm") && symbol2.equals("cm")) {
            results = symbol2 + "  =  " + symbol1 + "  x  10\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion) + " x  10\n" + symbol2 + "  =  " + result;
        }
        // Dm to Mm
        else if (symbol1.equals("dm") && symbol2.equals("mm")) {
            results = symbol2 + "  =  " + symbol2 + "  x  100\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion) + "  x  100\n" + symbol2 + "  =  " + result;
        }
        // Cm to Km
        else if (symbol1.equals("cm") && symbol2.equals("km")) {
            results = symbol2 + "  =  " + symbol1 + "  /  100000\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion) + "  /  100000\n" + symbol2 + "  =  " + result;
        }
        // Cm to Hm
        else if (symbol1.equals("cm") && symbol2.equals("hm")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10000\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion)
                    + "  /  10000\n" + symbol2 + "  =  " + result;
        }
        // Cm to Dam
        else if (symbol1.equals("cm") && symbol2.equals("dam")) {
            results = symbol2 + "  =  " + symbol1 + "  1000\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion) + "  1000\n" + symbol2 + "  =  " + result;
        }
        // Cm to M
        else if (symbol1.equals("cm") && symbol2.equals("m")) {
            results = symbol2 + "  =  " + symbol2 + "  /  100\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion) + "  /  100\n" + symbol2 + "  =  " + result;
        }// Cm to Dm
        else if (symbol1.equals("cm") && symbol2.equals("dm")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  10\n" + symbol2 + "  =  " + result;
        }
        // Cm to Mm
        else if (symbol1.equals("cm") && symbol2.equals("mm")) {
            results = symbol2 + "  =  " + symbol1 + "  x  10\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  x  10\n" + symbol2 + "  =  " + result;
        }
        //Mm to Km
        else if (symbol1.equals("mm") && symbol2.equals("km")) {
            results = symbol2 + "  =  " + symbol1 + "  /  1000000\n" + symbol2 +
                    "  =  " + check_after_decimal_point(value_to_conversion) + "  /  1000000\n" + symbol2 + "  =  " + result;
        }
        // Mm to Hm
        else if (symbol1.equals("mm") && symbol2.equals("hm")) {
            results = symbol2 + "  =  " + symbol1 + "  /  100000\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion) + "  /  100000\n" + symbol2 + "  =  " + result;
        }
        // Mm to Dam
        else if (symbol1.equals("mm") && symbol2.equals("dam")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10000\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion)
                    + "  /  10000\n" + symbol2 + "  =  " + result;
        }
        // Mm to M
        else if (symbol1.equals("mm") && symbol2.equals("m")) {
            results = symbol2 + "  =  " + symbol1 + "  /  1000\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion) + "  /  1000\n" + symbol2 + "  =  " + result;
        }
        // Mm to Dm
        else if (symbol1.equals("mm") && symbol2.equals("dm")) {
            results = symbol2 + "  =  " + symbol2 + "  /  100\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion) + "  /  100\n" + symbol2 + "  =  " + result;
        }
        // Mm to Cm
        else if (symbol1.equals("mm") && symbol2.equals("cm")) {
            results = symbol2 + "  =  " + symbol1 + "  /  10\n" + symbol2
                    + "  =  " + check_after_decimal_point(value_to_conversion) + "  /  10\n" + symbol2 + "  =  " + result;
        }

        return results;
    }
}

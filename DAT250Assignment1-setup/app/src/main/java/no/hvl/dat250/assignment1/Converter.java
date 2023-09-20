package no.hvl.dat250.assignment1;

public class Converter{

    private static final double IN_TO_METER = 0.0254;
    private static final double FT_TO_METER = 0.3048;
    private static final double MI_TO_METER = 1609.344;

    /**
     * This method converts between different measurements of length
     * 
     * @param value
     * @param fromUnit
     * @param toUnit
     * @return value of the converted unit
     */
    public static double unitConverter(double value, String fromUnit, String toUnit) {
        double inMeters;

        if (fromUnit.equals("in")) {
            inMeters = value * IN_TO_METER;
        } else if (fromUnit.equals("ft")) {
            inMeters = value * FT_TO_METER;
        } else if (fromUnit.equals("mi")) {
            inMeters = value * MI_TO_METER;
        } else if (fromUnit.equals("m")) {
            inMeters = value;
        } else {
            inMeters = Double.NaN;
        }
        double result;
        if (toUnit.equals("in")) {
            result = inMeters / IN_TO_METER;
        } else if (toUnit.equals("ft")) {
            result = inMeters / FT_TO_METER;
        } else if (toUnit.equals("mi")) {
            result = inMeters / MI_TO_METER;
        } else if (toUnit.equals("m")) {
            result = inMeters;
        } else {
            result = Double.NaN;
        }

        return result;
    }

}


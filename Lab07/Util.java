//Copyright 2024 Justin Schlag

public class Util {

    public static double EPSILON = 0.00001;

    /**
     * Calculates the percent difference between two double values.
     * Rounds the result to two decimal places and returns it as a String with a '%' sign.
     * 
     * @param lhs Left-hand-side of the percent difference calculation.
     * @param rhs Right-hand-side of the percent difference calculation.
     * @return A String representation of the rounded percent difference between lhs and rhs.
     */
    public static String percentDifference(double lhs, double rhs) {
        if (lhs == rhs) {
            return "0.00%";
        }

        double difference = Math.abs(lhs - rhs);
        double avg = (Math.abs(lhs) + Math.abs(rhs)) / 2.0;

        if (avg == 0.0) {
            return "Infinity%"; // Avoid division by zero if both lhs and rhs are 0
        }

        double percentDiff = (difference / avg) * 100;
        
        // Format the result with two decimal places and add a '%' symbol
        return String.format("%.2f%%", percentDiff);
    }

    public static boolean fpEquals(double lhs, double rhs) {
        double percentDiff = Double.parseDouble(percentDifference(lhs, rhs).replace("%", ""));
        return percentDiff <= EPSILON * 100;
    }

    public static boolean fpLessThanEqual(double lhs, double rhs) {
        if (lhs < rhs) {
            return true;
        } else {
            return fpEquals(lhs, rhs);
        }
    }

    public static boolean fpGreaterThanEqual(double lhs, double rhs) {
        if (lhs > rhs) {
            return true;
        } else {
            return fpEquals(lhs, rhs);
        }
    }
}

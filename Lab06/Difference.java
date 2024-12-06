// Copyright 2024 Justin Schlag 

import java.util.Scanner;

public class Difference {
    public static void main(String[] args) {
        // Create a Scanner object to read input from stdin
        Scanner stdin = new Scanner(System.in);
        
        // Read the size of the left-hand set and populate the lhs_set array
        double[] lhs_set = new double[stdin.nextInt()];
        for (int i = 0; i < lhs_set.length; ++i)
            lhs_set[i] = stdin.nextDouble();
        
        // Read the size of the right-hand set and populate the rhs_set array
        double[] rhs_set = new double[stdin.nextInt()];
        for (int i = 0; i < rhs_set.length; ++i)
            rhs_set[i] = stdin.nextDouble();
        
        // Read the expected intersection results and populate the expected_diff array
        double[] expected_diff = new double[stdin.nextInt()];
        for (int i = 0; i < expected_diff.length; ++i)
            expected_diff[i] = stdin.nextDouble();
        
        // Calculate the actual intersection from lhs_set and rhs_set
        double[] actual_diff = Calculate(lhs_set, rhs_set, EPSILON);
        
        // Check if the actual result matches the expected result in size
        if (actual_diff.length != expected_diff.length) {
            System.out.println("Difference size -- Expected: " + expected_diff.length + ", Actual: " + actual_diff.length);
        } else {
            int numberFound = 0; // Counter for found values
            
            // Check each expected value against the actual intersection
            for (double expected : expected_diff) {
                boolean found = false; // Flag to indicate if the value is found
                for (double actual : actual_diff) {
                    // Use FPEquals to check for equality with an epsilon
                    if (FPEquals(expected, actual, EPSILON)) {
                        found = true; // Value is found
                        break;
                    }
                }
                // Output if the expected value was not found in the actual intersection
                if (!found)
                    System.out.println(expected + " was not found in set difference");
                else
                    ++numberFound; // Increment the counter if found
            }
            // If all expected values were found, print success message
            if (numberFound == expected_diff.length)
                System.out.println("All values found in set difference!");
        }
        // Close the scanner to avoid resource leaks
        stdin.close();
    }

    
    public static double[] Calculate(double[] a, double[] b, double epsilon) {
        // Temporary array to store potential intersection values
        double[] temp = new double[Math.min(a.length, b.length)];
        int count = 0; // Counter for valid intersection values

        // Check each element in a against each element in b
        for (double valueA : a) {
            for (double valueB : b) {
                // Check if the two values are equal using FPEquals
                if (FPEquals(valueA, valueB, epsilon)) {
                    temp[count++] = valueA; // Store the found intersection
                    break; // Move to the next value in a to avoid duplicates
                }
            }
        }

        // Create an array of the exact size of the intersection found
        double[] intersection = new double[count];
        System.arraycopy(temp, 0, intersection, 0, count); // Copy valid values to the new array
        
        return intersection; // Return the intersection array
    }

 
    public static boolean FPEquals(double a, double b, double epsilon) {
        return Math.abs(a - b) <= epsilon * Math.abs((a + b) / 2);
    }

    // Epsilon value for floating-point comparison
    public static final double EPSILON = 0.00001;
}

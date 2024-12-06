// Copyright 2024 Justin Schlag

import java.util.Scanner;

public class StatisticTool {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        
        // loop control variable
        int input; 
        // Array Size starts with 2
        double[] data = new double[2]; 
        int count = 0; 
        
        // Main Application Loop
        do {
            // Print a menu for user interaction
            System.out.println("Statistic Tool");
            System.out.println("1. Add Data");
            System.out.println("2. Calculate Max");
            System.out.println("3. Calculate Min");
            System.out.println("4. Print Data");
            System.out.println("5. Quit");
            System.out.print("$> ");
            input = stdin.nextInt();
            
            if (input == 1) {
                // Add data
                if (count == data.length) {
                    // Double the size of the array if it's full
                    double[] newData = new double[data.length * 2];
                    System.arraycopy(data, 0, newData, 0, data.length);
                    data = newData;
                }
                System.out.print("Enter Datum: ");
                data[count] = stdin.nextDouble();
                count++;
            } else if (input == 2) {
                // Calculate Max
                if (count > 0) {
                    double max = data[0];
                    for (int i = 1; i < count; i++) {
                        if (data[i] > max) {
                            max = data[i];
                        }
                    }
                    System.out.println("Max datum: " + max);
                    System.out.println(); // Skip a line
                } else {
                    System.out.println("No data available.");
                }
            } else if (input == 3) {
                // Calculate Min
                if (count > 0) {
                    double min = data[0];
                    for (int i = 1; i < count; i++) {
                        if (data[i] < min) {
                            min = data[i];
                        }
                    }
                    System.out.println("Min datum: " + min);
                    System.out.println(); // Skip a line
                } else {
                    System.out.println("No data available.");
                }
            } else if (input == 4) {
                // Print Data
                if (count > 0) {
                    for (int i = 0; i < count; i++) {
                        System.out.print(data[i] + " ");
                    }
                    System.out.println();
                } else {
                    System.out.println("No data available.");
                }
            }
        } while (0 < input && input < 5); // Condition to continue the loop

        System.out.println("\nGoodbye!");
        stdin.close();
    }
}

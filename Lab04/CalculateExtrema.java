//Justin Schlag 

import java.util.Scanner;

public class CalculateExtrema {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        
        //Skips over first int so we don't use in calculations
        int size = stdin.nextInt();
        
        int[] array = new int[size]; 
        int count = 0;

        // Read integers into the array
        while (count < array.length && stdin.hasNextInt()) {
            array[count] = stdin.nextInt();
            count++;
        }
        
        // Read the operation character
        String operation = stdin.next();

        // Initialize variables 
        int maxInt = array[0];
        int minInt = array[0];
        double sum = 0;

        // Finds the maximum, minimum and calculates the sum
        for (int i = 0; i < count; i++) {
            if (array[i] > maxInt) {
                maxInt = array[i];
            }
            if (array[i] < minInt) {
                minInt = array[i];
            }
            sum += array[i];
        }
        
        // Determine the result based on the operation
        if (operation.equals("+")) {
            System.out.println("Max Value: " + maxInt);
        } else if (operation.equals("-")) {
            System.out.println("Min Value: " + minInt);
        } else if (operation.equals("/")) {
            double mean = sum / count;
            System.out.printf("Mean Value: " + mean);
        } else {
            System.out.println("Invalid operation");
        }


        stdin.close();
    }
}
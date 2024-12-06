//Justin Schlag 

import java.util.Scanner;

public class GreaterThanFirst {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // Read the first integer value
        int firstValue = console.nextInt();

        // Initialize counters
        int countGreaterThanFirst = 0;
        int totalCount = 9; 

        // Loop to read and process the next 9 integers
        for (int count = 0; count < totalCount; count++) {
            // Read the next integer from the user
            int number = console.nextInt();

            // Check if the number is greater than the first value
            if (number > firstValue) {
                countGreaterThanFirst++;
            }
        }

        // Calculate the percentage of values greater than the first value
        totalCount = totalCount + 1;
        double percentage = (countGreaterThanFirst * 100.0) / totalCount;

        // Print the result with one decimal place
        System.out.print(percentage + "% are greater than " + firstValue);

        // Close the scanner
        console.close();
    }
}

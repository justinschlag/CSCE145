//Copyright 2024 Justin Schlag 
import java.util.Scanner;

public class Extrema {
   
	//performs linear search over unsorted array to determine largest value
    public static int Max(double[] array) {
        int maxIndex = 0; // Assume the first element is the largest
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i; // Update maxIndex if a larger element is found
            }
        }
        return maxIndex; // Return the index of the largest element
    }

    
    //Performs a linear search over unsorted array to determine smallest value
   
    public static int Min(double[] array) {
        int minIndex = 0; // Assume the first element is the smallest
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i; // Update minIndex if a smaller element is found
            }
        }
        return minIndex; // Return the index of the smallest element
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        // Get the number of floating point values
        double[] numbers = new double[stdin.nextInt()];

        // Read the floating point values into the array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = stdin.nextDouble();
        }

        // Get expected outcomes
        int expected_max = stdin.nextInt();
        int expected_min = stdin.nextInt();

        // Get actual values
        int actual_max = Max(numbers);
        int actual_min = Min(numbers);

        // Compare expected and actual
        int testsPassed = 2;

        if (actual_max != expected_max) {
            --testsPassed;
            System.out.print("Max(double[]) Expected: " + numbers[expected_max]);
            System.out.println(", Actual: " + numbers[actual_max]);
        }

        if (actual_min != expected_min) {
            --testsPassed;
            System.out.print("Min(double[]) Expected: " + numbers[expected_min]);
            System.out.println(", Actual: " + numbers[actual_min]);
        }

        if (testsPassed == 2) {
            System.out.println("All tests passed!");
        } else {
            System.out.println(testsPassed + " of 2 passed.");
        }

        stdin.close();
    }
}

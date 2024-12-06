//Justin Schlag 
import java.util.Scanner;

public class CalculateMedian {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		// Read the first integer to determine the size of the array
        int size = stdin.nextInt();
        double[] values = new double[size];
        
        // Store all floating-point values in the array
        for (int i = 0; i < size; i++) {
            values[i] = stdin.nextDouble();
        }
        
        stdin.close();
        
        // Sort the array using Selection Sort
        selectionSort(values);
        
        // Calculate and print the median
        double median = calculateMedian(values);
        System.out.println("The median is: " + median);
        
    
    }


// Method to sort the array using Selection Sort
private static void selectionSort(double[] array) {
    int n = array.length;
    for (int i = 0; i < n - 1; i++) {
        int minIndex = i;
        for (int j = i + 1; j < n; j++) {
            if (array[j] < array[minIndex]) {
                minIndex = j;
            }
        }
        // Swap the found minimum element with the first element
        double temp = array[minIndex];
        array[minIndex] = array[i];
        array[i] = temp;
    }
}

// Method to calculate the median
private static double calculateMedian(double[] array) {
    int n = array.length;
    if (n % 2 == 0) {
        // If even, average the two middle numbers
        return (array[n / 2 - 1] + array[n / 2]) / 2.0;
    } else {
        // If odd, return the middle number
        return array[n / 2];
    }
}
}
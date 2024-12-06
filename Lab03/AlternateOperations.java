//Justin Schlag 

import java.util.Scanner;

public class AlternateOperations {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        // Read the initial value and the count of the rest of the values
        double initialValue = console.nextDouble();
        int integers = console.nextInt();
        
        //Starts with initial value
        double result = initialValue;
        //Starts with addition
        boolean isAddition = true;      
        
        // Read the next n floating point values and perform alternating operations
        for (int i = 0; i < integers; i++) {
            double currentValue = console.nextDouble();
            if (isAddition) {
                result += currentValue;  // Add current value
            } else {
                result -= currentValue;  // Subtract current value
            }
            isAddition = !isAddition; 
        }
        
        System.out.printf("Result: " + result);
        
        console.close(); 
    }
}

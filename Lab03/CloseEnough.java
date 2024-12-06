//Justin Schlag 

import java.util.Scanner;

public class CloseEnough {

	public static final double EPSILON = 0.001;
			
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		//Read first value to compare the rest to
		double initialValue = console.nextDouble();
				
		int integers = console.nextInt();
		
		int numbersCloseEnough = 0;
		
		// Read the next n floating point values
        for (int i = 0; i < integers; i++) {
            double currentValue = console.nextDouble();
            // Check if the current value is "close enough"
            if (Math.abs(currentValue - initialValue) < EPSILON) {
                numbersCloseEnough++;
                
            }
        }
        //Percentage Calculated
        double percentCloseEnough = (double) numbersCloseEnough / integers * 100;
        
        System.out.print(percentCloseEnough + "% are close enough to " + initialValue);
        
        console.close();
	}

}

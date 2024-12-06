//Justin Schlag 

import java.util.Scanner; 

public class ReverseNumbers {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		//Reads first number 8 to skip over it
		int size = stdin.nextInt();
		
		 int[] array = new int[size]; // Array to hold up to 8 integers
	        int count = 0; // Counter for the number of integers read

	        // Read integers from standard input
	        while (count < array.length) {
	            array[count] = stdin.nextInt();
	            count++;
	        }

	        // Print the last 7 numbers in reverse order
	        for (int i = count - 1; i >= 0; i--) { // Start from count - 1 to skip the first number
	            System.out.print(array[i]);
	            if (i != 0) {
	                System.out.print(", "); // Print comma only if it's not the last number
	            }
	        }
	        
	        stdin.close();
	    }
	}
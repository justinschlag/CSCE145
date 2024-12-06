//Copyright 2024 Justin Schlag 

import java.util.Scanner;

public class ConcatenateInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create Scanner to read input from console
		Scanner console = new Scanner(System.in);
		
		//Reads the first two integers from the input
		int int1 = console.nextInt();
		
		int int2 = console.nextInt();
		
		//Reads the next three doubles from the input
		double double1 = console.nextDouble();
		
		double double2 = console.nextDouble();
		
		double double3 = console.nextDouble();
		
		//Reads the three strings from the input 
		String string1 = console.next();
		
		String string2 = console.next();
		
		String string3 = console.next();
		
		//Reads the last integer from the input 
		int int3 = console.nextInt();
	
		//Adds the three integers together 
		int finalInt = int1 + int2 +int3;

		//Concatenate the strings and outputs the sum of integers with it
		System.out.println (string1 + string2 + string3 + finalInt);

		console.close();
	}

}

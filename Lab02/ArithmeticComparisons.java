//Justin Schlag 

import java.util.Scanner;

public class ArithmeticComparisons {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		//Stores the int and double values while skipping over the string values
		int int1 = console.nextInt();
		String string1 = console.next(); 
		double double1 = console.nextDouble();
		String string2 = console.next();
		int int2 = console.nextInt();
		double double2 = console.nextDouble();
		double double3 = console.nextDouble();
		String string3 = console.next();
		int int3 = console.nextInt();
		
		//Compares the int values and outputs a true or false
		boolean intOneDiv = int2 / int3 > 0;
		System.out.println (int2 + "/" + int3 + " > 0 is " + intOneDiv);
		
		boolean intTwoDiv = int3 / int2 > 1;
		System.out.println (int3 + "/" + int2 + " > 1 is " + intTwoDiv);
		
		boolean intThreeDiv = int3 / int1 == 4;
		System.out.println (int3 + "/" + int1 + " = 4 is " + intThreeDiv);
		
		//Subtracts and compares the double values and outputs that it is true
		boolean doubminus = double1 - double2 == double3;
		System.out.println (double1 + " - " + double2 + " = " + double3 + " is " + doubminus);
		
		console.close();

	}

}

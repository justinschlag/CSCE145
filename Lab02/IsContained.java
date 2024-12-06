//Justin Schlag

import java.util.Scanner;

public class IsContained {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		//Stores int and double variables while skipping over strings
		int int1 = console.nextInt();
		String string1 = console.next(); 
		double double1 = console.nextDouble();
		String string2 = console.next();
		int int2 = console.nextInt();
		double double2 = console.nextDouble();
		double double3 = console.nextDouble();
		String string3 = console.next();
		int int3 = console.nextInt();
		
		//Compares the int values and outputs if it is true or false
		boolean integers = int1 < int2 && int2 <= int3;
		System.out.println (int1 + " < " + int2 + " <= " + int3 + " is " + integers);
		
		//Compares the doubles and outputs if it is true or false
		boolean doubles = double1 > double2 && double2 >= double3;
		System.out.println (double1 + " > " + double2 + " >= " + double3 + " is " + doubles);
		
		console.close();
	}

}

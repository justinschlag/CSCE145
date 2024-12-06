//Copyright 2024 Justin Schlag 

import java.util.Scanner; 

public class OrderInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner to read input from input text
		Scanner console = new Scanner(System.in);

		//reads two integer values from the input
		int int1 = console.nextInt();
		
		int int2 = console.nextInt();
		
		
		//reads three double values from the input 
		double double1 = console.nextDouble();
		
		double double2 = console.nextDouble();
		
		double double3 = console.nextDouble();
		
		
		//reads three string values from the input 
		String string1 = console.next();
		
		String string2 = console.next();
		
		String string3 = console.next();
		
		//reads last int
		int int3 = console.nextInt();
		
		//Outputs the values in the order of strings, then ints, then doubles
		System.out.println(string1);
		System.out.println(string2);
		System.out.println(string3);
		System.out.println(int1);
		System.out.println(int2);
		System.out.println(int3);
		System.out.println(double1);
		System.out.println(double2);
		System.out.println(double3);
		
		console.close();
		
		
		
	}

}

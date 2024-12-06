//Copyright 2024 Justin Schlag 

import java.util.Scanner;

public class SumDoubles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creates scanner to read the input text 
		Scanner console = new Scanner(System.in);

		// read the first double value from input 
		double d1 = console.nextDouble();
		
		//reads the next five strings from the input 
		String s1 = console.next();
		String s2 = console.next();
		String s3 = console.next();
		String s4 = console.next();
		String s5 = console.next();
		
		//reads second double value from the input 
		double d2 = console.nextDouble();
				
		
		System.out.println (s1 + " " + s2 + " " + s3 + " " + s4 + " " + s5 + " " + (d1 + d2));
		
		//closes scanner
		console.close();
	}

}

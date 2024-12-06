//Copyright 2024 Justin Schlag

import java.util.Scanner;

public class MultiplyDoubles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner to read the input 
		Scanner console = new Scanner(System.in);
		
		//reads the first double from the input 
		double doub1 = console.nextDouble();
		
		//reads the five strings from input 
		String strng1 = console.next();
		String strng2 = console.next();
		String strng3 = console.next();
		String strng4 = console.next();
		String strng5 = console.next();
		
		//reads the second double from input 
		double doub2 = console.nextDouble();
				
		//output the result 
		System.out.println (strng1 + " " + strng2 + " " + strng4 + " " + strng5 + " " + (doub1 * doub2));
		
		console.close();
	}

}

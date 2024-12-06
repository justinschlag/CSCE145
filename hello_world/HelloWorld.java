//Copyright 2024 Justin Schlag 
//

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, World!");
		
		//request Scanner for console
		Scanner console = new Scanner(System.in);
		
		//get name
		String name;
		System.out.print("what is your name? ");
		name = console.nextLine();
		
		//display name
		System.out.println("Hello, " + name + "!\nWelcome to Programming.");
		
		//treat input as an integer
		int number;
		System.out.print("Enter an integer: ");
		number = console.nextInt();
		System.out.println("Twice " + number + " is " + (number + number));

		console.close();
	}

}

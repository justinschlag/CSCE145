//Justin Schlag

import java.util.Scanner;

public class PrintScoresPassed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner console = new Scanner(System.in);

		//Stores double and int values
		double double1 = console.nextDouble();
		int int1 = console.nextInt();
		int int2 = console.nextInt();
		double double2 = console.nextDouble();
		int int3 = console.nextInt();
		int int4 = console.nextInt();
		double double3 = console.nextDouble();
		int int5 = console.nextInt();
		int int6 = console.nextInt();
		
		//Student 1
		double a = double1;
		double b = int1;
		double c = int2;
		System.out.print("Student 1 results:");
		
		//Weighs the grade based off exam, quiz, and assignments
		// a = exam, b = quiz, c = assignment
		if (a >= 70)
			System.out.print(" passed,");
		else
			System.out.print(" not passed,");
		
		if (b >= (10*.7))
			System.out.print(" passed,");
		else
			System.out.print(" not passed,");
		
		if (c >= (15*.7))
			System.out.print(" passed");
		else
			System.out.print(" not passed");
		
		//Student 2
		double d = double2;
		double e = int3;
		double f = int4;
		
		//Weighs the grade based off exam, quiz, and assignments
		// d = exam, e = quiz, f = assignment
		System.out.print("\nStudent 2 results:");
		
		if (d >= 70)
			System.out.print(" passed,");
		else
			System.out.print(" not passed,");
		
		if (e >= (10*.7))
			System.out.print(" passed,");
		else
			System.out.print(" not passed,");
		
		if (f >= (15*.7))
			System.out.print(" passed");
		else
			System.out.print(" not passed");
		
		//Student 3
		double g = double3;
		double h = int5 / 10;
		double i = int6 /15;
		System.out.print("\nStudent 3 results:");
		
		//Weighs the grade based off exam, quiz, and assignments
		// g = exam, h = quiz, i = assignment
		if (g >= 70)
			System.out.print(" passed,");
		else
			System.out.print(" not passed,");
		
		if (h >= (10*.7))
			System.out.print(" passed,");
		else
			System.out.print(" not passed,");
		
		if (i >= (15*.7))
			System.out.print(" passed");
		else
			System.out.print(" not passed");
		
		console.close();
	}

}

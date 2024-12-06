//Justin Schlag

import java.util.Scanner;

public class PrintPassed {

	public static void main(String[] args) {
	
		Scanner console = new Scanner(System.in);
		
		//Stores the int and double values 
		double double1 = console.nextDouble();
		int int1 = console.nextInt();
		int int2 = console.nextInt();
		double double2 = console.nextDouble();
		int int3 = console.nextInt();
		int int4 = console.nextInt();
		double double3 = console.nextDouble();
		int int5 = console.nextInt();
		int int6 = console.nextInt();
		
		//Adds the int and double values into a single variable and compares it to 87.5
		//Outputs if the student is passing or not
		
		//Student 1
		double x = 0;
		x = x + double1 + int1 + int2;
		if (x >= 87.5)
			System.out.println("student 1 is passing");
		else
			System.out.println("Student 1 is not passing");
		
		//Student 2
		double y = 0;
		y = y + double2 + int3 + int4;
		if (y >= 87.5)
			System.out.println("student 2 is passing");
		else
			System.out.println("Student 2 is not passing");

		//Student3
		double z = 0;
		z = z + double3 + int5 + int6;
		if (z >= 87.5)
			System.out.println("student 3 is passing");
		else
			System.out.println("Student 3 is not passing");
		
		console.close();

		
		
		
		
		
		

	}

}

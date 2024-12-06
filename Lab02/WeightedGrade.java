//Justin Schlag

import java.util.Scanner;

public class WeightedGrade {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		
		int int1 = console.nextInt();
		String string1 = console.next();
		String string2 = console.next();
		String string3 = console.next();
		int int2 = console.nextInt();
		String string4 = console.next();
		String string5 = console.next();
		String string6 = console.next();
		
		//Weighs each letter grade and sets it to a numerical value
		System.out.print("Student " +int1 + ": ");
		if(string1.equals("A"))
			string1 = "4.0";
		else if(string1.equals("B"))
			string1 = "3.0";
		else if(string1.equals("C"))
			string1 = "2.0";
		else if(string1.equals("D"))
			string1 = "1.0";
		else
			string1 = "0.0";
		
		
		if(string2.equals("A"))
			string2 = "4.0";
		else if(string2.equals("B"))
			string2 = "3.0";
		else if(string2.equals("C"))
			string2 = "2.0";
		else if(string2.equals("D"))
			string2 = "1.0";
		else
			string2 = "0.0";
		
		if(string3.equals("A"))
			string3 = "4.0";
		else if(string3.equals("B"))
			string3 = "3.0";
		else if(string3.equals("C"))
			string3 = "2.0";
		else if(string3.equals("D"))
			string3 = "1.0";
		else
			string3 = "0.0";
		
		//Parsed string into double
		double studentAverage = 0;
		double double1 = Double.parseDouble(string1);
		double double2 = Double.parseDouble(string2);
		double double3 = Double.parseDouble(string3);
		
		
		//Weighs each grade by exam, quiz, or assignment
		double1 = (double1 * 0.6);
		double2 = (double2 *.2);
		double3 = (double3 * .2);
		
				//Adds up the numerical values into final numerical value
				studentAverage = studentAverage + double1 + double2 + double3;
				
				//Sets numerical value to a letter Grade
				if(studentAverage >= 3.5)
					System.out.println("A");
				else if(studentAverage >= 2.5 && studentAverage < 3.5)
					System.out.println("B");
				else if(studentAverage >= 1.5 && studentAverage < 2.5)
					System.out.println("C");
				else if(studentAverage >= 1.5 && studentAverage < 2.0)
					System.out.println("D");
				else
					System.out.println("F");
					
		
		//Student 2
		System.out.print("Student " + int2 + ": ");
		if(string4.equals("A"))
			string4 = "4.0";
		else if(string4.equals("B"))
			string4 = "3.0";
		else if(string4.equals("C"))
			string4 = "2.0";
		else if(string4.equals("D"))
			string4 = "1.0";
		else
			string4 = "0.0";
		
		if(string5.equals("A"))
			string5 = "4.0";
		else if(string5.equals("B"))
			string5 = "3.0";
		else if(string5.equals("C"))
			string5 = "2.0";
		else if(string5.equals("D"))
			string5 = "1.0";
		else
			string5 = "0.0";
		
		if(string6.equals("A"))
			string6 = "4.0";
		else if(string6.equals("B"))
			string6 = "3.0";
		else if(string6.equals("C"))
			string6 = "2.0";
		else if(string6.equals("D"))
			string6 = "1.0";
		else
			string6 = "0.0";
		
		double studentAverage2 = 0;
		double double4 = Double.parseDouble(string4);
		double double5 = Double.parseDouble(string5);
		double double6 = Double.parseDouble(string6);
		
		double4 = (double4 * 0.6);
		double5 = (double5 *.2);
		double6 = (double6 * .2);
		
				studentAverage2 = studentAverage2 + double4 + double5 + double6;
				
				if(studentAverage2 >= 3.5)
					System.out.println("A");
				else if(studentAverage2 >= 2.5 && studentAverage2 < 3.5)
					System.out.println("B");
				else if(studentAverage2 >= 1.5 && studentAverage2 < 2.5)
					System.out.println("C");
				else if(studentAverage2 >= 1.5 && studentAverage2 < 2.0)
					System.out.println("D");
				else
					System.out.println("F");
		
		
		console.close();

	}

}

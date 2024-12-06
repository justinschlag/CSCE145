//Justin Schlag

import java.util.Scanner;

public class ScoreGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner console = new Scanner(System.in);
		
		//Student 1
		int int1 = console.nextInt();
		String string1 = console.next();
		String string2 = console.next();
		String string3 = console.next();
		
		//Student 2
		int int2 = console.nextInt();
		String string4 = console.next();
		String string5 = console.next();
		String string6 = console.next();
		
		System.out.print("Student " +int1 + ": ");
		
		//Student 1
		//Sets String value to a numerical value
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
		
		
				//Adds up the students grade
				studentAverage = studentAverage + double1 + double2 + double3;
				
		//Takes the added up students grade, divides by 12, and multiply's by 100 to get final % grade
		System.out.println(studentAverage / 12 * 100 + "%");
		
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
		
		studentAverage2 = studentAverage2 + double4 + double5 + double6;
		System.out.println(studentAverage2 / 12 * 100 + "%");
		
		console.close();

	}

}

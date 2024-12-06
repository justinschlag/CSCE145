//Justin Schlag

import java.util.Scanner;

public class SortStudents {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        
        // Read the number of students
        int numStudents = stdin.nextInt();
        stdin.nextLine(); // Consume the newline character
        
        // Create arrays to store student names and grades
        String[] studentNames = new String[numStudents];
        double[] studentGrades = new double[numStudents];

        // Read student names
        String namesLine = stdin.nextLine();
        int nameIndex = 0;
        int start = 0;

        // Manually parse names
        for (int i = 0; i < namesLine.length(); i++) {
            if (namesLine.charAt(i) == ' ') {
                studentNames[nameIndex++] = namesLine.substring(start, i);
                start = i + 1;
            }
        }
        // Add the last name
        studentNames[nameIndex] = namesLine.substring(start);

        // Read student grades
        String gradesLine = stdin.nextLine();
        int gradeIndex = 0;
        start = 0;

       
        for (int i = 0; i < gradesLine.length(); i++) {
            if (gradesLine.charAt(i) == ' ') {
                studentGrades[gradeIndex++] = Double.parseDouble(gradesLine.substring(start, i));
                start = i + 1;
            }
        }
        // Add the last grade
        studentGrades[gradeIndex] = Double.parseDouble(gradesLine.substring(start));

        // Sort the grades and maintain correspondence with names
        sortStudents(studentNames, studentGrades);

        // Print the sorted names only, separated by commas
        System.out.println(String.join(", ", studentNames));
        
        stdin.close();
    }

    // Method to sort the student names and grades based on grades in descending order
    private static void sortStudents(String[] names, double[] grades) {
        int n = grades.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                // Swap if the current grade is less than the next grade
                if (grades[j] < grades[j + 1]) {
                    // Swap grades
                    double tempGrade = grades[j];
                    grades[j] = grades[j + 1];
                    grades[j + 1] = tempGrade;

                    // Swap corresponding names
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                }
            }
        }
    }
}

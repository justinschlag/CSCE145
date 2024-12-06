// Copyright 2024 Justin Schlag

import java.util.Scanner;

public class Grader {
    /**
     * Maps a score from [0.0, 4.5) to a grade from [F, A+].
     *
     * @param score a value in the range [0.0, 4.5)
     * @return a letter grade
     */
    public static String ToGrade(double score) {
        // Round to four decimal places
        score = Math.round(score * 10000.0) / 10000.0;

        // Determine the grade based on the rounded score
        if (score >= 3.945 && score < 4.5) {
            return "A+";
        } else if (score >= 3.445 && score < 4.0) {
            return "A";
        } else if (score >= 2.945 && score < 3.445) {
            return "B+";
        } else if (score >= 2.445 && score < 2.945) {
            return "B";
        } else if (score >= 1.945 && score < 2.445) {
            return "C+";
        } else if (score >= 1.445 && score < 1.945) {
            return "C";
        } else if (score >= 0.945 && score < 1.445) {
            return "D+";
        } else if (score >= 0.445 && score < 0.945) {
            return "D";
        } else 
        return "F";
        } 

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        // Read test scores from standard input stream, starting with size
        double[] scores = new double[stdin.nextInt()];
        for (int i = 0; i < scores.length; ++i) {
            scores[i] = stdin.nextDouble();
        }
        // Read test grades from standard input stream, using scores' size
        String[] grades = new String[scores.length];
        for (int i = 0; i < grades.length; ++i) {
            grades[i] = stdin.next();
        }
        // Test method ToGrade
        int testsPassed = scores.length;
        for (int i = 0; i < scores.length; ++i) {
            String actual = ToGrade(scores[i]);
            if (!actual.equals(grades[i])) {
                --testsPassed;
                System.out.print("ToGrade(" + scores[i] + ") ");
                System.out.print("Expected: " + grades[i]);
                System.out.println(", Actual: " + actual);
            }
        }
        // Print result
        if (testsPassed == scores.length) {
            System.out.println("All tests passed!");
        } else {
            System.out.println(testsPassed + " of " + scores.length + " passed.");
        }
        stdin.close();
    }
}

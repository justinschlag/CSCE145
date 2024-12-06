// Copyright 2024 Justin Schlag

import java.util.Scanner;

public class Scorer {
    public static double ToScore(String grade) {
        double score;
        if (grade.equals("A+")) {
            score = 4.0;
        } else if (grade.equals("A")) {
            score = 3.5;
        } else if (grade.equals("B+")) {
            score = 3.0;
        } else if (grade.equals("B")) {
            score = 2.5;
        } else if (grade.equals("C+")) {
            score = 2.0;
        } else if (grade.equals("C")) {
            score = 1.5;
        } else if (grade.equals("D+")) {
            score = 1.0;
        } else if (grade.equals("D")) {
            score = 0.5;
        } else {
            score = 0.0;  // Default for F
        }
        return score; 
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        // Read grades from standard input stream
        String[] grades = new String[stdin.nextInt()];
        for (int i = 0; i < grades.length; ++i) {
            grades[i] = stdin.next();
        }

        // Read test scores from standard input stream
        double[] scores = new double[grades.length];
        for (int i = 0; i < scores.length; ++i) {
            scores[i] = stdin.nextDouble();
        }

        // Use arrays to test ToScore method
        int testsPassed = grades.length;
        for (int i = 0; i < grades.length; ++i) {
            double actual = ToScore(grades[i]);
            if (actual != scores[i]) {
                --testsPassed;
                System.out.print("ToScore(" + grades[i] + ") ");
                System.out.print("Expected: " + scores[i]);
                System.out.println(", Actual: " + actual);
            }
        }

        if (testsPassed == grades.length) {
            System.out.println("All tests passed!");
        } else {
            System.out.println(testsPassed + " of " + grades.length + " tests passed.");
        }

        stdin.close();
    }
}

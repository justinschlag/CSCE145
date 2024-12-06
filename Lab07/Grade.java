//Copyright 2024 Justin Schlag

public class Grade {

    private double score;
    private double total;

    public Grade(double score) {
        this.score = score;
        this.total = 100.0; // Default total is 100
    }

    public Grade(double score, double total) {
        this.score = score;
        this.total = total;
    }

    /**
     * Calculates the percentage of score over total, rounded to one decimal place.
     * 
     * @return A string representing the percentage, e.g. "85.5%".
     */
    public String percent() {
        double percentage = (this.score / this.total) * 100;
        return String.format("%.1f%%", percentage); // Round to 1 decimal place
    }

    /**
     * Determines the letter grade based on the double-rounded percentage.
     * First rounds the percentage to one decimal place, then rounds it again to the nearest integer.
     * 
     * @return A char representing the letter grade (A, B, C, D, F).
     */
    public char letter() {
        // Calculate the percentage
        double percentage = (this.score / this.total) * 100.0;

        // First round to one decimal place
        double firstRound = Math.round(percentage * 10.0) / 10.0;

        // Second round to the nearest integer
        long finalRound = Math.round(firstRound);

        // Use the final rounded value to determine the letter grade
        if (finalRound >= 90) {
            return 'A';
        } else if (finalRound >= 80) {
            return 'B';
        } else if (finalRound >= 70) {
            return 'C';
        } else if (finalRound >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public double score() {
        return this.score;
    }

    public double total() {
        return this.total;
    }
}

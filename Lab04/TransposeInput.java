//Justin Schlag

import java.util.Scanner;

public class TransposeInput {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        // Read the first number to determine the size of the integer array
        int size = stdin.nextInt();

        int[] array = new int[size]; // Array to hold integers
        int count = 0; // Counter for the number of integers read

        // Read integers from standard input
        while (count < size && stdin.hasNextInt()) {
            array[count] = stdin.nextInt();
            count++;
        }

        // Read characters into a String, excluding the period "."
        String characters = "";
        char ch;
        while (stdin.hasNext()) {
            ch = stdin.next().charAt(0);
            if (ch == '.') break; // Stop reading at the period
            characters += ch; 
        }

        // Determine the maximum length for the transposed output
        int maxLength = Math.max(size, characters.length());

        // Print transposed output
        for (int i = 0; i < maxLength; i++) {
            String numPart = (i < count) ? String.valueOf(array[i]) : "_"; // Check if there's an integer
            String charPart = (i < characters.length()) ? String.valueOf(characters.charAt(i)) : "_"; // Check if there's a character
            System.out.println(numPart + "\t" + charPart);
        }

        stdin.close();
    }
}

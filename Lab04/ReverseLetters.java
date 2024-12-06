//Justin Schlag 

import java.util.Scanner;

public class ReverseLetters {
    public static void main(String[] args) {
        String inputStr = ""; // String variable to hold the characters
        boolean reading = true; // Control variable for loop

        Scanner stdin = new Scanner(System.in);

        // Indefinite loop to read characters
        while (reading) {
            String input = stdin.next(); 

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i); // Get each character
                if (ch == '.') {
                    reading = false; // Stop reading if a period is encountered
                    break; 
                } else {
                    inputStr += ch; // Append the character to the String variable
                }
            }
        }
        stdin.close();

        // Print the characters in reverse order
        for (int i = inputStr.length() - 1; i >= 0; i--) {
            System.out.print(inputStr.charAt(i)); // Use charAt to access each character
        }
        
    }
}

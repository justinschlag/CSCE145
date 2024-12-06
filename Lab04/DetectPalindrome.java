//Justin Schlag

import java.util.Scanner;

public class DetectPalindrome {
    public static void main(String[] args) {
        String forwardInput = ""; // String variable to hold the characters going forward
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
                    forwardInput += ch; // Append the character to the forward input
                }
            }
        }
        stdin.close();

        // Store original input and reversed input as string variables
        String originalInput = forwardInput; 
        String reversedInput = ""; 

        // Create the reversed string
        for (int i = originalInput.length() - 1; i >= 0; i--) {
            reversedInput += originalInput.charAt(i); // Append each character in reverse order
        }

        // Check if the original input is equal to the reversed input
        if (originalInput.equals(reversedInput)) {
            System.out.println(originalInput + " is a palindrome");
        } else {
            System.out.println(originalInput + " is not a palindrome");
        }
    }
}

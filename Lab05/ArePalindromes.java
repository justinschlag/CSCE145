//Justin Schlag 
import java.util.Scanner;

public class ArePalindromes {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        
        // Read the number of strings to expect
        int n = stdin.nextInt();
        String[] inputs = new String[n];

        // Reading n strings
        for (int i = 0; i < n; i++) {
            inputs[i] = stdin.next(); // Read string input
        }

        stdin.close();

        // Check each string for palindrome
        for (int i = 0; i < n; i++) {
            // Check if the current string is a palindrome
            if (isPalindrome(inputs[i])) {
                System.out.println(inputs[i] + " is a palindrome");
            }
        }

        // Concatenate all strings using an empty string
        String concatenated = "";
        for (String input : inputs) {
            concatenated += input; // Append each string to the concatenated variable
        }

        // Check if the concatenated string is a palindrome
        if (isPalindrome(concatenated)) {
            System.out.println(concatenated + " is a palindrome");
        }
    }

    // Method to check if a string is a palindrome
    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

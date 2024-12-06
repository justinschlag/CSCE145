//Justin Schlag 

import java.util.Scanner;

public class PrintLetters {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        // Read the first character
        String character = console.next();
        
        //read input until the user enters "."
        while(!character.equals(".")) {
            if(character.equals("+") || character.equals("-")) {
                // Read the next character and ignore it
                character = console.next();
            } else {
                // Print the character and read the next one
                System.out.print(character);
                character = console.next();
            }
        }
        
        // Close the scanner
        console.close();
    }
}

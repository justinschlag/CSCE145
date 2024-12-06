//Justin Schlag 

import java.util.Scanner;

public class PrintInts {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // Loop to read and print 10 integers
        for (int count = 0; count < 10; count++) {
            // Read the next integer from the user
            int number = console.nextInt();
            // Print the integer
            System.out.print(number);
            
            // Print a comma and space if it's not the last integer
            if (count < 9) {
                System.out.print(", ");
            }
        }

        // Print a period after tenth number
        System.out.print(".");

        // Close scanner
        console.close();
    }
}

//Justin Schlag 

import java.util.Scanner;

public class OffsetArithmetic {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        
        int size = stdin.nextInt();

        // Initialize an array to hold integers (size can be increased as needed)
        int[] array = new int[size];
        int count = 0;

        // Read integers from standard input until encountering a '/'
        while (count < array.length && stdin.hasNext()) {
            if (stdin.hasNextInt()) {
                array[count] = stdin.nextInt();
                count++;
            } else if (stdin.next().equals("/")) {
                break; // Stop reading on encountering '/'
            }
        }

        // Perform addition and subtraction according to the specified pattern
        for (int i = 0; i < count / 2; i++) {
            
            if (i % 2 == 0) {
                int result = array[i] + array[count - 1 - i];
                System.out.println(array[i] + " + " + array[count - 1 - i] + " = " + result);
            } 
            
            else {
                int result = array[i] - array[count - 1 - i];
                System.out.println(array[i] + " - " + array[count - 1 - i] + " = " + result);
            }
        }

        // Handle the case for if count is odd
        if (count % 2 == 1) {
            System.out.println(array[count / 2] + " + 0 = " + array[count / 2]);
        }

        // Close the scanner
        stdin.close();
    }
}

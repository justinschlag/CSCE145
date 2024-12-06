//Justin Schlag

import java.util.Scanner;

public class IsSubsequence {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        
        // Read the size of the first array
        int n = stdin.nextInt();
        int[] firstArray = new int[n];
        
        // Read the elements of the first array
        for (int i = 0; i < n; i++) {
            firstArray[i] = stdin.nextInt();
        }
        
        // Read the size of the second array
        int m = stdin.nextInt();
        int[] secondArray = new int[m];
        
        // Read the elements of the second array
        for (int i = 0; i < m; i++) {
            secondArray[i] = stdin.nextInt();
        }
        
        // Check if secondArray is a subsequence of firstArray
        boolean isSubsequence = isSubsequence(firstArray, secondArray);
        
        // Output the result
        if (isSubsequence) {
            System.out.println("is subsequence");
        } else {
            System.out.println("is not subsequence");
        }
        
        stdin.close();
    }
    
    private static boolean isSubsequence(int[] firstArray, int[] secondArray) {
        int j = 0; 
        for (int i = 0; i < firstArray.length; i++) {
            if (j < secondArray.length && firstArray[i] == secondArray[j]) {
                j++;
            }
        }
        // If j has traversed the whole secondArray, it is a subsequence
        return j == secondArray.length;
    }
}

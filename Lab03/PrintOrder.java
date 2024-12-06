//Justin Schlag

import java.util.Scanner;

public class PrintOrder {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        //empty string to hold the final word
        String word = "";
        String letter = console.next();

        //Loops around until it reads "."
        while (!letter.equals(".")) {
        	//If input is "-" reads next three letters and puts them in front of word
            if (letter.equals("-")) {
            	for(int i = 0; i<3; ++i) {
                letter = console.next();
                word = letter.concat(word); 
            	}
                
            	//If input is "+" it reads the next three letters and appends them to word
            } else if (letter.equals("+")) {
            	for(int i = 0; i<3; ++i) {
                letter = console.next();
                word = word.concat(letter); 
            }
            }
            
            //Reads next letter for it to loop back around
            letter = console.next(); 
        }

        //prints final word
        System.out.println("The word is: " + word);
      
        console.close();
        
}
}

package mini_assignment_one;
import java.util.Scanner;
public class Q3 { 
  
    // Function that implements the 
    // number guessing game 
public static void main(String[] strings)  { 
        // Scanner Class 
        Scanner input = new Scanner(System.in); 
  
        // Generate the random number
        int number = 1 + (int)(100* Math.random()); 
        //create the guess variable
        int guess; 
  
        //print statement prompting user to guess number
        System.out.println( "Guess a number from 0-100"); 
  
        //create do while statement
        do { 
        	
        	//input guess
            System.out.println( 
                "Enter a number:"); 
  

            guess = input.nextInt(); 
            
            //if number is correct then notify user they were correct
            if (number == guess) { 
                System.out.println( 
                    "Correct!"); 
                break; 
            } 
            
            //if number is greater than guess, notify user their guess is too low
            else if (number > guess) { 
                System.out.println( 
                    "Too low. " + guess); 
            } 
            //if number is less than guess, notify user their guess is too high
            else if (number < guess ) { 
                System.out.println( 
                    "Too high.  " + guess); 
            } 
        }
        //do while guess is not equal to number 
        while (guess != number);
        //close scanner 
        input.close();
}


}   
  

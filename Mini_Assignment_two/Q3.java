package Mini_Assignment_two;

import java.util.Scanner;

public class Q3 {
	
public static void main (String[] args) 
{ 
	
	//scanner class
    Scanner input = new Scanner(System.in);
    
    //prompt the user to enter a string 
    System.out.print("Enter a string representing any number of wins, draws and losses e.g. \"WWDLDL\"");
    String Results = input.next();
	input.close();
	
	
	//if statement using regex to ensure that only W,D or L are inputed
	if (Results.matches("^[W|D|L]*$")) {
		//calling method to print the results and the average points
		System.out.println("Total points: " + ResultCalculator(Results));
		System.out.println("Average points: " + ResultCalculator(Results)/Results.length());
		} else {
			
			//print statement for invalid format 
		System.out.println("invalid format, try again");
		}
	

};


public static double ResultCalculator(String results) {
	
	// initialize the total points at zero 
	double totalPoints = 0;
	
	//for loop in range 0 to the length of the string inputed 
	for (int i=0; i < results.length(); i++) {
		
		//number of if statements adding to the total points dependent on the letter of the string
		char character = results.charAt(i);
		if (character == 'W') {
			totalPoints += 3;
		}
		else if (character == 'D') {
			totalPoints += 1;
		}
		
		else if (character == 'L') {
			totalPoints += 0;
		}
		
	}
	// return the total points calculated 
	return totalPoints;
	}

}
  
  


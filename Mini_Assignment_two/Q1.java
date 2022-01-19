package Mini_Assignment_two;

import java.util.Scanner;

public class Q1 {
	


public static void main (String[] args) 
{ 
	//scanner class
    Scanner input = new Scanner(System.in);
    
    //prompt user to input investment amount
    System.out.print("Enter an investment amount: ");
    double Investment = input.nextDouble();
    
    //prompt user to input interest rate 
    System.out.print("Enter the monthly interest rate: ");
    double Interest = input.nextDouble();
	input.close();
	
	//if statement to ensure amount entered is positive 
	if (Investment >= 0) {
	
	// print out table headings 
	System.out.println("Years    FutureValue");
	
	//for loop iterating through each year (30 years) and calling method with users input 
	for(int i = 1; i <= 30; i++) {
		
		//print year and result
		System.out.printf(i + "%"+ 20 + ".2f\n", futureValue(Investment, Interest/1200, i));
       }
	 }
	else {
		//print statement if negative number entered
		System.out.println("Please enter an Investment amount greater or equal to zero");
	}
	}


public static double futureValue(double amount, double monthlyRate, int years) {
	
	//method calculating the future investment formula as given 
	return amount*(Math.pow(1+monthlyRate, years*12));

}

	}
  
  

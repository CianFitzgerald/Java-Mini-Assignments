package mini_assignment_one;

import java.util.Scanner;
public class Q1{
	public static void main(String[] args) {
			

        // Scanner Class 
		Scanner input = new Scanner(System.in);



	    //read input of take off speed
	    System.out.println("Enter the take off speed of the airplane: ");
		int velocity = input.nextInt();		
		
		//read input of acceleration
	    System.out.println("Enter the accceleration of the airplane: ");
		int acceleration = input.nextInt();
		
		
		//read input of weather conditions
	    System.out.println("Enter the weather conditions (w if wet, d if dry): ");
		String weather = input.next();
		
		//error handling if incorrect weather is input
		if (weather.equals("w") || weather.equals("W") || weather.equals("d") || weather.equals("D") ) {
			
			
			//perform calculation for calculating the run way length
			double length = (Math.pow(velocity, 2))/(2*acceleration);
		
			//if weather is wet, create new length and display result
			if (weather.equals("w") || weather.equals("W")) {
				double newlength = 1.15*length;
			    System.out.println("the runway length is: " + newlength);

			}
			//if weather is dry, display result
			else if (weather.equals("d") || weather.equals("D")) {
			    System.out.println("the runway length is: " + length);

			}

		}else {
		//display error message
		    System.out.println("Error: please enter upper or lowercase w or d for wet or dry.");
		}
		
		
		//close scanner
		input.close();
	

	}
	

}
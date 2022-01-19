package Mini_Assignment_two;

import java.util.Scanner;

public class Q2 {
	


public static void main (String[] args) 
{ 
	//scanner class
    Scanner input = new Scanner(System.in);
    
    //prompt user to enter a password 
    System.out.print("Enter a Password: ");
    String password = input.next();
	input.close();
	 
	//if all conditions met then print valid password, otherwise print invalid password
    if (Password_length(password) ==  Password_contents(password) == Password_digits(password) == true){
        System.out.print("valid password");
	    }
    else {
        System.out.print("Invalid password, please try again");

    }
}


public static Boolean Password_length(String Password) {
	//if the password is less than or equal to 10 characters return false, else true
	if (Password.length()<=10)
		return false;
	
	else return true;
	}
	
public static Boolean Password_contents(String Password) {
	
	//initialize number of letter and digits at zero
    int letters = 0;
    int digits = 0;
    
    //for loop in range 0 to length of the password input by the user 
    for (int i = 0; i < Password.length(); i++){
    	
    	//iterate through the password string and add to the letter or digits dependent on what type of character is used 
        if (Character.isLetter(Password.charAt(i)))
            letters++;
        else if (Character.isDigit(Integer.valueOf(Password.charAt(i))))
        	digits++;
    }
    	//return true if the number of letters plus digits is equal to the password length
    	//this ensures only letters and digits are used 
    
        return letters+digits == Password.length();
    }

public static Boolean Password_digits(String Password) {
	
	//initialize the number of digits at zero
    int digits = 0;
    
    //for loop to iterate through the string and add up the number of digits in the password 
    for (int i = 0; i < Password.length(); i++){
        if (Character.isDigit(Integer.valueOf(Password.charAt(i))))
        	digits++;
    }
    	//return true if the number of digits in the password is greater or equal to three
        return digits >= 3;
    }
}


  
  

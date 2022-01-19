package mini_assignment_one;
import java.util.Scanner;
public class Q4 { 
public static void main(String[] strings) {
	
    // Scanner Class
	Scanner input = new Scanner(System.in);
	
    //read input of first string
    System.out.println("Enter a string: ");
	String string_one = input.nextLine();
	
    //read input of second string
    System.out.println("Enter another string: ");
	String string_two = input.nextLine();
	
	//close scanner
    input.close();
    
    //Calculate the shorter string of the two
	int minimum =  Math.min(string_one.length(),string_two.length());
	
	//create a mutable string object that can be appended to 
    StringBuilder output = new StringBuilder();
    
    //for loop in range zero to length of shorter string 
	for (int i=0; i<minimum; i++) {
		
		//if the characters at i are equal, append this character to the string builder
		if (string_one.charAt(i) == string_two.charAt(i)) {
	         output.append(string_one.charAt(i));
	         
	    //else break the loop
		} else {
			break;
		}
	}
	
	//create a new string with the output from the string builder
	String newstring;
	newstring = output.toString();
	
	//if the new string is empty then there are no common prefixes
	//If the string is not empty then display the results.
	if (newstring.isEmpty()) {
		System.out.println("no common prefix.");
		
	}else {
		System.out.println(output);
		}

	}
}




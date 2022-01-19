package Mini_Assignment_Four;
import java.io.*;

public class Q2 {
 public static void main(String[] args) {

	 //create a date variable that stores the current date and time 
	 java.util.Date date= new java.util.Date(); 
	 
	 //construct file object using arguments from the command line
     File file1 = new File(args[0]);
     
     //construct the renamed file object, taking the original files name and adding the date onto it 
     File file2 = new File(file1.getName() + date);
     
     //boolean variable to rename the file
     boolean Rename = file1.renameTo(file2);
     
     //if the boolean variable is true then print statement notifying user that it was a success
     //and print the new file name 
     if(Rename) {
	      System.out.println("Success. New file is: " + file2);
	      
	 //if boolean variable is false then notify the user that the file does not exist.
     }else {
	      System.out.println("File does not exist");
     }

 }
}

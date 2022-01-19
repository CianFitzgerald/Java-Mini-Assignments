package mini_assignment_one;
import java.util.Scanner;
public class Q2 {

    
  public static void main(String[] strings) {
      	// Scanner Class 
        Scanner input = new Scanner(System.in);
        
	    //read input of month number
        System.out.print("Enter the month number for which you would like to find the number of days: ");
        int month = input.nextInt();
        


	    //read input of year 
        System.out.print("Enter the year ");
        int year = input.nextInt();
        
        //close scanner
		input.close();
		
        //Initialize days and months variables
        int Days = 0; 
        String Month = "";
		//create switch statement with month as variable to be tested
		//manually enter number of days for each month, except February
		//break after each case 
        if (month > 12 || month<1) {
            System.out.print("Error: please enter a number between 1 and 12");

        } else {
        
        switch (month) {
            case 1:
                Month = "January";
                Days = 31;
                break;
            case 2:
                Month = "February";
                //if statement included to account for leap years, 29 days on leap year
                //28 days otherwise
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    Days = 29;
                } else {
                    Days = 28;
                }
                break;
            case 3:
                Month = "March";
                Days = 31;
                break;
            case 4:
                Month = "April";
                Days = 30;
                break;
            case 5:
                Month = "May";
                Days = 31;
                break;
            case 6:
                Month = "June";
                Days = 30;
                break;
            case 7:
                Month = "July";
                Days = 31;
                break;
            case 8:
                Month = "August";
                Days = 31;
                break;
            case 9:
                Month = "September";
                Days = 30;
                break;
            case 10:
                Month = "October";
                Days = 31;
                break;
            case 11:
                Month = "November";
                Days = 30;
                break;
            case 12:
                Month = "December";
                Days = 31;
        }
        //display results 
        System.out.print(Month + " " + year + " has " + Days + " days");
    }
  }
}
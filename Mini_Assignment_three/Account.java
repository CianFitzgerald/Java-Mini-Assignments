package Mini_Assignment_3;
import java.util.Date;


public class Account{
	
	//Creating data fields with default values 
	private int id = 0; 
	private double balance = 0;
	private Date dateCreated;
	private double annualInterestRate = 0;
	
	//creating no argument constructor that sets all default values and sets the date 
	public Account() {
		Date d = new Date();
		dateCreated = d;
	}
	
	//constructor for an account with specified details
	public Account(int new_id, double new_balance) {
		id = new_id;
		balance = new_balance;
		Date new_dateCreated = new Date();
		dateCreated = new_dateCreated;
	}
	
	//getter method for id
	public double getid() {
		return id;
	}

	//setter method for id
	public void setid(int id) {
		this.id = id;
	}
	
	//getter method for balance
	public double getbalance() {
		return balance;
	}

	//setter method for balance
	public void setbalance(double balance) {
		this.balance = balance;
	}
	
	//getter method for annual Interest Rate
	public double getannualInterestRate() {
		return annualInterestRate;
	}

	// Setter method for annual interest rate
	public void setannualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	//getter method for date created
	public Date getdateCreated() {
		return dateCreated;
	}
	
	//method that gets the monthly interest rate 
	public double getMonthlyInterest() {
		return balance*(annualInterestRate/12);
	}

	//method that withdraws specified amount from the balance 
	public void withdraw(double withdraw_amount) {
		this.balance = balance - withdraw_amount;
	}
	
	//method that deposits specified amount and adds to balance 
	public void deposit(double deposit_amount) {
		this.balance = balance + deposit_amount;
	}
	
	
	//method to return a string representation of the account details.
	public String toString() {
		 return "Account id: " + id + "\n" + "Account balance: " + balance + "\n" + "Date account created: " + dateCreated;
	}
	
	
	

}

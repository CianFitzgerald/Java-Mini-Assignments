package Mini_Assignment_3;

public class TestAccount {
	
	public static void main(String[] args) {
		
		//creating account 
		Account A1 = new Account(101, 20000);
		
		//setting annual Interest Rate
		A1.setannualInterestRate(0.045);
		
		//withdrawing 2500
		A1.withdraw(2500);
		
		//depositing 3000
		A1.deposit(3000);
		
		//displaying balance, interest rate (monthly) and date created.
		System.out.println("balance: " + A1.getbalance());
		System.out.println("Monthly Interest: " + A1.getMonthlyInterest());
		System.out.println("Date Account created: " + A1.getdateCreated());

	}
}



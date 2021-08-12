import java.util.ArrayList;

public class BankApp {
	int balance;
	String[] history = new String[500];
	int index;
	
	public void deposit(int amount) {
		balance = balance + amount;
		System.out.println("You've chosen to deposit $" + amount + " from your bank account.");
		System.out.println("You're current balance is now $" + balance + "." + "\n");
		//history[index] = "Deposited $" + Integer.toString(amount);
		//index++;
	}
	
	public void withdraw(int amount) {
		balance = balance - amount;
		System.out.println("You've chosen to withdraw $" + amount + " from your bank account.");
		System.out.println("You're current balance is now $" + balance + "." + "\n");
		//history[index] = "Withdrew $" + Integer.toString(amount);
		//index++;
	}
	
	public void currentBalance() {
		System.out.println("Your current balance is $" + balance + "." + "\n");
	}
	
	/*
	public void transactionHist() {
		if(history.length == 0) {
			System.out.println("There are no previous transactions." + "\n");
		} else {
			for(int i=history.length-1;i>=Math.max(0, history.length-3);i--) {
				System.out.println(history[i]);
			}
		}
	}
	*/
	
	
	
	
	
	
}

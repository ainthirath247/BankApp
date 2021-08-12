import java.util.Scanner;

public class InputScanner extends BankApp {
	
	
	
	public static void main(String[] args) {
		displayMenu();
		
	}
	
	public static void displayMenu() {
			
		BankApp currentUser = new BankApp();
		String str_input = "";
		
		do {	
			Scanner inputObj = new Scanner(System.in);
			System.out.println("What would you like to do? (Please enter the number corresponding to the desired action)" + "\n");
			
			System.out.println("(A) Deposit to your account");
			System.out.println("(B) Withdraw from your account");
			System.out.println("(C) Check your balance");
			//System.out.println("(D) Transaction History");
			System.out.println("(D) Exit");
			
			str_input = inputObj.nextLine().toLowerCase();
			
			switch(str_input) {
				case "a": 
					System.out.println("How much do you want to deposit out of your bank account?");
					Scanner depObj = new Scanner(System.in);
					int dep_amount = depObj.nextInt();
					currentUser.deposit(dep_amount);
					break;
				case "b": 
					System.out.println("How much do you want to withdraw from your bank account?");
					Scanner withObj = new Scanner(System.in);
					int with_amount = withObj.nextInt();
					currentUser.withdraw(with_amount);
					break;
				case "c": 
					currentUser.currentBalance();
					break;
				/*	
				case "d": 
					System.out.println("Here is your transaction history:");
					currentUser.transactionHist();
					break;
				*/	
				default: System.out.println("You've chosen to exit. Have a good day!");
					break;
			}
		} while(!str_input.equals("d"));	
		
	}
}

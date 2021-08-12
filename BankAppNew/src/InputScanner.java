import java.util.Scanner;

public class InputScanner {
	public static void main(String[] args) {
		Scanner inputObj = new Scanner(System.in);
		System.out.println("What would you like to do? (Please enter the number corresponding to the desired action)" + "\n");
		
		System.out.println("(1) Deposit to your account");
		System.out.println("(2) Withdraw from your account");
		System.out.println("(3) Check your balance");
		System.out.println("(4) Transaction History");
		System.out.println("(5) Exit");
		
		String str_input = inputObj.nextLine();
		System.out.println("You would like to: " + str_input);
	}
}

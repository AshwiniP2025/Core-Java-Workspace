package Encapsulation;

public class BankAccountMain {
	public static void main(String[] args) {
		BankAccount account = new BankAccount(123456789, "Ashwini Pardeshi", 5000);
		
		account.displayAccountInfo();
		
		account.Deposit(1500);
		account.Withdraw(2000);
		account.Withdraw(6000);
		
		System.out.println("Final Balance: " + account.getBalance());
	}

}

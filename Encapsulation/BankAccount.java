package Encapsulation;

public class BankAccount {
	
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	
	public BankAccount(int accountNumber, String accountHolderName, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public int getAccountNumber(){
		return accountNumber;
	}
	
	public String getAccountHolderName(){
		return accountHolderName;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void Deposit (double ammount) {
		if(ammount > 0) {
			balance += ammount;
		System.out.println("Deposited: " + ammount);
		
	  } else {
		  System.out.println("Invalid deposit ammount");
        }
	}
	
	public void Withdraw (double ammount) {
		if(ammount > 0 && ammount <= balance) {
			balance -= ammount;
			System.out.println("Withdraw: " +ammount);
	    
		} else if (ammount > balance) {
			System.out.println("Insufficient balance!");
	    	
	    }
     }
	public double getBalance1() {
		return balance;
	}
	public void displayAccountInfo() {
		System.out.println("Account Number " + accountNumber);
		System.out.println("Account Holder " + accountHolderName);
		System.out.println("Balance " + balance);
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
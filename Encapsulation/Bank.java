package Encapsulation;

public class Bank {
	
	public static void main(String [] args) {
		
		Account a = new Account();
		a.setPin( 1234);
		System.out.println(a.getPin());
	}

}

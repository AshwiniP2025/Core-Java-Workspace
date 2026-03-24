package Abstraction;

public class CreditCardPayment implements PaymentGeteway{

	@Override
	public void processPayment(double amount) {
	
		System.out.println("Processing credit card payment of " + amount);
		
		System.out.println("Credit card payment successful.");
	}

	@Override
	public String generateReciept(String transitionID) {
		
		return "Credit card payment reciept\nTransitionId: " + transitionID+ "\nstatus: Successful";
	}
	
}

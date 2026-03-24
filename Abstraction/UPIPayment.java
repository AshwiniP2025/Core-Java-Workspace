package Abstraction;

public class UPIPayment implements PaymentGeteway {

	@Override
	public void processPayment(double amount) {
		
		System.out.println("Processing UPT payment of " + amount);
		
		System.out.println("UPI payment successful.");
		
	}

	@Override
	public String generateReciept(String transitionID) {
		
		return "UPI payment reciept\nTransitionId: " + transitionID+ "\nstatus: Successful";
	}
}


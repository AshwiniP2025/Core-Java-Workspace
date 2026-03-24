//1. Payment Gateway Integration: Create an interface PaymentGateway with methods process Payment(double amount)' and 'generate Receipt(String transactionld). Implement two classes 'CreditCard Payment and 'UPIPayment that perform payment processing differently. Write a driver class to simulate payment through both gateways and display the receipts.
package Abstraction;

public interface PaymentGeteway {
	public void processPayment(double amount);
	public String generateReciept(String transitionID);
	
}
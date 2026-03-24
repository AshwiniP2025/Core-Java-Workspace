package Abstraction;

public class PaymentTest {
	public static void main(String [] args) {
		
		PaymentGeteway pay = new CreditCardPayment();
				pay.processPayment(1500.00);
				
				System.out.println(pay.generateReciept("cc12345"));
				
				System.out.println("----------------------------------------------------------");
				
	    PaymentGeteway upipay = new UPIPayment();
	           upipay.processPayment(500.00);
	           
	           System.out.println(upipay.generateReciept("UPI12345"));
	}

}

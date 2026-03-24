package Abstraction;

public class SmartLight implements SmartDevice{

	@Override
	public void turnon() {
		System.out.println("Smart Light is turned ON");
		
	}

	@Override
	public void turnoff() {
		System.out.println("Samrt Light is tuened OFF");
		
	}

	@Override
	public void getStatus() {
		System.out.println("Smart Light Status:" );
		
	}

}

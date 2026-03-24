package Abstraction;

public class SmartFan implements SmartDevice{

	@Override
	public void turnon() {
		System.out.println("Smart Fan is turned ON");
		
	}

	@Override
	public void turnoff() {
		System.out.println("Smart Fan is turned OFF");
		
	}

	@Override
	public void getStatus() {
		System.out.println("Smart Light Status:" );
		
	}

}

package Abstraction;

public abstract class Vehicle {
	
	abstract void start();
	
	public void fuel() {
		System.out.println("Vehicle uses fuel");
	}
}


//Car class
public class Car extends Vehicle{

	@Override
	void start() {
		System.out.println("Car start with key");	
	}
}


//Bike class
public class Bike extends Vehicle{

	@Override
	void start() {
		System.out.println("Bike starts with kick or self-start");
	}
}


//Main class
public class VehicleMain {
	public static void main(String[] args) {
		Vehicle v1 = new Car();
		Vehicle v2 = new Bike();
		
		v1.fuel();
		v1.start();
		
		v2.fuel();
		v2.start();
	}
}

package Polymorphism;

public class VehicleMain {
	public static void main(String [] args) {
		Vehicle myvehicle = new Vehicle();
		Bike mybike = new Bike();
		
		myvehicle.run();
		mybike.run();
	}
}

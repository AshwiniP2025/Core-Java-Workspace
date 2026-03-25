package Inheritance;

public class Bike extends Vehical{
	
	public void show() {
		name = "Royal Enfield";
		type = "Bullet";
		color = "Black";
		price = 150000;
		System.out.println("BikeName = " +name);
		System.out.println("BikeType = " +type);
		System.out.println("BikeColor = " +color);
		System.out.println("BikePrice = " +price);
	}
}

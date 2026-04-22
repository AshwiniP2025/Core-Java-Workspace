package Constructor;

public class CarMain {
	public static void main(String [] args) {
		Car c1 = new Car();
		Car c2 = new Car("Breeza", "Red");
		System.out.println(c1.name);
		System.out.println(c2.name);
		System.out.println(c2.color);
	}

}

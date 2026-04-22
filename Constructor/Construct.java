package Constructor;

public class Construct {
	public Construct() {
		System.out.println("Construct Running");
	}
	public Construct(int a) {
		System.out.println("Construct Running " +a);
	}
	
	public static void main(String [] args) {
		Construct c1 = new Construct();
		
		Construct c2 = new Construct(5);
	}

}

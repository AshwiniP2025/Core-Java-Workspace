package Constructor;

public class Demo {
	
	int Value1;
	int Value2;
	public Demo() {
	   Value1 = 10; 
	   Value2 = 20;
	   System.out.println("Inside Constructor ");
	}
	public void display() {
		System.out.println("Value1 === " +Value1);
		System.out.println("Value2 === " +Value2);
	}
	
	public static void main(String [] args) {
		Demo d = new Demo();
		d.display();
	}

}
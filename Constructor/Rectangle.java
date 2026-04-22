package Constructor;

public class Rectangle {
	public double length;
    public double width;
    
    public Rectangle(double length, double width) {
    	this.length = length;
    	this.width = width;
    }
    public void Calculate() {
    	double area;
    	area = length * width;
    	System.out.println("Calculate area:" +area);
    }
    public static void main(String[] args) {
    	Rectangle r1 = new Rectangle(2,5);
    	Rectangle r2 = new Rectangle(4,2);
    	
    	r1.Calculate();
    	r2.Calculate();
	}
    
}

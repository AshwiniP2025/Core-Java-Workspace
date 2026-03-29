package Polymorphism;

public class Calc {
	
	 public float add(int a, float b) {
	        return a + b;
	    }

	    public double add(int a, double b) {
	        return a + b;
	    }
	    
	    public float add(int a, long b, float c) {
	        return a + b + c;
	    }

	    public double add(int a, long b, float c, double d) {
	        return a + b + c + d;
	    }

	    public static void main(String[] args) {
	        Calc c = new Calc();

	        System.out.println("Add int and float: " + c.add(5, 3.5f));           
	        System.out.println("Add int and double: " + c.add(5, 4.5d));            
	        System.out.println("Add int, long, float: " + c.add(1, 2L, 3.5f));     
	        System.out.println("Add int, long, float, double: " + c.add(1, 2L, 3.5f, 4.25d)); 
	    }
	}
	
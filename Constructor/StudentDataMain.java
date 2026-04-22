package Constructor;

public class StudentDataMain {
	public static void main(String args[]) { 
		 
		  StudentData sd1 = new StudentData(); 
		  System.out.println("Student Name is: " + sd1.getStuName()); 
		  System.out.println("Student Age is: " + sd1.getStuAge()); 
		  System.out.println("Student ID is: " + sd1.getStuID()); 
		  
		  StudentData sd2 = new StudentData(200, "Divya", 21); 
		  System.out.println("Student Name is: " + sd2.getStuName()); 
		  System.out.println("Student Age is: " + sd2.getStuAge()); 
		  System.out.println("Student ID is: " + sd2.getStuID()); 
		 }

}

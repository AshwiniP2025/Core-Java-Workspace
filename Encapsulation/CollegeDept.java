package Encapsulation;

public class CollegeDept {
	public static void main(String [] args) {
		Student s = new Student();
		s.setName("Ashwini");
		s.setUserId(20);
		s.setPassword(2025);
		System.out.println("Student name- " +s.getName());
		System.out.println("Student userId- " +s.getUserId());
		System.out.println("Student password- " +s.getPassword());
	}

}

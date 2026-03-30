package Encapsulation;

public class Student {
	public String name;
	public int userId;
	private int password;
	
	public String getName() {
		return name;
		
	}
	public int getUserId() {
		return userId;
	}
	public int getPassword() {
		return password;
	}
	
	public void setName(String name) {
		this.name = name;	
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public void setPassword(int password) {
		this.password = password;
	}

}



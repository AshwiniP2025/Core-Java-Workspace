package Constructor;

public class Friend {
	public String name;
	public String nickname;
	public String type;
	private int age;
	private String address;
	private long phone;

	public String getName() {
		return name;
	}

	public String getNickname() {
		return nickname;
	}

	public String getType() {
		return type;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public long getPhone() {
		return phone;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Friend() {
		this.name = "Ashwini";
		this.nickname = "hsg";
		this.type = "null";
		this.age = 21;
		this.address = "pune";
		this.phone = 2345678923L;
	}

	public Friend(String name, String nickname, String type, int age, String address, long phone) {
		this.name = name;
		this.nickname = nickname;
		this.type = type;
		this.age = age;
		this.address = address;
		this.phone = phone;

	}

	@Override
	public String toString() {
		return "Friend [name=" + name + ", nickname=" + nickname + ", type=" + type + ", age=" + age + ", address="
				+ address + ", phone=" + phone + "]";
	}

}



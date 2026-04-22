package Constructor;

public class StudentData {
	
		private int stuID;
		private String stuName;
		private int stuAge;
		
		public StudentData() {
			stuID = 100;
			stuName = "Ashwini";
			stuAge = 21;
		}
		public StudentData(int stuID,String stuName, int stuAge) {
			stuID = 200;
			stuName = "divya";
			stuAge = 21;
		}
		public int getStuID() {
			return stuID;
	}
		public void setStuID(int stuID) {
			this.stuID = stuID;
		}
		public String getStuName() {
			return stuName;	
		}
		public void setStuName(String stuName) {
			this.stuName = stuName;
		}
		public int getStuAge() {
			return stuAge;
		}
		public int setStuAge(int stuAge) {
			return stuAge;
		}

}


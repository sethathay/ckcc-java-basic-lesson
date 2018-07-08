package exercise3;

public class Student {
	
	String name;
	int age;
	String address;
	
	Student() {
		name = "unknown";
		age = 0;
		address = "not available";
	}
	
	Student(String stuName, int stuAge, String stuAddress) {
		name = stuName;
		age = stuAge;
		address = stuAddress;
	}
	
	void setInfo(String adjustName, int adjustAge) {
		name = adjustName;
		age = adjustAge;
	}
	
	void setInfo(String adjustName, int adjustAge, String adjustAddress) {
		name = adjustName;
		age = adjustAge;
		address = adjustAddress;
	}
	
	void printStudentInfo() {
		System.out.println(name + " is a student and he/she now is " + age + " years old. He/she lives in " + address + ".");
	}
}

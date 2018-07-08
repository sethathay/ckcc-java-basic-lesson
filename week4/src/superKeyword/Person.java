package superKeyword;

public class Person {
	private String name;
	protected String dob;
	public Person() {
		
	}
	public Person(String name, String dob) {
		this.name = name;
		this.dob = dob;
	}
	public void getInfo() {
		System.out.println("Hello, my name is :" + name + " I was born in " + dob);
	}
}

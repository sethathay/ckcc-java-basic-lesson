package superKeyword;

public class Employee extends Person {
	int employeeID;
	int salary;
	String startDate;
	public Employee(int employeeID, int salary, String startDate, String name, String dob) {
		super(name, dob);
		this.employeeID = employeeID;
		this.salary = salary;
		this.startDate = startDate;
	}
	public void getInfo() {
		super.getInfo();
		System.out.println("He/She works as employee from " + startDate + " with salary " + salary);
	}
	public static void main(String[] args) {
		Employee anEmployee = new Employee(1001, 300, "03/04/2018", "Sok Piseth", "03/12/1998");
		anEmployee.getInfo();
	}
}

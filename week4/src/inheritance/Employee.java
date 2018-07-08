package inheritance;

public class Employee extends Person {
	int employeeID;
	int salary;
	String startDate;
	public void getEmployeeInfo() {
		getPersonInfo();
		System.out.println("He/She works as employee from " + startDate + " with salary " + salary);
	}
	public static void main(String[] args) {
		Employee anEmployee = new Employee();
		anEmployee.name = "Sok Piseth";
		anEmployee.dob = "03/12/1998";
		anEmployee.employeeID = 1001;
		anEmployee.salary = 300;
		anEmployee.startDate = "03/04/2018";
		anEmployee.getEmployeeInfo();
	}
}

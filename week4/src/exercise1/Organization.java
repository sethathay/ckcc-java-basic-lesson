package exercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class Organization {
	
	public static void main(String[] args) {
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		ArrayList<Staff> staffList = new ArrayList<Staff>();
		
		Scanner sc = new Scanner(System.in);
		
		//Enter organization name
		System.out.println("Enter your name of your organization: ");
		String orgName = sc.nextLine();
		
		System.out.println("Enter number of staff in your organization: ");
		int numberOfStaff = sc.nextInt();
		// Skip the newline
		sc.nextLine();
		for(int i=0; i<numberOfStaff; i++) {
			System.out.println("Enter your staff name: ");
			String staffName = sc.nextLine();
			System.out.println("Enter your staff address: ");
			String address = sc.nextLine();
			System.out.println("Enter your staff school: ");
			String school = sc.nextLine();
			System.out.println("Enter your staff payment: ");
			double pay = sc.nextDouble();
			// Skip the newline
			sc.nextLine();
			Staff newStaff = new Staff(staffName, address, school, pay);
			System.out.println("");
			System.out.println(newStaff.toString());
			System.out.println("");
			staffList.add(newStaff);
		}
		//Display information of organization
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("###################################################");
		System.out.println("NAME OF ORGANIZATION: " + orgName);
		System.out.println("###################################################");
		System.out.println("");
		System.out.println("Number of Staff: " + staffList.size());
		System.out.println("");
		for(int i=0; i<numberOfStaff; i++) {
			Staff staff = staffList.get(i);
			System.out.println("No." + (i + 1) + " - " + staff.toString());			
		}
	}

}

package exercise3;

import java.util.Scanner;

public class StudentList {
	
	void printStudentInfo(Student[] stuList) {
		for(int i = 0; i<stuList.length; i ++) {
			stuList[i].printStudentInfo();
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// Create array of object student
		Student[] students = new Student[5];
		
		// Create object of 5 students
		Student stu1 = new Student("Sok Bopha", 25, "Phnom Penh");
		Student stu2 = new Student();
		Student stu3 = new Student("Prom Sopheareak", 24, "Battambang Province");
		Student stu4 = new Student();
		Student stu5 = new Student("Keo Sambath", 30, "Kratie");
		
		// Adding students to array
		students[0] = stu1;
		students[1] = stu2;
		students[2] = stu3;
		students[3] = stu4;
		students[4] = stu5;
		
		StudentList st = new StudentList();
		st.printStudentInfo(students);
		
		System.out.println("//////////////////////////////////////////");
		
		stu2.setInfo("Sok Chanrath", 25);
		
		st.printStudentInfo(students);
		
	}

}

package com.javaintroduction;

public class EmployeeInMethods {
	static String organisation = "V Cube";

	public static void main(String[] args) {
		EmployeeInMethods em1 = new EmployeeInMethods();
		em1.employeeInfo(1, "Suji", 35000, "cse");
		// System.out.println(em1);
		// EmployeeInMethods em2=new EmployeeInMethods();

	}

	public void employeeInfo(int eid, String ename, double salary, String dept) {
		System.out.println("********Employ info*********");

		System.out.println("Organisation: " + organisation + " | Emp Id: " + eid + " | Emp Name: " + ename
				+ " | Emp Salary: " + salary + " | Emp dept: " + dept);

	}
}

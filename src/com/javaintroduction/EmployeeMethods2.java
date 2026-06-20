package com.javaintroduction;

import java.util.Scanner;

public class EmployeeMethods2 {
	int eid;
	String ename;
	double salary;
	String dept;

	public static void main(String[] args) {
		EmployeeMethods2 em=new EmployeeMethods2();
		em.emp();
		em.emp();
			
	}
	public void emp() {
		Scanner sin=new Scanner(System.in);
		System.out.println("enter emp id");
		eid=sin.nextInt();
		System.out.println("enter emp name");
		ename=sin.next();
		System.out.println("enter salary");
		salary=sin.nextDouble();
		System.out.println("enter emp dept");
		dept=sin.next();
		System.out.println(" Emp Id: "+eid+" | Emp Name: "+ename +" | Emp Salary: "+salary+" | Emp dept: " +dept );
		
		
		
	}

}

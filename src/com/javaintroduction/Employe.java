package com.javaintroduction;

public class Employe {
	static String organisation="V Cube";
	int eid;
	String ename;
	double salary;
	String dept;

	public static void main(String[] args) {
		System.out.println("********Employ info*********");
		Employe em=new Employe();
		em.eid=01;
		em.ename="Sujitha";
		em.salary=27000;
		em.dept="cse";
		System.out.println("Organisation: "+ organisation +" | Emp Id: "+em.eid+" | Emp Name: "+em.ename +" | Emp Salary: "+em.salary+" | Emp dept: " +em.dept );
	}

}

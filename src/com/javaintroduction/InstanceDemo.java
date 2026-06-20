package com.javaintroduction;

public class InstanceDemo {
	int id;
	String name;

	public static void main(String[] args) {
		// System.out.println(id); //can't assign default vales because these are instance variables
		//so create object
		InstanceDemo i1=new InstanceDemo();
		System.out.println(i1.id);//0
		System.out.println(i1.name);//null
		

	}

}

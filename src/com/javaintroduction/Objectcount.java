package com.javaintroduction;

public class Objectcount {
	static int count=0;
	{
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		Objectcount obj=new Objectcount();
		Objectcount obj1=new Objectcount();
		

	}

}

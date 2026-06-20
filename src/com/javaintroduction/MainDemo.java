package com.javaintroduction;

public class MainDemo {
	int x=10;
	static {
		MainDemo m1=new MainDemo();
		m1.x=m1.x+10;
		System.out.println(m1.x);
	}

	{
		x=x+2;
	}
	public static void main(String[] args) {
		MainDemo m1=new MainDemo();
		System.out.println(m1.x);

	}

}




package com.javaintroduction;

public class MainDemo3 {
	static int x;
	static {
		x=10;
	}
	{ 
		int x=0;
		x=x+2;
	}

	public static void main(String[] args) {
		MainDemo3 m3=new MainDemo3();
		System.out.println(MainDemo3.x);
		System.out.println(m3.x);
	}

}

package com.javaintroduction;

public class MainDemo2 {
	int x; 
	{
		x=x+10;
	}

	public static void main(String[] args) {
		//System.out.println(x);
		MainDemo2 m2=new MainDemo2();
		MainDemo2 m3=new MainDemo2();
		m2.x=200;
		System.out.println(m2.x);
		System.out.println(m3.x);
	}

}

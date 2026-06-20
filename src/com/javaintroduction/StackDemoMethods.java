package com.javaintroduction;

public class StackDemoMethods {
	static StackDemoMethods s1 = new StackDemoMethods();

	public static void main(String[] args) {
		StackDemoMethods s = new StackDemoMethods();
		s.m1();
	}

	public void m1() {
		System.out.println("method1");
		m2();
	}

	public static void m2() {
		System.out.println(" static method1");
		s1.m3();

	}

	public void m3() {
		System.out.println("method2");
		m4();
	}

	public static void m4() {
		System.out.println(" static method 2");
	}
}

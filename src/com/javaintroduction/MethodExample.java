package com.javaintroduction;

public class MethodExample {
	public void method1() {
		System.out.println("method1");
		// MethodExample m2=new MethodExample();
		// m2.method2();
		method2();
	}

	public static void main(String[] args) {
		MethodExample m1 = new MethodExample();
		m1.method1();
	}

	public void method2() {
		System.out.println("Method 2");
		// MethodExample m3=new MethodExample();
		// m3.method3();
		method3();
	}

	public void method3() {
		System.out.println("Method 3");
		sMethod4();
	}

	public static void sMethod4() {
		System.out.println("static Method 4 ");
		sMethod5();

	}

	public static void sMethod5() {
		System.out.println("static method 5 ");
		sMethod6();
	}

	public static void sMethod6() {
		System.out.println("static method 6 ");
	}
}

package com.javaintroduction;

public class MethodExamples2 {
	public void method1() {
		System.out.println("method1 first");
		// MethodExample m2=new MethodExample();
		// m2.method2();
		method2();
		System.out.println("method1 last");
		
	}

	public static void main(String[] args) {
		MethodExamples2 m1 = new MethodExamples2();
		m1.method1();
	}

	public void method2() {
		System.out.println("Method 2 first ");
		// MethodExample m3=new MethodExample();
		// m3.method3();
		method3();
		System.out.println("Method 2 last ");
	}

	public void method3() {
		System.out.println("Method 3 first");
		sMethod4();
		System.out.println("Method 3 last ");
	}

	public static void sMethod4() {
		System.out.println("static Method 4 first");
		sMethod5();
		System.out.println("static Method 4 last ");

	}

	public static void sMethod5() {
		System.out.println("static method 5 first ");
		sMethod6();
		System.out.println("static Method 5 last ");

	}

	public static void sMethod6() {
		System.out.println("static method 6 first");
		System.out.println("static Method 6 last ");

	}
}

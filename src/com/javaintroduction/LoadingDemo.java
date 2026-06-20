package com.javaintroduction;

public class LoadingDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("hi");
	    Class.forName("java.lang.System");
	    Class.forName("java.lang.String");
	    Class.forName("com.javaintroduction.HelloWorld");
	    Class.forName("com.mysql.cj.jdbc.Driver");
	}

}

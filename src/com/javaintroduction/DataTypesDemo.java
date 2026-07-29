package com.javaintroduction;

public class DataTypesDemo {
	 int a,b;
	float c,d;
	double e,f;
	{
	 a = 2;b = 4;
	 c = 2; d = 4;
	 e = 2; f = 4;
	}
	void addInt() {
		int z = a + b;
		System.out.println("int addition " + z);
	}

	void addFloat() {
		float y = c + d;
		System.out.println("float addition " + y);
	}

	void addDouble() {
		double x = e + f;
		System.out.println("double addition " + x);
	}

	public static void main(String[] args) {
		DataTypesDemo d1 = new DataTypesDemo();
		d1.addInt();
		d1.addFloat();
		d1.addDouble();

	}

}

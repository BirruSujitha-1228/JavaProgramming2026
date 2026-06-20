package com.javaintroduction;


class A{
	B b;
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method from A");
	}	
	
}

class B{
	A a;
	protected void finalize() throws Throwable {
		System.out.println("finalize method from B");
	}
}
public class IslandOfIsolationDemo1 {
	

	public static void main(String[] args) {
		
		A obj1=new A();
		
		B obj2=new B();
		
		obj1.b=obj2;
		obj2.a=obj1;
		
		obj1=null;
		obj2=null;
		System.gc();
		
		
		

	}

}

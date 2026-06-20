package com.javaintroduction;

public class GarbageDemo {
	@Override
	protected void finalize() throws Throwable {
	System.out.println("finalize method");
	}
	public void hello(){
		GarbageDemo g=new GarbageDemo();

	}

	public static void main(String[] args) {
		GarbageDemo g1=new GarbageDemo();
		GarbageDemo g2=new GarbageDemo();
		GarbageDemo g3=new GarbageDemo();
		System.out.println(g1);//1dbd16a6
		System.out.println(g2);//7ad041f3

		g1=null;//object eligible for gc
		System.out.println(g1);//null
		System.out.println(g2);//7ad041f3
		
		g2=g3;
		System.out.println(g2);
		
		g2.hello();
		new GarbageDemo();
		System.gc();
		
		
	      
	}

}

package com.javaintroduction;

public class GarbageDemo1 {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called ");
	}
	void hello() {// 3)out of scope
		GarbageDemo1 g3=new GarbageDemo1();
		System.out.println("scope g3"+g3);
	}
	void welcome() {
		System.out.println("hi welcome to gc");
	}

	public static void main(String[] args) {
		GarbageDemo1 g1=new GarbageDemo1();
		GarbageDemo1 g2=new GarbageDemo1();
		GarbageDemo1 g3=new GarbageDemo1();
		/*
		 * System.out.println(g1);
		 *  System.out.println(g2); 
		 *  System.out.println(g3);
		 */
		g1=null;//1)nullifying the object
		System.out.println( "After nullifying the g1 values"+g1);//null
		System.out.println( "After nullifying the g1 values g2="+g2);//1@7ad041f3
		System.out.println( "After nullifying the g1 values g3= "+g3);//1@251a69d7
		
		
		//g3=g2;//2)reassigning the reference
		//System.out.println("After assigning g3 = g2  "+g3);//1@7ad041f3 
		
		g2=g3;//2)reassigning the reference
		System.out.println("After assigning g2 = g3  "+g2);//1@251a69d7
		

		g3.hello();//1@7344699f-----3)out of scope 
		
		new GarbageDemo1().welcome();// 4) Anonymous object 
		//------or------//
		new GarbageDemo1();
		
		System.gc();
		
		
		

	}

}

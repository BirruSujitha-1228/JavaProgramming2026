package com.arrays;

public class ArrayExam1 {

	public static void main(String[] args) {
		int[] a={1,2,3};
		int[] b=a;
		b[1]=100;
		System.out.println(a[1]);
		Integer i1=130;
		Integer i2=130;
		System.out.println(i1.equals(i2));
		Integer[] I1= {130};
		Integer[] I2= {130};
		System.out.println(I1.equals(I2));
	}
//	@Override
//	 boolean equals(){
//		
//	}

}

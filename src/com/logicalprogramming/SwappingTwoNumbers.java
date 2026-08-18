package com.logicalprogramming;

import java.util.Scanner;

public class SwappingTwoNumbers {
	static void swapNum(int a, int b) {
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping ");
		System.out.println("a is "+a+"\n"+ "b is "+b);

	}

	public static void main(String[] args) {
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter two values for a and b");
        int a=sin.nextInt();
        int b=sin.nextInt();
        swapNum(a,b);
        sin.close();
	}

}

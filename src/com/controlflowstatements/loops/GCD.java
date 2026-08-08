package com.controlflowstatements.loops;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter a value");
		int a=sin.nextInt();
		System.out.println("Enter b value");
		int b=sin.nextInt();
		while(b!=0) {
			int temp=b;
			b=a%b;
			a=temp;
		}
		System.out.println(a);
	}
}

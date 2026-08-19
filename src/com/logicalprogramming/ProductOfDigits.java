package com.logicalprogramming;

import java.util.Scanner;

public class ProductOfDigits {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sin.nextInt();
		productDigit(n);
		sin.close();

	}

	private static void productDigit(int n) {
		int product=1;
		if(n==0) {
			product=0;
		}
		while(n>0) {//123->12->1->0 fails
			int r=n%10;//3->2->1
			product=product*r;//1*3=3*2*1
			n=n/10;//12->1->0
		}
		System.out.println(product);
		
	}

}

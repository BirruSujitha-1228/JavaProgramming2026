package com.logicalprogramming;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sin.nextInt();
		boolean b=isSpyNum(n);
		System.out.println(b);
        sin.close();


	}

	private static boolean isSpyNum(int n) {
		int sum=0;
		int product=1;
		while(n>0) {
			int digit=n%10;
			sum=sum+digit;
			product=product*digit;
			n=n/10;
		}
		return sum==product;
	}

}

package com.logicalprogramming;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sin.nextInt();
		harshadNum(n);
		sin.close();

	}

	private static void harshadNum(int n) {
		int sum=0;
		int temp=n;
		while(n>0) {
			int digit=n%10;
			sum=sum+digit;
			n=n/10;
		}
		if(temp%sum==0) {
			System.out.println("Harshad number");
		}
		else {
			System.out.println("Not Harshad Number");
		}
		
	}

}

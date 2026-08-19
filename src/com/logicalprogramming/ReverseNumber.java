package com.logicalprogramming;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sin.nextInt();//475---->574
		revNum(n);
		sin.close();

	}

	private static void revNum(int n) {
		int rev=0;
		
		while(n>0) {//475->47->4->0 false
			int r =n%10;//5->7->4
			rev=rev*10+r;//0+5=5,5*10+7=57->57*10+4=570+4=574
			n=n/10;	//47->4->0
		}
		System.out.println(rev);
		
	}

}

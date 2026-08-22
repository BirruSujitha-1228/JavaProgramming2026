package com.logicalprogramming;

import java.util.Scanner;

public class IsDuckNumber {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sin.nextInt();
		boolean b=isDuckNum(n);
		System.out.println(b);
        sin.close();

	}

	private static boolean isDuckNum(int n) {
		while(n>0) {
			int digit=n%10;
			if(digit==0) {
				return true;
			}
			n=n/10;
		}
		return false;
	}

}

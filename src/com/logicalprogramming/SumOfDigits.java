package com.logicalprogramming;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sin.nextInt();
		sumDigit(n);
		sin.close();

	}

	private static void sumDigit(int n) {
		int sum = 0;
		n = Math.abs(n);
		while (n > 0) {// 123-->12->1
			int r = n % 10;// 3-->2->1
			sum = sum + r;// 0+3->3,3+2+1=6
			n = n / 10;// 12->1->0
		}
		System.out.println(sum);

	}

}

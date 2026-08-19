package com.logicalprogramming;

import java.util.Scanner;

public class CountDigitNumber {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sin.nextInt();
		countDigit(n);
		sin.close();

	}

	private static void countDigit(int n) {
		int count = 0;
		if (n == 0) {
			count = 1;
		}
		else {
			n = Math.abs(n);//to convert -ve to +ve 
			while (n > 0) {
				n = n / 10;
				count++;
			}
		}

		System.out.println(count);

	}

}

package com.controlflowstatements.loops;

import java.util.Scanner;

public class Factorial {
	static Scanner sin = new Scanner(System.in);

	public static void factorial(int n) {
		String choice;
		// int n=0;
		do {
			int fact = 1;
			for (int i = 1; i <= n; i++) {
				fact = fact * i;
			}
			System.out.println("Factorial of a number " + fact);
			System.out.println("want to continue another  n value y/n");
			choice=sin.next();
		} while (choice.equalsIgnoreCase("y"));
		System.out.println("enter n ");
		n = sin.nextInt();
	}

	public static void main(String[] args) {

		System.out.println("enter a number");
		int n = sin.nextInt();
		factorial(n);

	}

}

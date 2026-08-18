package com.logicalprogramming;

import java.util.Scanner;

public class SimpleCalculatorUsingSwitch {
	static void calculator(int n, int a, int b) {
		switch (n) {
		case 1:
			System.out.println("addition " + (a + b));
			break;
		case 2:
			System.out.println("Subtraction " + (a - b));
			break;
		case 3:
			System.out.println("Multiplication " + (a * b));
			break;
		case 4:
			if(b==0) {
				System.out.println("when denominator is 0 it leads to arithemetic exception ");
				return ;
			}
			System.out.println("division " + (a / b));
			break;
		case 5:
			 if(b == 0) {
			     System.out.println("Cannot perform modulus with zero");
			     return;
			 }
			System.out.println("modulous " + (a % b));
			break;
		default:
			System.out.println("Invalid choice");

		}

	}

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("1.addition 2.subtraction 3.multiplication 4.division 5.modulous");
		System.out.println("Enter any number case you want from above ");
		int n = sin.nextInt();
		System.out.println("enter values for a and b ");
		int a = sin.nextInt();
		int b = sin.nextInt();
		calculator(n, a, b);
		sin.close();

	}

}

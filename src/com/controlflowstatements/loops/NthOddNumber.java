package com.controlflowstatements.loops;

import java.util.Scanner;

public class NthOddNumber {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		int count = 0;
		System.out.println("enter a number");
		int n = sin.nextInt();
		/*better this one 
		for (int i = 1; count < n; i++) {
			if (i % 2 == 1) {
				count++;
				if (count == n) {
					System.out.println("Count of a nth number is a : " + i);
				}
			}
		}*/

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				count++;
				if (count == n) {
				    System.out.println("-----nth number---- " +i );
				   break;
				}
				
			}
		}

	}

}

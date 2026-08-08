package com.controlflowstatements;

import java.util.Scanner;

public class IfATMWithdrawal {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		
		System.out.println("enter balance");
		double balance = sin.nextDouble();
		
		if (balance >= 5000) {
			System.out.println("Withdrawal Allowed");

		}

	}

}

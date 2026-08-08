package com.controlflowstatements;

import java.util.Scanner;

public class AtmCashWithDrawalWithMethods {
	int pin;
	double balance;
	double withdrawalLimit;
	double withDrawAmount;
	int enteredPin;
	Scanner sin = new Scanner(System.in);

	AtmCashWithDrawalWithMethods(int pin, double balance, double withdrawalLimit) {
		this.pin = pin;
		this.balance = balance;
		this.withdrawalLimit = withdrawalLimit;
	}

	void verifyPin() {
		if (pin == enteredPin) {
			System.out.println("pin matches continue ");
			withdraw();
			withdraw();
		} else {
			System.out.println("pin not matched");
		}
	}

	void withdraw() {
		System.out.println("enter with draw amount");
		withDrawAmount = sin.nextDouble();
		if (withDrawAmount <= balance) {
			if (withDrawAmount <= withdrawalLimit) {
				withdrawalLimit=withdrawalLimit-withDrawAmount;
				System.out.println("now you have limit balance "+withdrawalLimit);
				balance = balance - withDrawAmount;
				System.out.println("WithdrawAmount " + withDrawAmount);
				System.out.println("balance : " + balance);
			} else {
				System.out.println("Limit reached");
			}

		} else {
			System.out.println("balance is not sufficient !");
		}

	}
	void checkBalance() {
		System.out.println("Available balance:"+balance);
	}

	public static void main(String[] args) {
		//Scanner sin = new Scanner(System.in);
		AtmCashWithDrawalWithMethods a = new AtmCashWithDrawalWithMethods(1228, 50000, 10000);
		System.out.println("enter your pin for confirmation");
		a.enteredPin = a.sin.nextInt();
		a.verifyPin();
		a.checkBalance();

	}

}

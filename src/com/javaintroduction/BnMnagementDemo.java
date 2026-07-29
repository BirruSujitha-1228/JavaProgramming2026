package com.javaintroduction;

public class BnMnagementDemo {

	static int accountNumber = 1000;

	void accountNumber() {
		accountNumber++;
	}

	String customerName;
	double accountBalance;

	public void display() {
		System.out.println(accountNumber + " " + customerName + " " + accountBalance);
	}

	public static void main(String[] args) {
		BnMnagementDemo suji = new BnMnagementDemo();
		suji.customerName = "suji";
		suji.accountBalance = 5000.00;
		suji.accountNumber();
		suji.display();

		BnMnagementDemo abhi = new BnMnagementDemo();
		abhi.customerName = "abhi";
		abhi.accountBalance = 5000.00;
		abhi.accountNumber();
		abhi.display();

		BnMnagementDemo hithu = new BnMnagementDemo();
		abhi.customerName = "hithu";
		hithu.accountNumber();
		hithu.display();

		// abhi.display();
	}

}

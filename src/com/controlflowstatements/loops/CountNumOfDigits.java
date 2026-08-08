package com.controlflowstatements.loops;

public class CountNumOfDigits {
	void countNum(int n) {
		//int num = 0;
		int count = 0;
		while (n > 0) {
			
			//num = n % 10;//take digit
			n = n / 10;//remove digit
			count++;
		}
		System.out.println("Count of a given digit: " + count);

	}

	public static void main(String[] args) {
		CountNumOfDigits c = new CountNumOfDigits();
		c.countNum(12345);

	}

}

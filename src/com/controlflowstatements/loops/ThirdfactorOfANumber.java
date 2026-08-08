package com.controlflowstatements.loops;

public class ThirdfactorOfANumber {
	void thirdFactor(int n) {
		int count = 0;
		if(n<=0) {
			System.out.println("invalid input");
		}
		else {
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;

				if (count == 3) {
					System.out.println("3rd factor Of a given Number " + n + " is " + i);
					break;
				}
			}
			
		}
		if (count < 3) {
			System.out.println("3rd factor doesnot exist for this number "+n);
		}
		}
	}

	public static void main(String[] args) {
		ThirdfactorOfANumber factor = new ThirdfactorOfANumber();
		factor.thirdFactor(36);
		factor.thirdFactor(28);
		factor.thirdFactor(7);
		factor.thirdFactor(0);
	}

}

package com.controlflowstatements.loops;

public class EvenNumbersWithoutForLoop {
	static void evenWithoutForloop() {
		int i = 2;
		while (i <= 100) {
			System.out.print(i + " ");
			i = i + 2;

		}
	}

	public static void main(String[] args) {
		evenWithoutForloop();

	}

}

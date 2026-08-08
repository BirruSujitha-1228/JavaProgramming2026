package com.controlflowstatements.loops;

import java.util.Arrays;
import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter prices");
		int n = sc.nextInt();
		int[] price = new int[n];
		for (int i = 0; i < n; i++) {
			price[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if (price[j] <= price[i]) {
					price[i] = price[i] - price[j];
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(price));
		/*System.out.println("[");
		for (int i = 0; i < n; i++) {
			System.out.println(price[i]);
			if (i < n - 1) {
				System.out.println(",");
			}

		}
		System.out.println("]");*/
	}

}

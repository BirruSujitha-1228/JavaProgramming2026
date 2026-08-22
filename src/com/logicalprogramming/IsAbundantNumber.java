package com.logicalprogramming;

import java.util.Scanner;

public class IsAbundantNumber {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sin.nextInt();
		boolean b=isAbundantNum(n);
		System.out.println(b);
        sin.close();

	}

	private static boolean isAbundantNum(int n) {

		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
			
		}
		
		return sum>n;
	}

}

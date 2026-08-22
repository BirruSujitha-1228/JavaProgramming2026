package com.logicalprogramming;

import java.util.Scanner;

public class IsStrongNumber {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sin.nextInt();
		boolean b =isStrongNum(n);
        System.out.println(b);
		sin.close();

	}

	private static boolean isStrongNum(int n) {
		int temp=n;
		
		int fact=1;
		int sum=0;
		while(n>0) {
			int r=n%10;
			for(int i=1;i<=r;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			fact=1;
			n=n/10;	
		}
		return sum==temp;
		
		
	}

}

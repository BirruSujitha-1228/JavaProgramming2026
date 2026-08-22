package com.logicalprogramming;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sin.nextInt();
		isStrong(n);

		sin.close();

	}

	private static void isStrong(int n) {
		
		int temp=n;
		int sum=0;
		int fact=1;
		while(n>0) {
		int r=n%10;
		for(int i=1;i<=r;i++) {
			fact=fact*i;
		}
		sum=sum+fact;
		fact=1;
		n=n/10;
		}
 
		if(sum==temp) {
       	 System.out.println("it is Strong");
        }
        else {
       	 System.out.println("not strong");
        }
	
	}

}

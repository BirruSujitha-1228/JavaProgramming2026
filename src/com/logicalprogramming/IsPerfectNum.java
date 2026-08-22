package com.logicalprogramming;

import java.util.Scanner;

public class IsPerfectNum {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sin.nextInt();
		isPerfect(n);
		boolean b=isPerfectNum(n);
		System.out.println(b);
		sin.close();
	}
	static void isPerfect(int n) {
	
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum==n) {
			System.out.println("it is perfect");
		}
				
		else {
			System.out.println("not perfect");
		}
	}
	static boolean isPerfectNum(int n) {
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		return sum==n;
			
		}
	}
			



package com.logicalprogramming;

import java.util.Scanner;

public class BooleanProblemPractice {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
//		System.out.println("Enter any number to check even num or not");
//		int n = sin.nextInt();
//		boolean b = isEvenNum(n);
//		System.out.println(b);
//		System.out.println("enter any number to check postive or negative num");
//		int n2 = sin.nextInt();
//		boolean b1 = isPositive(n2);
//		System.out.println(b1);
//		System.out.println("enter any number to check divsible by 5 or not");
//		int n3 = sin.nextInt();
//		boolean b2 = isDivisibleByFive(n3);
//		System.out.println(b2);
//		System.out.println("enter any number to check prime or not");
//		int n4 = sin.nextInt();
//		boolean b3 = isPrime(n4);
//		System.out.println(b3);
		System.out.println("Enter any number to check it is palindrome or not");
		int n5=sin.nextInt();
		boolean b4=isPalindrome(n5);
		System.out.println(b4);
		sin.close();
		

	}
	static boolean isPalindrome(int n5) {
		int rev=0;
		int temp=n5;
		while(n5>0) {
			int r=n5%10;
			rev=rev*10+r;
			n5/=10;
		}
		if(rev==temp) {
			return true;
		}
		return false;
		
	}
	private static boolean isPrime(int n4) {
		for(int i=2;i<n4;i++) {
		if(n4%i==0) {
			return false;
		}
		}
		return true;
	}
	private static boolean isDivisibleByFive(int n) {
		return n%5==0;
	}

	private static boolean isPositive(int n) {
		return n > 0;
	}

	private static boolean isEvenNum(int n) {
		return n % 2 == 0;

//     (  or  )

//		if(n%2==0) {
//			return true;
//		}
//		return false;
//	}

	}

}

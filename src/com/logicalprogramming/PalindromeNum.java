package com.logicalprogramming;

import java.util.Scanner;

public class PalindromeNum {//reverse number equal to given number

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sin.nextInt();
		//ispalindrome(n);
		if(ispalindrome(n)){
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a plaindrome");
		}
		sin.close();

	}

	private static boolean ispalindrome(int n) {
		int rev=0;
		int temp=n;//121
		while(n>0) {
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		//System.out.println(rev);
		return temp==rev;//121==121  
		
	}
	

}

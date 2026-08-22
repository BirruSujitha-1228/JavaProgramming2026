package com.logicalprogramming;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sin.nextInt();
		boolean b=automorphicNum(n);
		System.out.println(b);
        sin.close();

	}

	private static boolean automorphicNum(int n) {
		int original=n;
		int sqr=n*n;
		//int temp=sqr;
		int count=0;
		int digit=0;
//           hardcode values 		
//			int d1=sqr%10 ;
//			int d2=n%100;
//			int d3=n%1000;
//			
//			
//		if(d1==temp || d2==temp || d3==temp) {
//			return true;
//		}
//		return false;
		
		
		while(n>0) {
			digit=n%10;//no need
			count=count+1;
			n=n/10;
		}
		digit=0;
		digit=(int) (sqr%Math.pow(10,count));
			
		if(digit==original) {
			return true;
		}
		return false;
		}
	
	}


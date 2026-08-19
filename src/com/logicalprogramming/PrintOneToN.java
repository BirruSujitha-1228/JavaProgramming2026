package com.logicalprogramming;

import java.util.Scanner;

public class PrintOneToN {
	static void printOneToN(int n) {
		int i=1;
		
		while(i<=n) {
			System.out.println(i);//5
			i=i+1;//6
		}
		System.out.println("Forloop ");
		for( i=1;i<=n;i++) {
			System.out.println(i);
		}
		
		
	}

	public static void main(String[] args) {
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter how many numbers you want ");
		int n=sin.nextInt();
		printOneToN(n);
		sin.close();
		

	}

}

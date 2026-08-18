package com.logicalprogramming;

import java.util.Scanner;

public class EvenOrOdd {
	static void evenOdd(int n) {
		if(n%2==0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
	}

	public static void main(String[] args){
       Scanner sin=new Scanner(System.in);
       System.out.println("Enter a Number ");
       int n=sin.nextInt();
       evenOdd(n);
       sin.close();
	}
}

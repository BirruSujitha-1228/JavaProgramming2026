package com.logicalprogramming;

import java.util.Scanner;

public class FactorialNumberDem {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sin.nextInt();
		fact(n);
		sin.close();

	}

	private static void fact(int n) {
		int fact=1;
		int sum=0;
		int count=0;
		int i=1;
		while(i<=n) {
			fact=fact*i;
			if(fact%2==0) {
			count++;
			}
			i++;
			sum=sum+fact;
			
			
		}
		System.out.println(fact);
		//challenge 2
		System.out.println("Sum of factorial :"+sum);
		//challenge 3
		System.out.println("count of each number "+count);
		
	}

}

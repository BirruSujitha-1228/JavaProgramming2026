package com.logicalprogramming;

import java.util.Scanner;

public class SumOfEven1ToN {

	public static void main(String[] args) {
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter n value");
        int n=sin.nextInt();
        sumOfEvenNum(n);
        sin.close();

	}

	private static void sumOfEvenNum(int n) {
		int i=1;
		int sum=0;
		while(i<=n) {
			if(i%2==0) {
				sum=sum+i;
				System.out.println("even numbers "+i);
				
			}
		i++;
		}
		
		System.out.println("even sum "+sum);
		System.out.println("---------for loop-----------");
		sum=0;
		for(i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println("Even num "+i);
				sum=sum+i;
			}
		}
		System.out.println("even sum"+sum);
		
		
	}

}

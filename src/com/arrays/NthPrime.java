package com.arrays;

import java.util.Scanner;

public class NthPrime {
	static boolean isPrime(int a) {
		boolean status=true;
		if(a==0||a==1) {
			status=false;
		}
		for(int i=2;i<=a/2;i++) {
			if(a%i==0) {
				status=false;
			}
		}
		return status;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n value:");
		int n= sc.nextInt();
		int i=0;
		int count=0;
		while(count<n) {
			if(isPrime(i)) {
				count++;
			}
			if(count!=n) {
				i++;
			}
		}
		System.out.println("nth prime is : "+i);
		sc.close();
	}

}

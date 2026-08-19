package com.logicalprogramming;

import java.util.Scanner;

public class SumOfNat {

	public static void main(String[] args) {
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter n value");
        int n=sin.nextInt();
        sumOfNum(n);
        sin.close();

	}

	private static void sumOfNum(int n) {
		int sum=0;
		int i=1;
		while(i<=n) {
			sum=sum+i;
			i++;
		}
		System.out.println(sum);
	    System.out.println("-------for loop--------");
	    sum=0;
	    for(i=1;i<=n;i++) {
	    	sum=sum+i;
	
	    }
    	System.out.println(sum);
	}

}

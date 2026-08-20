package com.logicalprogramming;

import java.util.Scanner;

public class NthFibonacci {

	public static void main(String[] args) {
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter any number");
        int n=sin.nextInt();
        int result=0;
        result=Nthfibonacci(n);
        System.out.println("nth "+result);
        int res=countEvenFibonacci(n);
        System.out.println("even count "+res);
        sin.close();
	}

	private static int Nthfibonacci(int n) {
		int n1=0;
		int n2=1;
		int n3=0;
		int i=1;
		while(i<n) {
			//System.out.print(n1+" ");
			n3=n1+n2;
			n1=n2;
			n2=n3;
			i++;
		}
		return n1;	
		
	}
	public static int countEvenFibonacci(int n) {
		int n1=0;
		int n2=1;
		int n3=0;
		int i=1;
		int count=0;
		while(i<=n) {
			//System.out.print(n1+" ");
			n3=n1+n2;
			if(n1%2==0) {
				//System.out.println(count);
				count++;
			}
			n1=n2;
			n2=n3;
			i++;
		}
		return count;
	}

}

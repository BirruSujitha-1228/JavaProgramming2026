package com.logicalprogramming;

import java.util.Scanner;        //n1 n2
                              //n1 n2 n3  
public class FibonacciSeries {//0  1  1  2 3 5 8 13

	public static void main(String[] args) {
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter any number");
        int n=sin.nextInt();
        fibonacci(n);
        sin.close();
	}

	private static void fibonacci(int n) {
		int n1=0;
		int n2=1;
		int n3=0;
		int i=1;
		while(i<=n) {
			System.out.print(n1+" ");
			n3=n1+n2;
			n1=n2;
			n2=n3;
			i++;
		}
		
	}

}

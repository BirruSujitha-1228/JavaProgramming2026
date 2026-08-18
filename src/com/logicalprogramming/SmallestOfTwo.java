package com.logicalprogramming;

import java.util.Scanner;

public class SmallestOfTwo {
	static void findSmallest(int n1,int n2) {
		if(n1<n2) {
			System.out.println(n1+" is Smallest");
		}
		else if(n2<n1) {
			System.out.println(n2+" is Smallest");
		}
		else {
			System.out.println("Both are Equal");
		}
		
	}

	public static void main(String[] args) {
		Scanner sin=new Scanner(System.in);
		System.out.println("enter two numbers ");
		int n1=sin.nextInt();
		int n2=sin.nextInt();
		findSmallest(n1,n2);
        sin.close();
	}

}

package com.logicalprogramming;

import java.util.Scanner;

public class LargestOfTwo {
	static void findLargest(int n1,int n2) {
		if(n1>n2) {
			System.out.println(n1+" is a Large Number");
		}
		else if(n2>n1) {
			System.out.println(n2+" is a Large Number");
		}
		else {
			System.out.println("Both are equal");
		}
	}

	public static void main(String[] args) {
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter First number");
		int n1=sin.nextInt();
		System.out.println("Enter Second Number");
        int n2=sin.nextInt();
        findLargest(n1,n2);
	}

}

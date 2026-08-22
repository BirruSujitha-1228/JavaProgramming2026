package com.logicalprogramming;

import java.util.Scanner;

public class NthEvenNum {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sin.nextInt();
		int ntheven=2*n;
		System.out.println(ntheven);
        sin.close();
	}

}

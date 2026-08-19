package com.logicalprogramming;

import java.util.Scanner;

public class MultiplcationTable {

	public static void main(String[] args) {
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter n value");
        int n=sin.nextInt();
        table(n);
        sin.close();

	}

	private static void table(int n) {
		int i=1;
		while(i<=10) {
			System.out.println(n+" * "+i+" = "+n*i);
			i++;
		}
		
	}

}

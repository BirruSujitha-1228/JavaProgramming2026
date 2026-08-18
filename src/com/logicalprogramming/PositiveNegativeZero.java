package com.logicalprogramming;

import java.util.Scanner;

public class PositiveNegativeZero {
	static void isNumType(int n){
		if(n>0) {
			System.out.println("It is a Positive Integer");
			}
			else if(n<0) {
			System.out.println("It is a Negative Integer");
			}
			else {
			System.out.println("It is a Zero");
			}
	}
	public static void main(String[] args) {
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sin.nextInt();
		isNumType(n);
        sin.close();
	}

}

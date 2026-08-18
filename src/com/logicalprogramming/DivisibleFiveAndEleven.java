package com.logicalprogramming;

import java.util.Scanner;

public class DivisibleFiveAndEleven {
	static void isDivisibleBy11And5(int num) {
		if(num%5==0 &&  num%11==0) {
			System.out.println("yes Divisible By 5 and 11 ");
		}
		else{
			System.out.println("not Divisible By 5 and 11 ");
		}
	}
	public static void main(String[] args) {
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter a Number");
        int num=sin.nextInt();
        isDivisibleBy11And5(num);
	}

}

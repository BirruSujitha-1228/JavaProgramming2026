package com.logicalprogramming;

import java.util.Scanner;

public class LeapYear {
	static void leapYear(int year) {
		if((year%4==0 && year%100 !=0 )||(year %400==0) ) {
			System.out.println("Leap Year");
		}
		else{
			System.out.println("Not a Leap Year");
		}
	}

	public static void main(String[] args) {
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter an year");
		int year=sin.nextInt();
		leapYear(year);
		sin.close();

	}

}

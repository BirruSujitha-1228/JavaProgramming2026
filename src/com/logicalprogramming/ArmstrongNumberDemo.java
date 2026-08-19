package com.logicalprogramming;

import java.util.Scanner;

public class ArmstrongNumberDemo {// given number = checked number

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sin.nextInt();// 153->1^3+2^3+3^3=1+125+27=153

		//isarmNum(n);
		if(isarmNum(n)) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("not armstrong");
		}
		sin.close();

	}

	private static boolean isarmNum(int n) {
		int r = 0;
		int temp=n;
		int num=n;
		int count = 0;
		while (n > 0) {
			r = n % 10;
			n=n/10;
			count++;
		}
		System.out.println("count is "+count);
		r = 0;
		double digit= 0;
		while (num > 0) {//153-->15->1
			r = num % 10;//3-->5->1
			digit = digit+Math.pow(r,count);//0+27=27-->27+125=152->152+1=153
			num=num/10;//15->1
		}
		return digit==temp;

	}

}

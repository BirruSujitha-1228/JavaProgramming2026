package com.controlflowstatements.loops;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sin=new Scanner(System.in);
		System.out.println("enter a number ");
		int n=sin.nextInt();
		int sum=0;
		int sqr=n*n;
		while(sqr>0){//8>0 true
			sum=sum+(sqr%10);//0+81-->0+1=1,,,,8%10-->1+8=9
			sqr=sqr/10;// 81/10----->8,,,,,0	
		}
		if(n==sum) {
			System.out.println("neon");
		}
		else {
			System.out.println("not neon");
		}
	}

}

package com.controlflowstatements.loops;

import java.util.Scanner;

public class SwapNum {

	public static void main(String[] args) {
		Scanner sin=new Scanner(System.in);
		System.out.println("enter number");
		int n=sin.nextInt();
		int temp=n;
		int count=0;
		while(temp>0) {
			count++;
			temp/=10;//12345-----> 123,12,1,0
		}
		int p=(int)Math.pow(10, count-1);
		int first =n/10;

	}

}

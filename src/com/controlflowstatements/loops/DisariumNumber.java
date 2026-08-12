package com.controlflowstatements.loops;

import java.util.Scanner;

public class DisariumNumber {
	
//135----> 1^1 + 3^2 + 5^3 = 1 + 9 + 125 = 135
	public static void main(String[] args) {
		
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n=sin.nextInt();
		int original=n;
		int count=0;
		int sum=0;
		int temp=n;
		while(temp>0) {//135>0-->13>0-->1>0--> 0>0 
			count++;//1-->2-->3
			temp=temp/10; // 135/10-->13-->1-->0
		}
		temp=n;//135
		while(temp>0) {//13>0-->1>0
			int digit =temp%10;//135%10=5--->3--->1
			sum=sum+(int)Math.pow(digit,count);//5,3--->3,2-->1,1
			count--;//2-->1->0
			temp=temp/10;//13-->1-->0
			
		}
		if(sum==original) {
			System.out.println(original+" DisariumNumber");
		}
		else {
			System.out.println(original+" Not DisariumNumber");
		}
		sin.close();
		
		
		

	}

}

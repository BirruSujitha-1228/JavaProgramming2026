package com.arrays;

import java.util.Scanner;

public class NormalLogicForMaxAndMIn {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("Enter a b c values");
		int a=sin.nextInt();//89
		int b=sin.nextInt();//67
		int c=sin.nextInt();//100
		int min=a;
		int max=a;
		if(b>max) {
			max=b;
			//System.out.println(" b is max"+b);
		}
		if(c>max) {//100>67
			max=c;
			
		}
		if(b<min) {
			min=b;
		}
		
		if(c<min) {
			min=c;
		}
		System.out.println("Min "+min);
	    System.out.println("Max "+max);
		}
       
	}


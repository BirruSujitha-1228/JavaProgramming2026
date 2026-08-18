package com.arrays;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		Scanner sin=new Scanner(System.in);
		int count=1;
		int randomNumber=(int) (Math.random() *10);
		//System.out.println(randomNumber);
		System.out.println("enter a  number");
		int n=sin.nextInt();
		while(true) {
			
			count=count+1;
			if(count>3 && n!=randomNumber) {
	        	System.out.println("Better luck next time");
	        	System.out.println("randomNumber is "+randomNumber);
	        	break;
	        }
	        if(n==randomNumber) {
	        	System.out.println("You won");
	        	break;
	        }
	        	else {
	        		if(n>randomNumber) {
	        			System.out.println("Number is too high");
	        		}
	        		else {
	        			System.out.println("Number is too low");
	        		}
	        		System.out.println("try again ..Enter another number");
	        		n=sin.nextInt();
	        }
	       // System.out.println(count);
	        
	        
		}

	}

	}

package com.logicalprogramming;

import java.util.Scanner;

public class VotingEligibility {
	static void isEligible(int age) {
		if(age<=0) {
			System.out.println("Invalid age");
		}
		else if(age<18) {
			System.out.println("You are not Eligible to vote");
		}
		else if(age>=18){
			System.out.println("Eligible for vote");	
		}
	}
	public static void main(String[] args) {
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter your age");
        int age=sin.nextInt();
        isEligible(age);
        sin.close();
	}

}

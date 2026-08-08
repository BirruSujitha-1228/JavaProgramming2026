package com.controlflowstatements.loops;

//import java.util.Scanner;

public class EvenNumbersNRange {
	//Scanner sin=new Scanner(System.in);
	void evenNumberWithForLoop(int n){
		//System.out.println("enter n value");
			//int n=sin.nextInt();
		System.out.println("Even Numbers with for loop");
			for(int i=2;i<=n;i=i+2) {
					System.out.println("Even Number : "+i);

			}
	}
	void evenNumberWithOutForLoop(int n) {
		System.out.println("Even Numbers without for loop");
		//for testing 
		int i=12;
		while(i<=n) {
			System.out.println(i);
			i=i+2;
		}
	}

	public static void main(String[] args) {
		EvenNumbersNRange even=new EvenNumbersNRange();
		even.evenNumberWithForLoop(10);
		even.evenNumberWithOutForLoop(30);

	}

}

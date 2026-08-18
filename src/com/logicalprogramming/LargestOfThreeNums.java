package com.logicalprogramming;

import java.util.Scanner;

public class LargestOfThreeNums {
	static void findLargest(int n1,int n2,int n3) {
		if(n1==n2 && n1==n3  && n2==n3) {
			System.out.println("All are Equal");
		}
		else if(n2>=n1 && n2>=n3 ) {
			System.out.println(n2 +" is Larger");
		}
		else if(n3>=n1 && n3>=n2) {
			System.out.println(n3 + " is Larger");
		}
		else if(n1>=n2 && n1>=n3 ) {
			System.out.println(n1+" is Larger");	
		}
	    
	}

	public static void main(String[] args) {
		Scanner sin=new Scanner(System.in);
		int n1,n2,n3;
		System.out.println("Enter 3 Numbers");
		n1=sin.nextInt();
		n2=sin.nextInt();
		n3=sin.nextInt();
		findLargest(n1,n2,n3);
		sin.close();

	}

}

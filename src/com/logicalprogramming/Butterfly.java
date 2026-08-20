package com.logicalprogramming;

public class Butterfly {

	public static void main(String[] args) {
		int spaces=11;
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=12;j++) {
				if(j<=i || j>=spaces+i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
			     }
				
			}
			spaces=spaces-2;
			System.out.println();
			
		}

	}

}

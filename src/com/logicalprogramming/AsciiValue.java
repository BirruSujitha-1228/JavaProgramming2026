package com.logicalprogramming;

import java.util.Scanner;

public class AsciiValue {
	static void findAscii(int ch) {
		
			int ascii=ch;
			System.out.println(ascii);
		
		
	}

	public static void main(String[] args) {
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter a character");
		char ch=sin.next().charAt(0);
	    findAscii(ch);
	    sin.close();
		

	}

}

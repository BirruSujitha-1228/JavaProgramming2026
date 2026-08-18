package com.logicalprogramming;

import java.util.Scanner;

public class AlphabetDigitSpecial {
	static  void checkingCharacter(char ch) {
		if(Character.isAlphabetic(ch)) {
			System.out.println("yes it a alphabet");
		}
		else if(Character.isDigit(ch)) {
			System.out.println("Yes it is a number");
		}
		else {
			System.out.println("special character");
		}
	}
	

	public static void main(String[] args) {
		Scanner sin=new Scanner(System.in);
		System.out.println("Ener any Character");
		char ch=sin.next().charAt(0);
		checkingCharacter(ch);
		


	}

}

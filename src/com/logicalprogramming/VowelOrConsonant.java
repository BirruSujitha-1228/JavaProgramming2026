package com.logicalprogramming;

import java.util.Scanner;

public class VowelOrConsonant {
	static void vowelOrConsonant(char ch) {
		if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z') ) {
			ch=Character.toUpperCase(ch);
		if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ) {
			System.out.println("It is an Vowel ");
		} 
		else {
			System.out.println("Consonant");
		}
		}
		else {
			System.out.println("Invalid Character");
		}
	}

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("Enter any Character");
		char letter = sin.next().charAt(0);
		vowelOrConsonant(letter);
		sin.close();

	}
}

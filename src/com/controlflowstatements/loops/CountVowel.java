package com.controlflowstatements.loops;

import java.util.Scanner;

public class CountVowel {
//	static Scanner sin=new Scanner(System.in);
	
	 static void vowelCount(String word) {
		int count=0;
		word=word.toLowerCase();
		for(int i=0;i<word.length();i++) {
			Character letter=word.charAt(i);
			if(letter=='a' || letter=='e' || letter=='i' ||  letter=='o' || letter=='u' ) {
				count++;
			}
			
		}
		System.out.println("count "+count);
	}
	public static void main(String[] args) {
		 Scanner sin=new Scanner(System.in);
			System.out.println("Enter a word");

		String word=sin.next();
		vowelCount(word);
        sin.close();
	}

}

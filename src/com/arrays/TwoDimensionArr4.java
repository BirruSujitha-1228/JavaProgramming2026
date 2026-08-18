package com.arrays;

import java.util.Arrays;

public class TwoDimensionArr4 {

	public static void main(String[] args) {
		String[] name=new String[5];
		name[0]="sujitha";
		name[1]="mamatha";
		name[2]="Hithesh";
		name[3]="subbu";
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		System.out.println("-------for each--------------");
		for(String n:name) {
			System.out.println(n);
		}
		
		System.out.println(Arrays.toString(name));

	}

}

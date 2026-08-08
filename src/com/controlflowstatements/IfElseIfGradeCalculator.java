package com.controlflowstatements;

import java.util.Scanner;

public class IfElseIfGradeCalculator {

	public static void main(String[] args) {
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter Student marks");
		System.out.println("enter telugu marks : ");
		int tel=sin.nextInt();
		System.out.println("enter Hindi marks : ");
		int hin=sin.nextInt();
		System.out.println("enter English marks : ");
		int eng=sin.nextInt();
		System.out.println("enter Math marks : ");
		int math=sin.nextInt();
		System.out.println("enter Science marks : ");
		int sci=sin.nextInt();
		int sum=tel+hin+eng+math+sci;
		double marks=(sum/500.0)* 100;
		System.out.println("percentage: "+marks);
		if(marks>100 || marks<0) {
			System.out.println("Invalid marks try to give correct marks ");
		}
		else if(marks>=90) {
			System.out.println("Grade A");
		}
		else if(marks>=75) {
			System.out.println("Grade B");
		}
		else if(marks>=60) {
			System.out.println("Grade C");
		}
		else if(marks>=40) {
			System.out.println("Grade D");
		}
		else {
			System.out.println("Fail");
		}

	}

}

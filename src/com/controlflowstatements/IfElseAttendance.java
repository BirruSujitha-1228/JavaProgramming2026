package com.controlflowstatements;

import java.util.Scanner;

public class IfElseAttendance {

	public static void main(String[] args) {
		Scanner sin=new Scanner(System.in);
		System.out.println("enter attendence percentage");
		double attendancePercentage=sin.nextDouble();
		if(attendancePercentage>= 75) {
			System.out.println("Exam Eligible ");
		}
		else {
			System.out.println("Not eligible ");
		}
		sin.close();
		

	}

}

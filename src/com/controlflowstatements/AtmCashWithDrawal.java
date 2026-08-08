package com.controlflowstatements;

import java.util.Scanner;

public class AtmCashWithDrawal {

	public static void main(String[] args) {
		Scanner sin=new Scanner(System.in);
		int pin=0;
		double withDrawLimit=10000;
		double balance=50000;
		System.out.println("enter  your pin ");
        pin=sin.nextInt();
        System.out.println("balance = "+balance);
        System.out.println("enter pin for checking");
        int enteredPin=sin.nextInt();
        if(enteredPin==pin) {
        	       System.out.println("enter withdraw amount");
        	       double withdrawAmount = sin.nextDouble();
        	       if(withdrawAmount<withDrawLimit) {
        	    	        if(balance>withdrawAmount) {
        	    	        	   balance=balance-withdrawAmount;
        	    	        	   System.out.println("your balance : "+balance);
        	    	        }
        	    	        else {
        	    	        	System.out.println("insufficient balance");
        	    	        }
        	       }
        	       else {
        	    	   System.out.println("you are reaching over the limit ");
        	       }
        }
        else {
        	System.out.println("Wrong pin entered");
        }
	}
	

}

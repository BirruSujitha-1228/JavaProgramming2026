package com.logicalprogramming;

import java.util.Scanner;

public class NthFibonacci {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sin.nextInt();
		int result = 0;
		result = Nthfibonacci(n);
		System.out.println("nth " + result);
		int res = countEvenFibonacci(n);
		System.out.println("even count " + res);
		int sumres = sumFibonacci(n);
		System.out.println("Sum result : " + sumres);
		int max=maxNum(n);
		System.out.println("max is : "+max);
		int min=minNum(n);
		System.out.println("min is : "+min);
		System.out.println("enter any number we will check it is fobonacci or not");
		int number=sin.nextInt();
		boolean b=isFibonacci(number);
		System.out.println(b);
		sin.close();
	}

	private static int maxNum(int n) {
		int n1 = 0;
		int n2 = 1;
		int i = 1;
		int max=n1;
		while (i <= n) {
			if(n1>max) {
				max=n1;
			}
			int n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			i++;
		}
		
		return max;
		
	}
	private static int minNum(int n) {
		int n1 = 0;
		int n2 = 1;
		int i = 1;
		int min=n1;
		while (i <= n) {
			if(n1<min) {
				min=n1;
			}
			int n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			i++;
		}
		return min;
		
	}
	private static int Nthfibonacci(int n) {
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		int i = 1;
		while (i < n) {
			// System.out.print(n1+" ");
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			i++;
		}
		return n1;

	}

	public static int countEvenFibonacci(int n) {
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		int i = 1;
		int count = 0;
		while (i <= n) {
			// System.out.print(n1+" ");
			n3 = n1 + n2;
			if (n1 % 2 == 0) {
				// System.out.println(count);
				count++;
			}
			n1 = n2;
			n2 = n3;
			i++;
		}
		return count;
	}

	public static int sumFibonacci(int n) {
		int n1 = 0;
		int n2 = 1;
		int i = 1;
		int sum = 0;
		while (i <= n) {
			sum = sum + n1;
			int n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			i++;
		}
		return sum;
	}
	public static boolean isFibonacci(int n) {
		int n1 = 0;
		int n2 = 1;
		while (true) {
	       System.out.println(n1);
	       if(n1==n)
	   		return true;
	       if(n1>n)
				return false;
			int n3 = n1 + n2;
			n1 = n2;
			n2 = n3;      
		}
	}

}

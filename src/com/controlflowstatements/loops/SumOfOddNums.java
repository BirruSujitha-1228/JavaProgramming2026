package com.controlflowstatements.loops;

public class SumOfOddNums {//1+3+5=9
	
	void sumOfOdd(int n) {
		if(n<=0) {
			System.out.println(n+" is invalid Input");
			return;
		}
		int sum=0;
		int count=0;
		for(int i=1;i<=n;i=i+2) {
			sum=sum+i;
			count++;
		}
		System.out.println("sum of odd numbers of "+n+" is "+sum);
		System.out.println("count "+count);
	}
	public static void main(String[] args) {
		SumOfOddNums sums=new SumOfOddNums();
		sums.sumOfOdd(5);
		sums.sumOfOdd(10);
		sums.sumOfOdd(-2);
	}

}

package com.controlflowstatements.loops;

public class SumOfEvenNums {
	void sumOfEven(int n){
		if(n<=0) {
			System.out.println(n+" is invalid Input");
			return;
		}
		int sum=0;
		for(int i=2;i<=n;i=i+2) {
			sum=sum+i;
			
		}
		System.out.println("Sum :"+sum);
		
	}

	public static void main(String[] args) {
		SumOfEvenNums nums=new SumOfEvenNums();
        nums.sumOfEven(10);
        nums.sumOfEven(0);
	}

}

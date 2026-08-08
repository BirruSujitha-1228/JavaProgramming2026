package com.controlflowstatements.loops;

public class SumOfNaturalNumbers {
	void sumNaturalNums(int n){
		if(n<=0) {
			System.out.println("invalid input");
			return;
		}
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
			
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		System.out.println("Sum Of Natural Numbers");
		SumOfNaturalNumbers sum=new SumOfNaturalNumbers();
		sum.sumNaturalNums(03);
		sum.sumNaturalNums(50);
		sum.sumNaturalNums(0);
		sum.sumNaturalNums(-1);

	}

}

package com.controlflowstatements.loops;

public class OneToNnumbers {
	
	void oneToNNums(int n) {
		if(n<=0) {
			System.out.println("input is not valid");
	        return;
		}
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		System.out.println("1 to n numbers ");
		OneToNnumbers nums=new OneToNnumbers();
		nums.oneToNNums(0);
		nums.oneToNNums(100);
		

	}

}

package com.controlflowstatements.loops;

public class NToOneNumbers {
	void nTo1Numbers(int n){
		if(n<=0) {
			System.out.println("input not valid ");
			return;
			
		}
		for(int i=n;i>=1;i--) {
		System.out.println(i);
		}
	}

	public static void main(String[] args) {
		System.out.println("N to 1 NUmbers");
		NToOneNumbers nums= new NToOneNumbers();
		nums.nTo1Numbers(0);
        nums.nTo1Numbers(100);
	}

}

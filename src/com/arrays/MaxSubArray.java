package com.arrays;

public class MaxSubArray {

	public static void main(String[] args) {
		//int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
		int[] arr= {0,2,1,2,3,4,9,5,6,7,8,9};
		int count=1;
		int maxCount=1;
		int start=0;
		int end=0;
		for(int i=1;i<arr.length;i++){
			if(arr[i]-arr[i-1]==1) {
				count++;
				if(count>maxCount) {
					maxCount=count;
					end=i;
				}
			}else {
				count=1;
				start=i;
			}
		}
		System.out.println(maxCount);
		System.out.println(start +" "+end);
			/*current=Math.max(arr[i],current+arr[i]);
			maxSum=Math.max(maxSum,current);	
		}
		System.out.println(maxSum);*/
			

	}

	
}

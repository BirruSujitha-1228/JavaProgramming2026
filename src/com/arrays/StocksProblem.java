package com.arrays;

public class StocksProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int buy=0;
		int sell=0;
		int profit=0;
		int maxProfit=0;
		int arr[]= {7,1,5,3,6,4};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				profit=arr[j]-arr[i];
				if(profit>maxProfit) {
					maxProfit=profit;
					buy=arr[i];
					sell=arr[j];
				}
			}
		}
		System.out.println("Buy : "+buy+" Sell : "+sell+" Max Profit : "+maxProfit);
	}

}

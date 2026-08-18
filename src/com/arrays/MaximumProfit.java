package com.arrays;

public class MaximumProfit {

	public static void main(String[] args) {
		int prices[]= {7,1,5,3,6,4};
		int buy=prices[0];
		int maxprofit=0;
		int sell=0;
		for(int i=1;i<prices.length;i++) {
			if(prices[i]<buy) {
				buy=prices[i];
			}
			int profit=prices[i]-buy;
			
			if(profit>maxprofit) {
				maxprofit=profit;
				sell=prices[i];
			}
		}
		System.out.println("Buy at : "+ buy);
		System.out.println("Sell at : "+sell);
		System.out.println("Profit : "+maxprofit);
		

	}

}

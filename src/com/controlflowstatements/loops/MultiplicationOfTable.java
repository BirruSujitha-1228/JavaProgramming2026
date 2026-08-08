package com.controlflowstatements.loops;

public class MultiplicationOfTable {
	void multiplyTable(int n) {
		if(n<=0) {
			System.out.println(n+" is invalid Input");
			return;
		}
		for(int i=1;i<=10;i++) {
			System.out.println(n+"*"+i+"="+n*i);
		}
		
	}

	public static void main(String[] args) {
		MultiplicationOfTable table=new MultiplicationOfTable();
		//table.multiplyTable(0);
		table.multiplyTable(5);
		

	}

}

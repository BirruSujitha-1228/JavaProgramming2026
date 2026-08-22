package com.arrays;

public class RangeInclusion {

	public static void main(String[] args) {
		int[][] arr= {{1,6},{2,7},{1,3}};
		int row=arr.length;
		int col=arr[0].length;
		int[][] tArr=new int[col][row];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				tArr[j][i]=arr[i][j];
			}
		}
//		int startIndex=0;
//		int endIndex=1;
//		int currCol=0;
//		for(int i=0;i<col;i++) {
//			for(int j=0;j<row;j++) {
//				
//				System.out.print( tArr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		for(int j=0;j<col;j++) {
			
		}
		

	}

}

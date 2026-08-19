package com.arrays;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		//int[][] arr=new int[2][2];
		int[][] arr= {{1,2,3,4},{5,6,7,8}};
		/*arr[0][0]=1;
		arr[0][1]=2;
		arr[1][0]=3;
		arr[1][1]=4;*/
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
		

	}

}

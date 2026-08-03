package methods;

import java.util.Scanner;

public class SquareDemo {
	double squareNumber(int side) {
		double square= side* side;
		return square;
		
	}

	public static void main(String[] args) {
		 SquareDemo d1=new  SquareDemo ();
		// double square=d1.squareNumber(2);
		// System.out.println("Square "+square);
		 Scanner sin=new Scanner(System.in);
		 System.out.println("enter a value");
		 int s=sin.nextInt();
		 double sq=d1.squareNumber(s);
		 System.out.println(sq);
		 
	}

}

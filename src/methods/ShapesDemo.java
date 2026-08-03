package methods;

import java.util.Scanner;

public class ShapesDemo {
	double triangle(int base,int height) {
		double triangle=0.5*base*height;
		return triangle;
	}
	double circle(int radius) {
		double area=Math.PI*Math.pow(radius,2);
		return area;
	}
	int rectangle(int length,int breadth) {
		int rect=length*breadth;
		return rect;
	}
	int square(int a ,int b) {
		int sq=a*b;
		return sq;
	}
	

	public static void main(String[] args) {
		ShapesDemo s1=new ShapesDemo();
		Scanner sin=new Scanner(System.in);
		System.out.println("---------triangle-----------");
		System.out.println("Enter base and height of a triangle ");
		int base=sin.nextInt();
		int height =sin.nextInt();
		double triangle=s1.triangle(base,height);
		System.out.println("Area of triangle is: "+triangle);
		
		System.out.println("---------Circle -----------");
		System.out.println("Enter radius of a circle ");
		int radius=sin.nextInt();
		double area=s1.circle(2);
		System.out.println("area of circle is : "+area);
		
		System.out.println("---------Rectangle-----------");
		System.out.println("Enter length and breadth of a reactangle ");
		int length=sin.nextInt();
		int breadth=sin.nextInt();
		int rect=s1.rectangle(length, breadth);
		System.out.println("area of rectangle is : "+rect);
		
		
		System.out.println("---------square -----------");
		System.out.println("Enter  two sides of a square ");
		int side=sin.nextInt();
		int side1=sin.nextInt();
		int are=s1.square(side,side1);
		System.out.println("area of square "+are);
		
	
	}

}

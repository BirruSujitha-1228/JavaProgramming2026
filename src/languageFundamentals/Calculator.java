package languageFundamentals;

public class Calculator {
	void addition(int a,int b) {
		int sum=a+b;
		System.out.println("Sum"+sum);
		subtraction(2,3);
	}
	void subtraction(float a,double b) {
		double diff=a-b;
		System.out.println( "difference is :"+diff);
		multiplication(3,5);
	}
	void multiplication(double d,float f) {
		double mul=d*f;
		System.out.println("multiplication :" +mul);
		divide((short) 2,2.0);
	}
	void divide(short a,double b){
		double div=a/b;
		System.out.println("division :" +div);
	}
	
	public static void main(String[] args) {
		Calculator c1=new Calculator();
		c1.addition(10, 20);

	}
	
	

}

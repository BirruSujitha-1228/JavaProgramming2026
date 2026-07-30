package languageFundamentals;

import java.util.Scanner;

public class BillCalculation {
	void calculateBill() {
		System.out.println("---------Electricity Bill--------");
		Scanner sin=new Scanner(System.in);
		System.out.println("enter customer name:");
		String name=sin.nextLine();
		System.out.println("Customer Name: "+name);
		System.out.println("enter no of electricity units");
		int units=sin.nextInt();
		double fixed_rate_unit=5;
		double totalbill=units*fixed_rate_unit;
		System.out.println("Total bill :$"+totalbill);
		
	}

	public static void main(String[] args) {
		BillCalculation b1=new BillCalculation();
		b1.calculateBill();
	}

}

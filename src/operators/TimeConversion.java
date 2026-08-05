package operators;

import java.util.Scanner;

public class TimeConversion {
	

	public static void main(String[] args) {
		Scanner sin=new Scanner(System.in);
		System.out.println("enter seconds");
		int seconds=sin.nextInt();
		int hours=seconds/3600;
		int minutes=(seconds% 3600)/60;
		int remainingSec=seconds%60;
		
		System.out.println(" Hours : "+hours );
		System.out.println(" minutes : "+minutes );
		System.out.println(" seconds : "+remainingSec );
		
				

	}

}

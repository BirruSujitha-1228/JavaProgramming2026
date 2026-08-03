package methods;

import java.util.Scanner;

public class MethodDemo {
	void getName(String firstName,String lastName) {
		System.out.println("Name  "+ firstName + " "+lastName);
	}
	void getAge(int age) {
		System.out.println("Age  "+age);
	}
	void getHeight(double height) {
		System.out.println("Height  "+height);
	}
	void getCGPA(float cgpa) {
		System.out.println("CGPA  "+cgpa);
	}
	void getGender(char gender) {
		System.out.println("Gender "+gender);
	}
	void getActiveStatus(boolean status) {
		System.out.println("Active status  "+status);
	}
	void getDeviceCode(byte deviceCode) {
		System.out.println("Device code  "+deviceCode);
	}
	void getBatchNumber(short number) {
		System.out.println("Batch Number "+number);
	}
	void getPhoneNumber(long contact) {
		System.out.println("phone number "+contact);
		
	}
	

	public static void main(String[] args) {
		 MethodDemo d1=new MethodDemo();
         Scanner sin=new Scanner(System.in);
         
         System.out.println("enter Student  First Name  and Last Name ");
 		 String fname=sin.nextLine();
 		 String lname=sin.nextLine();
 		 
 		 
 		System.out.println("Enter age");
 		int age=sin.nextInt();
 		
 		
 		System.out.println("enter Height");
 		double height =sin.nextDouble();
 		
 		
 		System.out.println("Enter CGPA");
 		float cgpa=sin.nextFloat();
 		
 		
 		System.out.println("enter gender");
 		char ch=sin.next().charAt(0);
 		
 		System.out.println("enter active status");
 		boolean b=sin.nextBoolean();
 		
 		
 		System.out.println("enter Device code");
 		byte code=sin.nextByte();
 		
 		
 		System.out.println("enter Btach Number ");
 		short s=sin.nextShort();
 		
 		
 		System.out.println("enter phone Number");
 		long l=sin.nextLong();

 		
 		
 		d1.getName(fname,lname);
 		d1.getAge(age);
 		d1.getHeight(height);
 		d1.getCGPA(cgpa);
 		d1.getActiveStatus(b);
 		d1.getDeviceCode(code);
 		d1.getBatchNumber(s);
 		d1.getPhoneNumber(l);
 		 
 		d1.getGender(ch);
 	 d1.example(d1);
         
         
	}
	void example(MethodDemo a) {
		System.out.println("Hello");
		
	}

}

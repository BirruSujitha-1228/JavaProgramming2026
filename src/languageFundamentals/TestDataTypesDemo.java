package languageFundamentals;

public class TestDataTypesDemo {

	public static void main(String[] args) {
		byte b=127;// Maximum range for byte
		System.out.println(b);//   127
		byte b1=(byte)128;
		System.out.println(b1);// -128
		byte b7=(byte)129;
		System.out.println(b7);// -127
		byte b2=(byte)130;                     /* -128 -127 -126 -------0 1 2 -----126 127*/
		System.out.println(b2);// -126
		byte b3=(byte)256;
		System.out.println(b3);//  0
		byte b4=(byte)257;
		System.out.println(b4);//  1
		byte b8=(byte)383;
		System.out.println(b8);//  127
		byte b5=(byte)384;
		System.out.println(b5);//  -128
		byte b6=(byte)385;
		System.out.println(b6);//  -127
		
		long l1=205457865L;
		float f1=12.6f;
		double d1=13234254.76876988658577859d;
		

	}

}

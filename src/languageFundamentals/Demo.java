package languageFundamentals;

public class Demo {
	static int count=0;
	int totalcount;
	{
		totalcount=count++;
		System.out.println(totalcount);
	}
	public static void main(String[] args) {
		Demo d1=new Demo();
		Demo d2=new Demo();
		Demo d3=new Demo();
		System.out.println(d3.totalcount);
	}

}

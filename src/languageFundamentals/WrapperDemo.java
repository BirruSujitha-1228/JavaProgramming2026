package languageFundamentals;

public class WrapperDemo {

	public static void main(String[] args) {
		//integer parsing 
		String i="21";//int value;
		System.out.println(Integer.parseInt(i));
		
		//double parsing
		String d="20.6666";
		System.out.println(Double.parseDouble(d));
		
		//character parsing
		char ch='A';
		System.out.println(Character.toString(ch));
		
		//boolean parsing
		String b="true";
		System.out.println(Boolean.parseBoolean(b));
		System.out.println(Boolean.parseBoolean("TRUE"));
	}

}

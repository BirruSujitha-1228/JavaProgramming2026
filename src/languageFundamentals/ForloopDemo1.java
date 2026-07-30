package languageFundamentals;

public class ForloopDemo1 {
	

	public static void main(String[] args) {
		int n=12213125;
		int digit=0;
		int count=0;
		while(n>0) {
             digit=n%10;
             if(digit==2) {
                count++;
             }
             n=n/10;
		}
		System.out.println(count);

	}

}

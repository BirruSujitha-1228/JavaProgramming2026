package languageFundamentals;

public class ForloopDemo {
	static int count=0;

	public static void main(String[] args) {
		int[] arr={1,2,2,1,3,1,2,5};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==2) {
				++count;
			}
		}
		System.out.println(count);
	}
}


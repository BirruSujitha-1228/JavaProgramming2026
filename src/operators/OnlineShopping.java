package operators;



public class OnlineShopping {
	
	void orderAmount(int a ) {
		if(a>=499 ) {
			System.out.println("Eligible for free delivery");
		}
		else{
			System.out.println("not eligible for fee delivery");
		}
	}
	public static void main(String[] args) {
		OnlineShopping o1=new OnlineShopping();
		o1.orderAmount(50);
		o1.orderAmount(500);
	}

}

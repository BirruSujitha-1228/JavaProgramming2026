package operators;



public class ClgAdmission {
	void result(double percentage ) {
		if(percentage>=75) {
			System.out.println("eligible for admission");
		}
		else {
			System.out.println("not eligible ");
		}
	}

	public static void main(String[] args) {
		ClgAdmission c1=new ClgAdmission();
		c1.result(80);
		

	}

}

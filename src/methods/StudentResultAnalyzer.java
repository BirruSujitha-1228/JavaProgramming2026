package methods;

public class StudentResultAnalyzer {
	static int sum;
	int calculatetotal(int m1,int m2,int m3,int m4,int m5) {
		sum=m1+m2+m3+m4+m5;
		return sum;
	}
	
	double calaculatePercentage() {
		double percentage=(sum/500.0)*100;
		return percentage;
	}
	
	int claculateAverage() {
		int avg=sum/5;
		return avg;
	}

	public static void main(String[] args) {
		StudentResultAnalyzer s1=new StudentResultAnalyzer();
		int toatal=s1.calculatetotal(70,80,90,79,80);
		double per=s1.calaculatePercentage();
        double avg=s1.claculateAverage();
        
        System.out.println("Toatal "+toatal);
        System.out.println("percentage "+per);
        System.out.println("average " +avg);
	}

}

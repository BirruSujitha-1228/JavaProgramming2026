package methods.constructors;

public class Hospital {
	int hospitalId;
	String hospitalName;
	String location;
	int doctorCount;
	double rating;

	public Hospital() {
		this(101);
	}

	public Hospital(int hospitalId) {
		this(hospitalId, "Apollo");
	}

	public Hospital(int hospitalId, String hospitalName) {
		this(hospitalId, hospitalName, "Hyderabad");
	}

	public Hospital(int hospitalId, String hospitalName, String location) {
		this(hospitalId, hospitalName, location, 150);
	}

	public Hospital(int hospitalId, String hospitalName, String location, int doctorCount) {
		this(hospitalId, hospitalName, location, doctorCount, 4.2);
	}

	public Hospital(int hospitalId, String hospitalName, String location, int doctorCount, double rating) {
		this.hospitalId = hospitalId;
		this.hospitalName = hospitalName;
		this.location = location;
		this.doctorCount = doctorCount;
		this.rating = rating;
	}

	public static void main(String[] args) {

	    // Creates an object using the no-argument constructor.
	    // Default values are assigned through constructor chaining.
	    Hospital h = new Hospital();

	    // Creates another object using the no-argument constructor.
	    Hospital h1 = new Hospital();

	    // Overriding the default constructor values using object reference.
	    h1.hospitalId = 102;
	    h1.hospitalName = "KIMS";
	    h1.location = "Visakhapatnam";
	    h1.doctorCount = 180;
	    h1.rating = 4.7;

	    h.display();
	    h1.display();

	    // Creates an object using the three-parameter constructor.
	    // Remaining values are assigned through constructor chaining.
	    Hospital h2 = new Hospital(103, "Yashoda Hospital", "Secunderabad");
	    h2.display();
	}

	public void display() {
		System.out.println("Hospital Id : " + hospitalId);
		System.out.println("Hospital Name : " + hospitalName);
		System.out.println("Hospital Location : " + location);
		System.out.println("Doctor count : " + doctorCount);
		System.out.println("Overall Rating : " + rating);
		System.out.println("---------------------------");
	}

}

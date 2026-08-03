package methods.constructors;

public class EmployeeConstructor {
	int empId;
	String empName;
	int age;
	String gender;
	String department;
	String designation;
	double salary;
	double bonus;
	double hra;
	double da;
	double pf;
	double tax;
	double netSalary;
	String email;
	long mobileNumber;
	String address;
	String city;
	String state;
	String companyName;
	boolean active;

	public void display() {
		System.out.println("Employee Id : " + empId);
		System.out.println("Employee Name : " + empName);
		System.out.println("Employee age : " + age);
		System.out.println("Employee gender : " + gender);
		System.out.println("Employee department : " + department);
		System.out.println("Employee designation : " + designation);
		System.out.println("Employee salary : " + salary);
		System.out.println("Employee bonus : " + bonus);
		System.out.println("Employee email : " + email);
		System.out.println("Employee Mobile Number : " + mobileNumber);

	}

	EmployeeConstructor() {
		System.out.println(".....No arg constructor....");
	}

	EmployeeConstructor(int empId, String empName, int age) {
		System.out.println(".....construtor with 3 parameters with THIS keyword......");
		this.empId = empId;
		this.empName = empName;
		this.age = age;
	}

	EmployeeConstructor(String name, int id, int empage) {
		System.out.println(".....construtor with 3 parameters without THIS keyword......");
		empName = name;
		empId = id;
		age = empage;
	}

	EmployeeConstructor(int empId, String empName, int age, String gender, String department, String designation,
			double salary, double bonus, String email, long mobileNumber) {
		System.out.println(".........basic info about employee");
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.designation = designation;
		this.salary = salary;
		this.bonus = bonus;
		this.email = email;
		this.mobileNumber = mobileNumber;
	}

	EmployeeConstructor(double hra, double da, double pf, double tax, double salary, double bonus, String address,
			String city, String state, String companyName, boolean active) {
		System.out.println(".........last constructor.....");
		this.hra = hra;
		this.da = da;
		this.pf = pf;
		this.tax = tax;
		this.salary = salary;
		this.bonus = bonus;
		this.address = address;
		this.city = city;
		this.state = state;
		this.companyName = companyName;
		this.active = active;
		this.netSalary=salary + bonus + hra + da - pf - tax;
		//netSalary = salary + bonus + hra + da - pf - tax;
	}

	public static void main(String[] args) {
		EmployeeConstructor e1 = new EmployeeConstructor();
		e1.display();
		EmployeeConstructor e2 = new EmployeeConstructor(101, "sujitha", 22);
		e2.display();
		EmployeeConstructor e3 = new EmployeeConstructor("mamatha", 101, 20);
		e3.display();
		EmployeeConstructor e4 = new EmployeeConstructor(101, "sujji", 22, "Female", "cse", "software developer", 40000,
				500, "abc@gmail.com", 1234567891L);
		e4.display();
		EmployeeConstructor e5 = new EmployeeConstructor(30000, 2000, 1800, 1200, 40000, 5000, "hyderabad", "kphb",
				"Telangana", "chatGpt", true);
		e5.display2();
	}

	public void display2() {
		System.out.println("HRA   :" + hra);
		System.out.println("DA  :" + da);
		System.out.println("tax  :" + tax);
		System.out.println("salary  :" + salary);
		System.out.println("bonus :" + bonus);
		System.out.println("address  :" + address);
		System.out.println("city  :" + city);
		System.out.println("state  :" + state);
		System.out.println("company name : " + companyName);
		System.out.println("active status  :" + active);
		System.out.println("netsalry  :" + netSalary);
		System.out.println("PF : " + pf);

	}

}

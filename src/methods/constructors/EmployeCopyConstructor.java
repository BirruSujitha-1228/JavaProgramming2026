package methods.constructors;

public class EmployeCopyConstructor {
	int empId;
	String empName;
	double salary;
	String department;
	
	EmployeCopyConstructor(int empId,String empName,double salary,String department){
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
		this.department=department;
	}
	EmployeCopyConstructor(EmployeCopyConstructor e1){
		this.empId=e1.empId;
		this.empName=e1.empName;
		this.salary=e1.salary;
		this.department=e1.department;
	}
	void display() {
		System.out.println("Emp Id : "+empId);
		System.out.println("Emp name : "+empName);
		System.out.println("Emp salary : "+salary);
		System.out.println("Emp department : "+department);	
		System.out.println("----------------------------------------------");
	}
	public static void main(String[] args) {
		EmployeCopyConstructor e1=new EmployeCopyConstructor(101,"Suji",400000,"CSE");
		e1.display();
		EmployeCopyConstructor e2= new EmployeCopyConstructor (e1);
		e2.display();
		System.out.println("........After changing e2.......");
		e2.empId=102;
		e2.empName="mammu";
		e2.salary=300000;
		e2.department="ECE";
		e1.display();
		e2.display();
		
	}

}

package languageFundamentals;

public class Employee {
	Integer empno=1;
	String name="Sujitha";
	//Double salary=5000.0;
	String hiredate="03-07-2026";
	Integer experience=2;
	{
		Double monthsalary=5000.0;
		Double annualsalary= monthsalary*12;
		Double annualbonus=annualsalary*0.1;
		Double totalsalary=annualsalary+annualbonus;
		System.out.println("employee Number: "+ empno);
		System.out.println("employee Name: "+ name);
		System.out.println("employee hiredate: "+ hiredate);
		System.out.println("employee experience: "+ experience);
		System.out.println("employee Month Salary: "+ monthsalary);
		System.out.println("employee Annual Salary: "+ annualsalary);
		System.out.println("employee Annual Bonus: "+  annualbonus);
		System.out.println("employee Total Salary: "+ totalsalary);
	}

	public static void main(String[] args) {
		new Employee();
         
	}

}

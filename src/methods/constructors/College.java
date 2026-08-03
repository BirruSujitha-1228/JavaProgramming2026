package methods.constructors;

public class College {
	String collegeName;
	String location;
	College(){
		this("unkonown","unknown");
	}
	College(String collegeName,String location){
		this.collegeName=collegeName;
		this.location=location;
		System.out.println("College Parameterized Constructor");
	}
	public static void main(String[] args) {
		Student1 s1=new Student1();
		s1.display();
	}
}

class Student1 extends College{
	int studentId;
	String studentName;
	Student1(){
		this("Aits","Rajampet",101,"sujitha");
		System.out.println("Student Default Constructor");
	}
	Student1(String collegeName,String location,int studentId,String studentName){
		super(collegeName,location);
		this.studentId=studentId;
		this.studentName=studentName;
		System.out.println("Student parametrized constructor");
	}
	void display() {
		System.out.println("College Name "+collegeName);
		System.out.println("College location "+location);
		System.out.println("student id "+studentId);
		System.out.println("Student Name "+studentName);
		System.out.println("------------------------------------");
	}
	
	
	
}






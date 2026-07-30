package languageFundamentals;

public class StudentInfo {
	int rollNum;
	String studentName;
	int age;
	char gender;
	char section;
	int sub1,sub2,sub3,sub4,sub5;
	float percentage;
	String passed_Status;
	char grade;

	public static void main(String[] args) {
		StudentInfo sf=new StudentInfo();
		sf.rollNum=1;
		sf.studentName="suji";
		sf.age=22;
		sf.gender='F';
		sf.section='D';
		sf.sub1=99;sf.sub2=98;sf.sub3=99;sf.sub4=100;sf.sub5=89;
		sf.percentage=95;
		sf.passed_Status="pass";
		sf.grade='A';
		System.out.println("Rollnum:"+sf.rollNum+"\n"+"StudentName:"+sf.studentName+"\n"+"Age:"+sf.age+"\n"+"Gender:"+sf.gender+"\n"+"Section:"+sf.section+
				"\n"+"Marks:\n"+"Sub1:"+sf.sub1+"\tSub2:"+sf.sub2+"\tSub3:"+sf.sub3+"\tSub4:"+sf.sub4+" Sub5:"+sf.sub5+"\n"+"Percentage:"+sf.percentage+"\n"+"PassedStatus:"+sf.passed_Status
				+"\n"+"Grade:"+sf.grade);
		

	}

}

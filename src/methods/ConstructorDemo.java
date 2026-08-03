package methods;

public class ConstructorDemo {
	int sid;
	String sname;
	ConstructorDemo(){
		System.out.println("Constructor with no args....");
		System.out.println(sid);
		System.out.println(sname);
	}
	ConstructorDemo(int sid,String sname){
		this.sid=sid;
		this.sname=sname;
	}
	void show() {
		System.out.println("constructor with args");
		System.out.println(sid);
		System.out.println(sname);
	}
	public static void main(String[] args) {
		ConstructorDemo d1=new ConstructorDemo();
		ConstructorDemo d2=new ConstructorDemo(101,"suji");
		d2.show();
	}
}

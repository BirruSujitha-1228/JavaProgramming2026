package methods.constructors;

public class BankChaining {
	int accountNumber;
	String holderName;
	double balance;
	String branch;
	String ifscCode;
	
	public BankChaining(){
		this(1228);
	}
	public BankChaining(int accountNumber){
		this(accountNumber,"Sujitha");
	}
	public BankChaining(int accountNumber,String holderName){
		this(accountNumber,holderName,5000);	
	}
	public BankChaining(int accountNumber,String holderName,double balance){
		this( accountNumber, holderName, balance,"Hyderabad");	
	}
	
	public BankChaining(int accountNumber,String holderName,double balance,String branch){
		this(accountNumber,holderName,balance,branch,"SBIN0123456");	
	}
	public BankChaining(int accountNumber, String holderName, double balance, String branch, String ifscCode) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
		this.branch = branch;
		this.ifscCode = ifscCode;
	}
	public static void main(String[] args) {
		BankChaining b1=new BankChaining();
		BankChaining b2=new BankChaining(1012,"Mamatha",1000,"proddutur","HDFC0000056");
		BankChaining b3=new BankChaining(2601,"Hithesh",3000);
		
		/*b2.accountNumber=1012;
		b2.holderName="Mamatha";
		b2.balance=1000;
		b2.branch="proddutur";
		b2.ifscCode="HDFC0000056";*/
		b1.display();
		b2.display();
		b3.display();
		

	}
	
	public void display() {
		System.out.println("Bank Account Number : "+accountNumber );
		System.out.println("Holder Name : "+holderName );
		System.out.println("Bank Balance : "+balance );
		System.out.println("Bank branch : "+branch);
		System.out.println("Bank IFSC code : "+ifscCode );
		System.out.println("------------------------------------");
	}

}

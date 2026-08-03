package methods.constructors;

public class BankAccount {
	int accountNumber;
	String holderName;
	double balance;
	BankAccount(){
		
	}
	BankAccount(int accountNumber,String holderName){
		
		this.accountNumber=accountNumber;
		this.holderName=holderName;
		
	}
    BankAccount(BankAccount b,double balance){
		this.accountNumber=b.accountNumber;
		this.holderName=b.holderName;
		this.balance=balance;
		
	}
	void display() {
		System.out.println("-----------------");
		System.out.println("Account Number : "+accountNumber);
		System.out.println("holder name : "+holderName);
		System.out.println("balance :"+balance);
	}
	public static void main(String[] args) {
		BankAccount b=new BankAccount();
		b.display();
		BankAccount b1=new BankAccount(1228,"Sujitha");
		b1.display();
		BankAccount b2=new BankAccount(b1,5000);
		b2.display();
		
		
		

	}

}

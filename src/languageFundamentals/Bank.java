package languageFundamentals;

public class Bank {
	double balance=10000;
	void checkBalance() {
		System.out.println("Balance "+balance);
	}
	void deposit(double amount) {
		balance =balance+amount;
		System.out.println("after deposit amount "+amount);
		checkBalance();
	}
	void withdrawAmount(double amount) {
		balance=balance-amount;
		System.out.println("after withdraw Amount"+amount);
		checkBalance();
	}

	public static void main(String[] args) {
		Bank b1=new Bank();
		b1.checkBalance();
		b1.deposit(5000);
		b1.withdrawAmount(5000);
	}

}

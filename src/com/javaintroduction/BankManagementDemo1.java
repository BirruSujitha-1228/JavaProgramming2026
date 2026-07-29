package com.javaintroduction;

public class BankManagementDemo1 {//"Static variable generates the account number, instance variable stores the account number."

    // Static variable: Only one copy exists for the entire class.
    // Used to generate unique account numbers.
    static int counter = 1000;

    // Instance variable: Each object gets its own copy.
    // Stores the account number of a particular customer.
    int accountNumber;

    String customerName;
    double accountBalance;

    // Instance initialization block.
    // Runs automatically whenever a new object is created.
    {
        accountNumber = ++counter;
        // Increment counter first, then assign the value
        // to this object's accountNumber.
    }

    void show() {
        System.out.println(accountNumber + " " +
                           customerName + " " +
                           accountBalance);
    }

    public static void main(String[] args) {

        BankManagementDemo1 suji = new BankManagementDemo1();
        suji.customerName = "Suji";
        suji.accountBalance = 5000.00;

        BankManagementDemo1 abhi = new BankManagementDemo1();
        abhi.customerName = "Abhi";
        abhi.accountBalance = 6000.00;

        BankManagementDemo1 mammu = new BankManagementDemo1();
        mammu.customerName = "Mammu";
        mammu.accountBalance = 7000.00;

        BankManagementDemo1 hithu = new BankManagementDemo1();
        hithu.customerName = "Hithu";
        hithu.accountBalance = 8000.00;

        // Each object prints its own account number
        suji.show();   // 1001 Suji 5000.0
        abhi.show();   // 1002 Abhi 6000.0
        mammu.show();  // 1003 Mammu 7000.0
        hithu.show();  // 1004 Hithu 8000.0

        // Calling suji again still prints 1001
        // because 1001 is stored in suji's instance variable.
        suji.show();
    }
}
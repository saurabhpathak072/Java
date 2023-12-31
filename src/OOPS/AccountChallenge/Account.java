package OOPS.AccountChallenge;

import java.util.Scanner;

public class Account {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public Account() {
        this(123,23,"23er","ewrfg",7865456789l);
        System.out.println("This is default constructor Initiated.");
    }

    public Account(int accountNumber, double accountBalance, String customerName, String email, long phoneNumber) {
        System.out.println("This is the main constructor.");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void getAccountDetail(){
        System.out.println("Customer Name : "+this.getCustomerName()+"\nAccount Number : "+this.getAccountNumber()+"\nAccount Balance : \u20B9"+this.getAccountBalance()+"\nContact No. : "+this.getPhoneNumber()+"\nEmail : "+this.getEmail());
    }

    protected void depositAmount() {
        double amount = 0d;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Amount to Deposit : ");
        while (amount <= 0) {
            try {
                amount = scanner.nextDouble();
                System.out.println("\u20B9"+amount + " has been credited to the account.");
                this.accountBalance += amount;
                System.out.println("Your updated balance is : \u20B9" + this.accountBalance);
            } catch (Exception ex) {
                System.out.println("You Entered Invalid Amount! \nPlease enter valid amount.");
                scanner.next();
            }
        }
    }

    protected void withdrawlAmount() {
        double amount = 0d;
       Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Amount to Withdrawal : ");
        while ( amount <= 0) {
            try {
                amount = scanner.nextDouble();
                System.out.println("\u20B9"+amount + " has been debited from the account.");
                this.accountBalance -= amount;
                System.out.println("Your updated balance is : \u20B9" + this.accountBalance);
            } catch (Exception ex) {
                System.out.println("You Entered Invalid Amount! \nPlease enter valid amount.");
                scanner.next();
            }
        }
    }
}

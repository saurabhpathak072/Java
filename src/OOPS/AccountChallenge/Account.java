package OOPS.AccountChallenge;

import java.util.Scanner;

public class Account {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private long phoneNumber;

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
        System.out.println("Customer Name : "+this.getCustomerName()+"\nAccount Number : "+this.getAccountNumber()+"\nAccount Balance : "+this.getAccountBalance()+"\nContact No. : "+this.getPhoneNumber()+"\nEmail : "+this.getEmail());
    }

    protected void depositAmount() {
        double amount = 0d;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Amount to Deposit : ");
        while (amount <= 0) {
            try {
                amount = scanner.nextDouble();
                System.out.println(amount + " has been credited to the account.");
                this.accountBalance += amount;
                System.out.println("Your updated balance is : " + this.accountBalance);
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
                System.out.println(amount + " has been debited from the account.");
                this.accountBalance -= amount;
                System.out.println("Your updated balance is : " + this.accountBalance);
            } catch (Exception ex) {
                System.out.println("You Entered Invalid Amount! \nPlease enter valid amount.");
                scanner.next();
            }
        }
    }
}

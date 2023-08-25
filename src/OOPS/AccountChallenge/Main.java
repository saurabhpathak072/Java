package OOPS.AccountChallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account();
//        acc1.setAccountNumber(123456);
//        acc1.setCustomerName("ABCD");
//        acc1.setAccountBalance(5000);
//        acc1.setEmail("satin73396@stypedia.com");
//        acc1.setPhoneNumber(7840937715l);
        boolean isAccountDetail = true;
        Scanner sc = new Scanner(System.in);
        while (isAccountDetail) {
            System.out.println("Please Enter Following option: \n1. => Account Details\n2. => Deposit Amount\n3. => Withdrawal Amount\n4. => Cancel");
            try {
                int option = sc.nextInt();
                switch (option) {
                    case 1 -> acc1.getAccountDetail();
                    case 2 -> acc1.depositAmount();
                    case 3 -> acc1.withdrawlAmount();
                    case 4 -> {
                        isAccountDetail = false;
                    }
                    default -> {
                        System.out.println("You Entered invalid option,\tPlease enter from Above options.");
                    }
                }
            } catch (Exception ex) {
                System.out.println("Invalid Option! " + ex);
                System.out.println("Please Enter Valid Options.");
                sc.next();
            }

        }

    }
}

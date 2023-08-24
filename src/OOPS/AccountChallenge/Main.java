package OOPS.AccountChallenge;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.setAccountNumber(123456);
        acc1.setCustomerName("ABCD");
        acc1.setAccountBalance(5000);
        acc1.setEmail("satin73396@stypedia.com");
        acc1.setPhoneNumber(7840937715l);

        acc1.getAccountDetail();
        acc1.depositAmount();
        acc1.withdrawlAmount();
    }
}

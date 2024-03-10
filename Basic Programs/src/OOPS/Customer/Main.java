package OOPS.Customer;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        System.out.println("Name : "+customer1.getName()+"\nCredit Limit: "+customer1.getCredit_limit()+"\nEmail: "+customer1.getEmail());
        Customer customer2 = new Customer("Ram","jaishriRam@email.com");
        System.out.println("Name : "+customer2.getName()+"\nCredit Limit: "+customer2.getCredit_limit()+"\nEmail: "+customer2.getEmail());
        Customer customer3 = new Customer("Hanuman",4590,"jaishriRam@Raghav.com");
        System.out.println("Name : "+customer3.getName()+"\nCredit Limit: "+customer3.getCredit_limit()+"\nEmail: "+customer3.getEmail());

    }
}

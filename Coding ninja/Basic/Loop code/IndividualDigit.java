import java.util.Scanner;
public class IndividualDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reserve=0;
        while (num != 0) {
            int digit = num % 10;
            reserve = reserve*10 + digit;
            
           
            num /= 10;
        }

        System.out.println(reserve);
        sc.close();
    }
}

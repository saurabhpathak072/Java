import java.util.Scanner;;
public class Factors {
    public static int factorial(int n){
        if(n < 2){
            return 1;
        }

        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(factorial(num));
        sc.close();
    }
}

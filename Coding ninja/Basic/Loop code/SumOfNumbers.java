import java.util.*;
class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum=0;

        for (int i = 0; i <= n; i++) {
            sum += i;
        }

        System.out.println(sum);
        sc.close();
    }
}

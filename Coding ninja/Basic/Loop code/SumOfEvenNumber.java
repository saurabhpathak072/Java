import java.util.Scanner;

public class SumOfEvenNumber {

    protected static boolean isEven(int num) {
        return num % 2 == 0 ? true : false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0;
        for (int i = 1; i <= n; i++) {
            if (isEven(i)) {
                sum += i;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}

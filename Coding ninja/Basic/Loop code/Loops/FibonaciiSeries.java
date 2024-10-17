package Loops;

import java.util.Scanner;

public class FibonaciiSeries {
    public static int fibonacii(int n){
        if(n<2)
            return n;
return fibonacii(n-2)+fibonacii(n-1);
    }
    // public static int fibonacci(int n) {
    //     if (n <= 1) {
    //         return n; // Base case: return n if it's 0 or 1
    //     }
    //     return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.println(fibonacii(i));
        }
        sc.close();
    }
}

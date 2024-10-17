package Loops;

import java.util.Scanner;

/**
 * PrimeNumber
 */
public class PrimeNumber {

    public static boolean isPrime(int n){
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if(n%i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 2; i <= num; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
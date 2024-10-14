package Loops;

import java.util.Scanner;

public class PowerOfNumber {
    public static int powerOf(int num1, int num2){
        int num =1;

        for (int i = num; i <= num2; i++) {
            num *= num1;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(powerOf(num1, num2));
        sc.close();
    }
}

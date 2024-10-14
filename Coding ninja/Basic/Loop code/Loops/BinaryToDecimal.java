package Loops;

import java.util.Scanner;

public class BinaryToDecimal {
    public static int posBin(int digit , int num){
        return (int) (digit*Math.pow(2, num));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            // String binary = sc.nextLine();s
            // int result = Integer.parseInt(binary, 2);
            int num = sc.nextInt();
int i=0;
int sum = 0;
            while (num>0) {
                int digit = num%10;
                num /= 10;
                sum = sum + posBin(digit,i);
                i++;

            }
            System.out.println(sum);
        sc.close();
    }
}

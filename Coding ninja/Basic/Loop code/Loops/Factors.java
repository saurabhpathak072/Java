package Loops;

import java.util.Scanner;

class Factors {
    public static long factorial(long num){
        if(num<2)
            return 1;
        return num*factorial(num-1);
    }


  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();

        System.out.println(factorial(number));
        boolean isFactor = false;
        for (int i = 2; i <= number/2; i++) {
            if(number%i == 0){
                isFactor = true;
                System.out.println("i "+i);
            }
        }
        if(!isFactor)
            System.out.println("-1");
        sc.close();
    }
}

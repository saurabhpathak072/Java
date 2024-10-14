package Loops;

import java.util.Scanner;

public class TermAP {
    public int calculate(int n){
        return(3*n+2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        TermAP tp = new TermAP();
        while (num>0) {
            int result = tp.calculate(i);
            // System.out.println(tp.calculate(num));
            if(result%4 != 0){
                System.out.println(result);
                num--;
            }
            i++;
        }
        sc.close();

    }
}

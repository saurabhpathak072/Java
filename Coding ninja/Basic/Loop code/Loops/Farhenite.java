package Loops;

import java.util.Scanner;

public class Farhenite {
    public static int toCelcius(int farenite){
        return (int)((farenite - 32)*(float)5/9);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        int w = sc.nextInt();

        for (int i = s; i <= e; i=i+w) {
            System.out.println(i+" "+toCelcius(i));
        }
        sc.close();
    }
}

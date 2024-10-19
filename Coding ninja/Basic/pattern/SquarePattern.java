import java.util.Scanner;

/**
 * SquarePattern
 */
public class SquarePattern {

    public static void printSquare(int n){
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println("------------------------------");
    }

    public static void numberWithSamePattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("------------------------------");
    }
    public static void reverseNumberWithSamePattern(int n){
        for (int i = n; i > 0; i--) {
            for (int j = n; j > 0; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("------------------------------");
    }
    public static void numberPattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("------------------------------");
    }
    
    public static void reverseNumberPattern(int n){
        for (int i = n; i > 0; i--) {
            for (int j = n; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("------------------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of rows: ");
        int rows = sc.nextInt();
        printSquare(rows);
        numberWithSamePattern(rows);
        numberPattern(rows);
        reverseNumberWithSamePattern(rows);
        reverseNumberPattern(rows);
        sc.close();
    }
}
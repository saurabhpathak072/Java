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
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of rows: ");
        int rows = sc.nextInt();
        printSquare(rows);

        sc.close();
    }
}
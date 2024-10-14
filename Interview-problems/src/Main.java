import FactorialNumber.FactorialNumber;
import FibonacciSeries.FibonaciiSeries;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try {
            int option = 0;
//            System.out.println(option);
            while (option>=0){
                System.out.println("Select program from below options:");
                System.out.println("");
                System.out.println("1. find factorial");
                System.out.println("2. Fibonacci Series");
                option = scanner.nextInt();
                switch (option){
                    case 1:
                        FactorialNumber fndFactorial = new FactorialNumber();
                        fndFactorial.findFactorialNumber();
                        break;
                    case 2:
                        FibonaciiSeries fiboSeries = new FibonaciiSeries();
                        fiboSeries.findFibonaciiSeries();
                        break;
                    case 0:
                        option = -1;
                        break;
                    default:
                        System.out.println("Please select option");
                }
            }

        }catch (Exception ex){
            System.out.println("Error"+ex);
        }







    }
}

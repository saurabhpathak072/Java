package UserInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EnterSumOfUserInput {
    protected  int getSumOfUserInput(){
        int count = 0, sum=0;
        Scanner scanner = new Scanner(System.in);
        while (count<5){
                try {
                    System.out.println("Please Enter "+(count+1)+" Number ");
                    int number = scanner.nextInt();
                        sum += number;
                        count++;

                }catch (InputMismatchException e){
                    System.out.println("You Entered wrong Number, Pleas Enter Valid Number  ");
                    scanner.next();
                }

        }
        scanner.close();
        return sum;
    }
}

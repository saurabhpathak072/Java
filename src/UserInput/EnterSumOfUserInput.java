package UserInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EnterSumOfUserInput {


    protected  int getSumOfUserInput(){
        int count = 0, sum=0;
        boolean isValid = true;

        Scanner scanner = new Scanner(System.in);
        while (count<5){
            do {
                try {
                    System.out.println("Please Enter "+(count+1)+" Number ");
                    int number = scanner.nextInt();
                    if(number<0)
                        isValid = false;
                    else {
                        sum += number;
                        count++;
                    }
                }catch (InputMismatchException e){
                    System.out.println("You Entered wrong Number, Pleas Enter Valid Number  ");
                    scanner.next();
                }
            }while (!isValid && count<5);

        }
        scanner.close();

        return sum;
    }
}

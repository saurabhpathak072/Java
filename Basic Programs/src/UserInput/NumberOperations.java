package UserInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberOperations {
    int number = 0;
    int largestPrimeNumber = 2;
    public boolean isValid(){
        if(number<0){
            System.out.println("You Enter Negative Number");
            return true;
        }

        if(number < 2){
            System.out.println("You Enter Invalid Number");
            return true;
        }

        return false;

    }
    protected  int getLargestPrimeNumber(){
    int enteredNumner = 0;
    boolean isInValid = false, reEnter=false;
        Scanner scanner = new Scanner(System.in);


        do{
            try {
                this.number = scanner.nextInt();
                isInValid = this.isValid();
                reEnter=false;
            }catch (InputMismatchException e){
//                this.number = -1;

                isInValid = this.isValid();
                scanner.nextLine();  //clears the buffer
            }





        }while (isInValid);
//        this.number = enteredNumner;
        if(number <= 1){
            System.out.println("You Enter Invalid Number");
            return -1;
        }
        while (largestPrimeNumber < number){
            if(number%largestPrimeNumber != 0)
                largestPrimeNumber++;
            else
                number /=largestPrimeNumber;
        }
        return number;
    }
}

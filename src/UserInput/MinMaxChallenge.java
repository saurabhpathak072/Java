package UserInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MinMaxChallenge {
    double maxNumber = 0d, minNumber = 0d;

    protected void getNumber(){
        double number = 0d;
        boolean isvalid = true;
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                number = scanner.nextDouble();
                System.out.println(number);
                if(this.minNumber == 0 && this.maxNumber==0){
                    this.maxNumber = number;
                    this.minNumber = number;
                }
                if(number >= this.maxNumber){
                    this.maxNumber = number;
                } else if (number < this.minNumber) {
                    this.minNumber = number;
                }else{
                    System.out.println(number);
                }
            }catch (InputMismatchException ex){
                System.out.println(ex);
                isvalid=false;
                scanner.next();
            }

        }while (isvalid);
        scanner.close();
        System.out.println("Maximum Number is : "+this.maxNumber);

        System.out.println("Minimum Number is : "+this.minNumber);
    }

}

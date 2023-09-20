package OOPS.SimpleCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isInValid= true, isCalculate=true;
        Calculator calculate = new Calculator();
        Scanner scanner = new Scanner(System.in);
        while (isInValid){
            try {
                System.out.println("Please Enter First Digit Input : ");
                double fNum = scanner.nextDouble();
                calculate.setFirstNumber(fNum);
                System.out.println("First Number is => "+calculate.getFirstNumber());

                System.out.println("Please Enter Second Digit Input : ");
                double sNum = scanner.nextDouble();
                calculate.setSecondNumber(sNum);
                System.out.println("Second Number is => "+calculate.getSecondNumber());
                isInValid=false;
            }catch (Exception ex){
                System.out.println("Invalid Input! \n"+ex);
                scanner.next();
            }
        }
        while (isCalculate){
            try {
                System.out.println("1. Addition \n2. Substract\n3. Multiply \n4. Division \n5. Close");
                int options = scanner.nextInt();
                        switch (options){
                            case 1 ->{
                                System.out.println(calculate.getFirstNumber() +" + "+calculate.getSecondNumber()+" = "+calculate.getAdditionResult());
                            }
                            case 2 ->{
                                System.out.println(calculate.getFirstNumber() +" - "+calculate.getSecondNumber()+" = "+calculate.getSubtractionResult());
                            }
                            case 3 ->{
                                System.out.println(calculate.getFirstNumber() +" * "+calculate.getSecondNumber()+" = "+calculate.getMultiplicationResult());
                            }
                            case 4->{
                                System.out.println(calculate.getFirstNumber() +" / "+calculate.getSecondNumber()+" = "+calculate.getDivisionResult());
                            }
                            case 5 ->{
                                isCalculate=false;
                            }
                            default -> System.out.println("You Entered Invalid option.");
                        }
            }catch (Exception ex){
                System.out.println("Invalid Input! \n"+ex);
                scanner.next();
            }


        }


    }
}

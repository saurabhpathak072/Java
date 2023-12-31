package UserInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputMain {
    public static String getAgeUsingConsole(){
        String name = System.console().readLine("Hey! Whats your name.");
        System.out.println("Hello! "+name);
        int age = Integer.parseInt(System.console().readLine("Whats Your Age? \n"));
        return "Your Age is : "+age;
    }

    public static void getAgeUsingScanner(){
        Scanner scanner = new Scanner(System.in);

        int age = 0;
        System.out.println("Please Enter your Name.");
        String name = scanner.nextLine();
        System.out.println("Hey! "+name+" Welcome to Java World!");
        System.out.println("Please Enter Your Age?");
        try {
            age = scanner.nextInt();
            if (age > 0 && age < 100) {
                if (age > 18) {
                    System.out.println("You are adult, your age is " + age);
                } else {
                    System.out.println("You are minor, your age is " + age);
                }
            } else {
                System.out.println("Please Enter valid Age>");
            }
        }
        catch (InputMismatchException e) {
            System.out.println(e);
        }


    }
    public static void main(String[] args) {

//        try{
//            NumberOperations numOp = new NumberOperations();
////            System.out.println("User Input from System.Console() : "+ getAgeUsingConsole());
////          System.out.println("We can "+(canPack(2,3,12)? "":"Not ")+"Pack 2 Big and 3 Small upto 12");
//          calculatePack(2,10,1);
//
//            System.out.println( "Please Enter Number to get Largest Prime Number : ");
//            System.out.println(numOp.getLargestPrimeNumber());
//        }
//        catch (NullPointerException e){
//            getAgeUsingScanner();
//        }

//        ----------------------------------Sum Of Entered Digit-------------------

//        EnterSumOfUserInput sum = new EnterSumOfUserInput();
//         int getSum = sum.getSumOfUserInput();
//        System.out.println("Sum of Entered Digit is : "+ getSum);


//        ---------------------------Min And Max Challenge--------------------------
        MinMaxChallenge mxmin = new MinMaxChallenge();
        System.out.println("Please enter Number from we have to get Max and Minimum number: ");
        mxmin.getNumber();
    }
}

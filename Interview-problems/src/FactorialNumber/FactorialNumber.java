package FactorialNumber;

import java.util.Scanner;

public class FactorialNumber {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double findFactorial(int number){
        if(number < 2){
            return  number;
        }
        return number*findFactorial(number-1);
    }

    public void findFactorialNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number to find it's factorial");
        int enteredNumber = scanner.nextInt();
        System.out.println("enteredNumber "+ enteredNumber);
        setNumber(enteredNumber);
        double factorialOfNumber = findFactorial(enteredNumber);
        System.out.println("Factorial of entered number : "+ getNumber()+" is "+factorialOfNumber);
    }
}

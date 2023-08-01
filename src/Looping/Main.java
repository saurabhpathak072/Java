package Looping;

import static Looping.Account.calculateInterestRate;
import static Looping.PalindromeNumberCheck.isPalindromeNumber;
import static Looping.PrimeNumber.isPrimecheck;
import static Looping.PrimeNumber.primeNumbercount;
import static Looping.SharedDigits.hasSharedDigit;
import static Looping.Sum3And5Challenge.sum3And5;
import static Looping.SumDigitChallenge.sumOfdigits;
import static Looping.WhileLoopChanllenge.printEvenNumber;

public class Main {
    public static void main(String[] args) {

        System.out.println("-----------For Loop----------");
        for (double rate = 2.0;rate <= 10; rate++){
            System.out.println("1000 at "+rate+"% interest = "+calculateInterestRate(1000.00d,rate));
        }

        for (double rate= 7.5; rate <= 10; rate +=0.25){
            double interestRate = calculateInterestRate(1000.00d,rate);
            if(interestRate == 80.0)
                break;
            System.out.println("$ 1000 at "+rate+"% interest = $ "+interestRate);
        }

        System.out.println("7 is "+(isPrimecheck(7) ? "":"Not")+ " a prime number.");
        System.out.println("1 is "+(isPrimecheck(1) ? "":"Not")+ " a prime number.");
        System.out.println("3 is "+(isPrimecheck(3) ? "":"Not ")+ "a prime number.");

        System.out.println("Prime Number count upto 100 is : "+primeNumbercount(100));
        System.out.println("Prime Number count upto 100 is : "+primeNumbercount(50));

        sum3And5();
        printEvenNumber(5, 15);

        System.out.println("Sum of all digits in 1234 : "+ sumOfdigits(1234));
        System.out.println("Sum of all digits in 15 : "+ sumOfdigits(15));

        System.out.println("Sum of all digits in 15 : "+ sumOfdigits(5));

        System.out.println("121 is "+(isPalindromeNumber(121)? "" :"Not a ")+"Palindrome number.");

        System.out.println(" hasSharedDigit(9, 9) : "+hasSharedDigit(125, 44));

    }
}

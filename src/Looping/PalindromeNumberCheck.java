package Looping;

public class PalindromeNumberCheck {
    public static boolean isPalindromeNumber(int number){
        int original = number;
        int reverse = 0;
        while (number !=0 ){
            int lastDigit = number%10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }

        return original == reverse;
    }
}

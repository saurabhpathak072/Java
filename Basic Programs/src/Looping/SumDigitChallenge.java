package Looping;

public class SumDigitChallenge {

    public static int sumOfdigits(int number){
        int sum =0;
        if(number < 0)
            return -1;
        while (number > 9){
            sum += (number % 10);
            number = number/10;
        }
        sum += number;
        return sum;
    }
}

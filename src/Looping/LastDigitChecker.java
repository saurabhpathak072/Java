package Looping;

public class LastDigitChecker {

        // write your code here
        public static boolean hasSameLastDigit(int a, int b, int c){


            int lastDigitOfA=a%10 ,lastDigitOfB=b%10, lastDigitOfC=c%10;

            if((isValid(a) && isValid(b) && isValid(c)) && (lastDigitOfA == lastDigitOfB || lastDigitOfC == lastDigitOfB || lastDigitOfA == lastDigitOfC) )
                return true;

            return false;
        }

        public static boolean isValid(int number){
            if(number < 10 || number >1000)
                return false;

            return true;
        }

}

package Looping;

public class SharedDigits {

        // write your code here
        public static boolean hasSharedDigit(int num1, int num2){
            boolean result = false;
//            if(num1 < 10 || num2 < 10 || num1>99 || num2> 99 )
//                return false;

            while(num1>0){
                int digit1 = num1 % 10;
                num1 /= 10;
                int number2 = num2;
                while(number2>0){
                    int digit2 = number2 % 10;
                    if(digit1 ==  digit2)
                        result = true;
                    number2 /= 10;
                }
            }

            return result;
        }

}

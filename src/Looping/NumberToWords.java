package Looping;

public class NumberToWords {

    public static void numberToString(int number){
        System.out.println("Count : "+getDigitCount(number));
        int count = getDigitCount(number);
        System.out.println("Reverse : "+getReverse(number));
        int reverse = getReverse(number);
        while (count > 0){
            int lastDigit = reverse % 10;
            reverse /= 10;
            count--;
            System.out.println(getNumberToWords(lastDigit));
        }

    }
    public static int getReverse(int number){
        int reverse = 0;
        int multiplier = number<0 ? -1 : 1;
        boolean isNegative =  number<0 ? true : false;
        while (isNegative ? number<0:number>0){
            int lastDigit = number%10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }

        return reverse;
    }
    public static String getNumberToWords(int number){
       return switch (number){
           case 0->"Zero";
           case 1->"One";
           case 2->"Two";
           case 3->"Three";
           case 4->"Four";
           case 5->"Five";
           case 6->"Six";
           case 7->"Seven";
           case 8->"Eight";
           case 9->"Nine";
           default -> "";
       };
    }

    public static int getDigitCount(int number){
        if(number == 0){
            return 1;
        } else if (number < 0) {
            return -1;
        }
        int count = 0;
        while (number > 0){
            count++;
            number /=10;
        }
        return count;
    }

}



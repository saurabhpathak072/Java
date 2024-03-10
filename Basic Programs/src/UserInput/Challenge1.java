package UserInput;

import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

        // Write your code here
        public static void inputThenPrintSumAndAverage(){
            int sum =0, avg =0, number,counter=0 ;
            boolean isValid = true;

            Scanner sc = new Scanner(System.in);

            while(isValid){
                try {
                    number  = Integer.parseInt( sc.nextLine());
                    sum +=number;
                    ++counter;
                    avg=(int)Math.round(((double) sum/counter));
                } catch(Exception e) {
                    break;
                }
            }

            System.out.println("SUM = "+sum+" AVG = "+avg);

        }

}

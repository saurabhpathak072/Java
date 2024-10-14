package FibonacciSeries;

import java.util.Arrays;
import java.util.Scanner;

public class FibonaciiSeries {
    private int lengthOfFibonacciSeries;

    public int getLengthOfFibonacciSeries() {
        return lengthOfFibonacciSeries;
    }

    public void setLengthOfFibonacciSeries(int lengthOfFibonacciSeries) {
        this.lengthOfFibonacciSeries = lengthOfFibonacciSeries;
    }

    private int generateFibonaciiNumber(int num){
        if(num<2)
            return num;
        return generateFibonaciiNumber(num-2)+generateFibonaciiNumber(num-1);
    }

    public void generateFibonaciiSeries(int length){
        int[] fibonaciiSeries = new int[length];
        for (int i = 0; i < length; i++) {
            fibonaciiSeries[i] =generateFibonaciiNumber(i);
        }
        System.out.println(Arrays.toString(fibonaciiSeries) );
    }

    public void findFibonaciiSeries(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number for fibonacii series");
        int length = scanner.nextInt();
        setLengthOfFibonacciSeries(length);
        generateFibonaciiSeries(length);
    }
}

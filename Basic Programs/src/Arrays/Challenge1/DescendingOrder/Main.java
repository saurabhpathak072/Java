package Arrays.Challenge1.DescendingOrder;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("------getInteger------");
        int[] myIntArray = getInteger(5);

        System.out.println("------Sort Array-------");
        int[] sortedIntArray = sortIntegers(myIntArray);

        System.out.println("-----Print Array-------");
        printArray(sortedIntArray);
    }

    public static int[] getInteger(int number){
        Scanner sc = new Scanner(System.in);
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            System.out.println("Enter Value #"+i);
            values[i] = sc.nextInt();
        }
        sc.close();
        return values;
    }

    public static int[] sortIntegers(int[] myArray){
        int[] sortedArray = Arrays.copyOf(myArray,myArray.length );
        int temp; boolean sorted = false;
        while (!sorted){
            sorted = true;
            for (int i = 0; i < sortedArray.length -1; i++) {
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    sorted = false;
                }
            }
        }
        // Integer[] boxedNumbers = Arrays.stream(myArray).boxed().toArray(Integer[]::new);

        // Sorting in descending order
//        Arrays.sort(myArray);
        return  sortedArray;
    }

    public static void printArray(int[] myArray){
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Value of element #"+ i + " = "+myArray[i]);
        }
    }
}

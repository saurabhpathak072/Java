package Arrays.ArrayMethods;

import Arrays.Random.RandomArray;

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        int[] firstArray = RandomArray.generateRandomArray(10);
        System.out.println("Sort Array");
        System.out.println("-".repeat(50));
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));
        System.out.println("-".repeat(50));

        System.out.println();

        System.out.println("Fill Array");
        System.out.println("-".repeat(50));
        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray,5);
        System.out.println(Arrays.toString(secondArray));
        System.out.println("-".repeat(50));

        System.out.println();

        System.out.println("Copy Array");
        System.out.println("-".repeat(50));
        int[] thirdArray = RandomArray.generateRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));
        int[] forthArray = Arrays.copyOf(thirdArray,thirdArray.length);
        System.out.println(Arrays.toString(forthArray));
        System.out.println();
        System.out.println("=>Sort on Copy Array");
        Arrays.sort(forthArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(forthArray));        // copy value for primitive and reference from non-primitive type
        System.out.println();
        System.out.println("=> Small Array copy");
        System.out.println(Arrays.toString(thirdArray));
        int[] smallArray = Arrays.copyOf(thirdArray,5);
        System.out.println(Arrays.toString(smallArray));
        System.out.println();
        System.out.println("=> Large Array copy");
        System.out.println(Arrays.toString(thirdArray));
        int[] largeArray = Arrays.copyOf(thirdArray,15);
        System.out.println(Arrays.toString(largeArray));
        System.out.println("-".repeat(50));
        System.out.println();
        System.out.println("Search in Array");
        System.out.println("-".repeat(50));
        String[] sTring = {"Mark","dhoni","sachin","dravid"};
        Arrays.sort(sTring);
        // Array should be sorted and has unique element in array
        // if there is no unique element in array use linear search
        int foundAt = Arrays.binarySearch(sTring,"Mark");
        if(foundAt != -1){
            System.out.println("Mark is Present in Array");
        } else {
            System.out.println("Mark is not found in Array");
        }
        System.out.println("-".repeat(50));

        System.out.println();

        
    }
}

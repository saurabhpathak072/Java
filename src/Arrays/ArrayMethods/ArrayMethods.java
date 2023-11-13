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
    }
}

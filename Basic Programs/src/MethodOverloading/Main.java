package MethodOverloading;

import static MethodOverloading.ConertToHours.convertToTimeString;

public class Main {
    final static double INCHES_TO_CENTIMETER = 2.54d;
    final static int FEET_TO_INCHES = 12;
    public static double convertToCentimeter(int heightInInches){
        return heightInInches * INCHES_TO_CENTIMETER;
    }
    public static double convertToCentimeter(int feet, int inches){
        int feetToInches = feet * FEET_TO_INCHES;
        int totalInches = feetToInches + inches;
        return convertToCentimeter(totalInches);
    }
    public static void main(String[] args) {
        System.out.println("65 Inches = "+ convertToCentimeter(65) + " cm");
        System.out.println("5ft 6 Inches = "+ convertToCentimeter(5, 6) + " cm");
        System.out.println("3660 s = "+convertToTimeString(-3661));
        System.out.println("118 minutes 135 s = "+convertToTimeString(120, 240));


    }
}

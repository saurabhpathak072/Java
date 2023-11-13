package Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];     // Array is Not resizable
        myIntArray[5] = 50;
        System.out.println(myIntArray[5]);
        double[] mydoubleArray = new double[10];
        mydoubleArray[2] = 3.5;
        System.out.println(mydoubleArray[2]);

        int[] firstten = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("first = "+ firstten[0]);
        int arrayLength = firstten.length;
        System.out.println("Lenght of array = "+arrayLength);
        System.out.println("last = "+firstten[arrayLength - 1]);

        int[] newArray;
        newArray = new int[]{5,4,3,2,1};
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}

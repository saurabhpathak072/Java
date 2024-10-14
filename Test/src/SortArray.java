import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {55, 33,99,44,11, 65, 32,1,5};

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length -1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

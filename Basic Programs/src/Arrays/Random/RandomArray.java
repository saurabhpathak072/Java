package Arrays.Random;

import java.util.Random;

public class RandomArray {
    public static int[] generateRandomArray(int len){
Random random = new Random();
int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}



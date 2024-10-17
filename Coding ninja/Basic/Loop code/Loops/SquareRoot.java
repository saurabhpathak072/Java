package Loops;
import java.util.*;

public class SquareRoot {

    public static int findSqrt(int n){
        if(n<2){
            return n;
        }

        int high = n;
        int low = 0;
        int ans = 0;

        while (low <= high) {
            int mid = (low + high)/2;

            long midSquared = mid * mid;

            if(midSquared == n){
                return mid;
            }else if(midSquared<n){
                ans = mid;
                low = mid+1;
            }else{
                high = mid - 1;
            }
            
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        
        System.out.println(findSqrt(num));
        sc.close();
    }
}

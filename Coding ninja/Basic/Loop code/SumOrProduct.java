import java.util.Scanner;
public class SumOrProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number : ");
        int num = sc.nextInt();
        System.out.println("Choice");
        int choice = sc.nextInt();

        int result = choice ==1 ? 0 : 1;
        
        for (int i = 1; i <= num; i++) {
            if(choice == 1){
                result += i;
            }else if(choice == 2){
                result *= i;
            }else{
                result = -1;
            }
        }
        System.out.println("result "+ result);
        sc.close();
    }
}

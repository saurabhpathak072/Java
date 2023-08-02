package Looping;

public class PrimeNumber {
    public static boolean isPrimecheck(int number){
        if(number <= 2){
            return number == 2;
        }
        for(int i =2; i<= number/2; i++){
            if(number%i == 0)
                return false;
        }
        return true;
    }

    public static int primeNumbercount(int number){
        int counter = 0;
        for(int i = 0; i< number; i++){
            if(isPrimecheck(i)){
                System.out.println(i);
                ++counter;
            }
            if(counter == 5)
                break;
        }
        return counter;
    }
}

package Looping;

public class Sum3And5Challenge {
    public static void sum3And5(){
        int countOfMatches =0 ;
        int sumOfMatches = 0;
        for (int i =0; i<1000; i++){
            if((i%3)==0 && (i%5==0)){
                countOfMatches++;
                sumOfMatches += i;
                System.out.println("Found a match  = "+ i);
            }
            if(countOfMatches == 5)
                break;
        }
        System.out.println("Sum = "+ sumOfMatches);

    }

}

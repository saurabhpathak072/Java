package Looping;

public class WhileLoopChanllenge {
    public static boolean isEvenNumber(int number){
        if(number % 2== 0)
            return  true;
        return false;
    }
    public  static  void printEvenNumber(int start, int end){
        int i = start;
        while (i<=end){
            if(isEvenNumber(i)){
                System.out.println(i);
            }
            i++;
        }
    }
}

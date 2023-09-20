package UserInput;

public class FlourPackChallenge {
    // write your code here
    public static boolean canPack (int bigCount, int smallCount, int goal){
        int totalKilos = (5 * bigCount) + smallCount;
        int count =0;
        int temp = 0;

        if (totalKilos < goal){                     //Checks if the total number of Kilos is sufficient or not.
            return false;
        }
        else if (totalKilos == goal){              //This case will always be true.
            return true;
        }
        else{                                      //If the total number of kilos is greater than our goal.(Packaging problem)
            for(int i=0;i<goal;i++){               //For loop that gets the largest number that is divisible by 5 in the number 'goal'.
                temp = goal - i;
                if (temp % 5 == 0){
                    break;
                }
            }
            System.out.println("Temp : "+ temp);
            if (bigCount>= temp/5) {               //If the number of big bags is bigger than the biggest number divisible by 5
                goal -= temp;
                if (smallCount >= goal) {          //Compares the remaining kilos with the small bags
                    return true;
                }
                return false;
            }
            else{                                   //If the number of big bags is smaller than the biggest number divisible by 5
                goal -= (temp-bigCount*5);
                if (smallCount >= goal) {
                    return true;
                }
                return false;
            }
        }
    }

    public static void calculatePack(int bigCount, int smallCount, int goal){
        int totalSum = (bigCount*5) + smallCount;
        int temp = 0;
        boolean canPackfull = false;
        if(totalSum < goal)
             canPackfull = false;
        else if (totalSum == goal) {
            canPackfull = true;
        }
        else {
            for (int i = 0; i < goal; i++) {
                temp = goal -i;
                if(temp%5==0)
                    break;
            }
            System.out.println("temp : "+temp);
            if(bigCount>=temp/5){
                goal -= temp;
                if(smallCount>=goal){
                    canPackfull = true;
                }
                canPackfull = false;
            }else {
                goal -= (temp - bigCount*5);
                if(smallCount<goal){
                    canPackfull =  true;
                }
                canPackfull = false;
            }
        }
        System.out.println(canPackfull ? "Yes we can Pack!" : "No We Cannot Pack.");
    }
}
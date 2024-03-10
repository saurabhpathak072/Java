package ControlFlow;

import static ControlFlow.NatoKeyword.getNatoKeyword;
import static ControlFlow.NumberInWord.printNumberInWord;
import static ControlFlow.SwitchStatement.getQuaterInfo;
import static ControlFlow.WeekDays.printWeekDays;

public class Main {
    public static void main(String[] args) {
        int value =1;
        int result = 0;
        System.out.println("----------Traditional Switch Statement -------------------");
        switch (value){
            case 1:
                result = value + 23;
                System.out.println("Value is 1. "+result);
                break;
            case 2:
                result = value + 23;
                System.out.println("Value is 2. "+result);
                break;
            default:
                System.out.println("Value is neither 1 or 2.");
        }
        System.out.println("----------Enhanced Switch Statement -------------------");
        System.out.println(getQuaterInfo("January"));
        System.out.println("d => "+ getNatoKeyword('d'));
        System.out.println("---------Print Work days-----------");
        System.out.println("Week of the day 1 => "+ printWeekDays(1));
        System.out.println("Week of the day 2 => "+ printWeekDays(2));
        System.out.println("Week of the day 3 => "+ printWeekDays(3));
        System.out.println("Week of the day 4 => "+ printWeekDays(4));
        System.out.println("Week of the day 5 => "+ printWeekDays(5));
        System.out.println("Week of the day 6 => "+ printWeekDays(6));
        System.out.println("Week of the day 7 => "+ printWeekDays(7));
        System.out.println("Week of the day 0 => "+ printWeekDays(0));

        System.out.println("2 -> "+ printNumberInWord(2));


    }
}

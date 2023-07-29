package MethodOverloading;

public class ConertToHours {
    int sec, min, hours;
    public static String convertToTimeString( int second){
        if(second < 0){
            return "Invalid Second, Second Should be positive";
        }
        int minute = second / 60;
        int remainingSecond = second % 60;
        return convertToTimeString(minute,remainingSecond);
//        return minute+" minutes "+remainingSecond+" s";
    }


    public static String convertToTimeString(int minutes, int second){
        int hours = minutes/60;
        int remainingMinutes = minutes%60;
        int seconds = second/60;
        int remainingSecond= second%60;

        String result="";
//        result = (hours + minutes) + " hh "+ (remainingMinutes + seconds) + " minutes " + remainingSecond + " s ";
            result = hours + " h "+(remainingMinutes + seconds)+" minutes "+remainingSecond+" s";
        return result;
    }
}

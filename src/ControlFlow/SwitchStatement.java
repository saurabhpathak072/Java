package ControlFlow;



public class SwitchStatement {
    public static String getQuaterInfo(String month){
        switch (month.toLowerCase()) {
            case "january", "february", "march" -> {
                String result = "Start of the  ";
                String january = "january";
                if (month.toLowerCase() == january.toLowerCase()) {
                    return "Happy New Year " + month + " " + result;
                }
                return "1st Quarter "+ month.toLowerCase()+" : "+("january".toLowerCase());
            }
            case "april", "may", "june" -> {
                return "2nd Quarter";
            }
            case "july", "august", "september" -> {
                return "3rd Quarter";
            }
            case "october", "november", "december" -> {
                return "4th Quarter";
            }
            default -> {
                return "Invalid month in quarter";
            }
        }
    }
}

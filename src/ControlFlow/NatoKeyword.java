package ControlFlow;

public class NatoKeyword {
    public static String getNatoKeyword(char keyword){
        switch (keyword){
            case 'a','A' -> {
                return "Able";
            }
            case 'b','B' -> {
                String bible = "Bible";
                return bible;
            }
            case 'c', 'C'->{
                return "Cat";
            }
            case 'd','D'->{
                return "Dog";
            }
            default -> {
                return "Not a Valid Keyword";
            }
        }
    }
}

package OOPS.StringsMethod;

//We can split String's Method up into three categories
//    1. String Inspection Method
//    => length(), isEmpty(), isBlank(),charAt(), indexOf(), etc.
//    2. Method for comparing String values
//    => return boolean values, contentEquals(), equals(), equalsIgnoreCase(), etc.
//    3. String Manipulation Methods
//    => Transform one String to another

public class StringMethods {
    String birthDate;

//    String Inspection Methods
    public static void printInformation(String string){
        int length= string.length();
        System.out.printf("Length = %d %n",length);

        if (string.isEmpty()){
            System.out.println("String is Empty");
            return;
        }

        if (string.isBlank()){
            System.out.println("String is Blank");
        }
        System.out.printf("First character = %c %n",string.charAt(0));
        System.out.printf("last character = %c %n", string.charAt(length-1));
    }

    public StringMethods() {
        birthDate = "25/11/1982";
    }
    public void getStringMethods(){
        int startIndex = birthDate.indexOf("1982");
        System.out.println("String Index = "+startIndex);
        System.out.println("Birth Year = "+birthDate.substring(startIndex));
        System.out.println("Month = "+birthDate.substring(3,5));
    }

    public void getJoinMethods(){
        String newDate = String.join("/","25","11","1982");
        System.out.println("newdate = "+newDate);
        System.out.println(newDate.replace('/','-'));
        System.out.println(newDate.replace("2","00"));
        System.out.println(newDate.replaceFirst("/","-"));
        System.out.println(newDate.replaceAll("/","---"));
    }

    public void repeatAndIntend(String str, int indent){
        System.out.println(str.repeat(3).indent(indent));
        System.out.println("-".repeat(20));

    }
}



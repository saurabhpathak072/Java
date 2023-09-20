package OOPS.ReacordType;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            // Record type cannot be altered, so there is no set method
            EMPStudent estud = new EMPStudent(switch (i){
                case 0->"Raju";
                case 1->"Ram";
                case 2->"Raghav";
                default -> "Anonymous";
            },25,"Science");
            System.out.println(estud);
            System.out.println("Name : "+estud.name());
        }
    }
}

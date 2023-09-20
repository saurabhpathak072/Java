package OOPS.StringsMethod;

public class Main {
    public static void main(String[] args) {
        String bulletIt = "Print Bulleted list:\n"+
                "\t\u2022first point\n"+
                "\t\t\u2022second point";
        System.out.println(bulletIt);

        String textBlock = """
               Print Bulleted list:
                    \u2022first point
                        \u2022second point
                """;
        System.out.println(textBlock);

        int age=35;
//        System.out.printf("Your age is %d\n",age);
        System.out.printf("Your age is %d%n",age);  // %n => The result is the platform-specific line separator

        int yearOfBirth = 2023 - age;
        System.out.printf("Age = %d, Birth Year = %d%n",age,yearOfBirth);

        System.out.printf("Your Age in float is %.2f%n",(float) age);

        for (int i = 1; i < 1000000; i*=10) {
            System.out.printf("Printing %7d %n",i);
        }

        String formattedString = String.format("Your age is %d%n",age);
        System.out.printf(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.printf(formattedString);
    }
}

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

        formattedString = "Your age is %d %n".formatted(age);
        System.out.printf(formattedString);

//        ----------------String Inspection Methods Stats --------------------

        StringMethods.printInformation("Hello World");
        StringMethods.printInformation("");
        StringMethods.printInformation("\t   \t\n");

        String helloWorld = "Hello World";
        System.out.printf("index of r = %d%n",helloWorld.indexOf('r'));
        System.out.printf("index of World = %d%n",helloWorld.toLowerCase().indexOf("World".toLowerCase()));
        System.out.println();

        System.out.printf("index of l = %d%n",helloWorld.indexOf('l'));
        System.out.printf("index of l = %d%n",helloWorld.lastIndexOf('l'));
        System.out.println();

        System.out.printf("index of l = %d%n",helloWorld.indexOf('l',3));
        System.out.printf("index of l = %d%n",helloWorld.lastIndexOf('l',8));
        System.out.println();
//        ----------------String Inspection Methods Ends --------------------

//        ---------------- String Comparison Methods Starts ---------------------
        String helloWorldLower = helloWorld.toLowerCase();
        if(helloWorldLower.equals(helloWorld)){
            System.out.println("Value Match Exactly");
        }
        if(helloWorldLower.equalsIgnoreCase(helloWorld)){
            System.out.println("Value Match Ignoring case");
        }

        if(helloWorld.startsWith("Hello")){
            System.out.println("String starts with Hello");
        }

        if(helloWorld.endsWith("World")){
            System.out.println("String ends with World");
        }

        if(helloWorld.contains("Hello")){
            System.out.println("String Contains Hello");
        }
        if(helloWorldLower.contentEquals("hello world")){
            System.out.println("Value Match Exactly");
        }
        System.out.println();
//        ---------------- String Comparison Methods Ends ---------------------

//        ------------------- String Manipulation Methods Starts --------------------
        StringMethods strMethods = new StringMethods();
//        substring()
        strMethods.getStringMethods();
        System.out.println();

//        join() method
        strMethods.getJoinMethods();

//        Repeat and intend methods
        strMethods.repeatAndIntend("ABS\n",8);
        strMethods.repeatAndIntend("     ABS\n",-2);
//        ------------------- String Manipulation Methods Ends ----------------------


    }


}

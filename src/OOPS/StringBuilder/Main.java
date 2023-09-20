package OOPS.StringBuilder;

//StringBuilder is a mutable class that let us change its text value

public class Main {
    public static void main(String[] args) {
        String helloWorld = "Hello"+" World!";
        helloWorld.concat(" and Good Bye!!");

        StringBuilder helloWorldBuilder = new StringBuilder("Hello"+" World");
        helloWorldBuilder.append(" and Good Bye!");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        StringBuilder emptyBuilder = new StringBuilder();
        emptyBuilder.append("a".repeat(17));
        StringBuilder emptyBuilder32 = new StringBuilder(32);
        emptyBuilder32.append("a".repeat(17));

        printInformation(emptyBuilder);
        printInformation(emptyBuilder32);

        StringBuilder builderplus = new StringBuilder("Hello"+" World");
        builderplus.append(" and Good Bye!");

        builderplus.deleteCharAt(16).insert(16,'g');
        System.out.println(builderplus);

        builderplus.replace(16,17,"G");
        System.out.println(builderplus);

        builderplus.reverse().setLength(7);
        System.out.println(builderplus);
    }


    public static void printInformation(String string){
        System.out.println("String = "+string);
        System.out.println("length = "+string.length());
    }

    public static void printInformation(StringBuilder builder){
        System.out.println("String = "+builder);
        System.out.println("length = "+builder.length());
        System.out.println("Capacity = "+builder.capacity());
    }
}

public class Main {
    public static void main(String[] args) {
        int myVariable = 15;   // myVariable =15 is an expression. whole it is a java Statement.

        myVariable++; // this is a java statements.
        myVariable--; // this is a java statements.

        System.out.println("This is a test");
        System.out.println("This is" + " another " + "still more.");
        int anotherVariable = 50;
        anotherVariable--;
        System.out.println("myVariable = " + myVariable);
        if(myVariable == 0){
            System.out.println("It's now zero");
        }
    }
}

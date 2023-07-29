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
        Game g1 = new Game(true,800,5, 100);
        Game g2 = new Game(true,10000,8, 200);
        System.out.println("Your final score was "+ g1.calculateFinalScore());
        System.out.println("Your final score was "+ g2.calculateFinalScore());
        g1.calculateHighScorePosition(2500);
        g1.displayHighScorePosition("Tim2");
    }
}

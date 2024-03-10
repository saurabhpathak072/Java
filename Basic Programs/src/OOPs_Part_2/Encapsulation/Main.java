package OOPs_Part_2.Encapsulation;

public class Main {
    public static void main(String[] args) {


//      ----------------- Without Encapsulation ---------------
        System.out.println("----------------- Without Encapsulation ---------------");
        Player player = new Player();
        player.name1 = "Tim";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        player.health = 200;

        player.loseHealth(11);
        System.out.println("Remaining health = " + player.healthRemaining());
        System.out.println();
//      ------------------- With Encapsulation ------------------
        System.out.println("----------------- With Encapsulation ---------------");
        EnhancedPlayer tim = new EnhancedPlayer("Tim",300,"Sword");
        System.out.println("Initial = "+tim.healthRemaining());


    }
}

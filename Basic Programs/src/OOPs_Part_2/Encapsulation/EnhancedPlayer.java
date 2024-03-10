package OOPs_Part_2.Encapsulation;

public class EnhancedPlayer {
    private String name1;
    private int health;
    private String weapon;

    public EnhancedPlayer(String name1) {
        this(name1,100,"Sword");
    }

    public EnhancedPlayer(String name1, int health, String weapon) {
        this.name1 = name1;
        if(health <= 0){
            this.health = 1;
        } else if (health > 100) {
            this.health = 100;
        }else {
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        health -=damage;
        if(health <= 0){
            System.out.println("Player knocked out of game.");
        }
    }

    public int healthRemaining(){
        return health;
    }

    public void restoreHealth(int extraHealth){
        health += extraHealth;
        if(health > 100){
            System.out.println("Player Restored to 100%");
            health = 100;
        }
    }
}

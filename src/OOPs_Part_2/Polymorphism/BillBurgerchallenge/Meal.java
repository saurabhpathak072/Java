package OOPs_Part_2.Polymorphism.BillBurgerchallenge;

public class Meal {
    Burger burger;
    Drink drink;
    SideItems sideItems;


}

class Burger {
    private String burgerType;
    private double price;
    private String toppings; // should be restricted to 3

    public Burger(){
        burgerType = "Regular";
    }

    public Burger(String burgerType, double price) {
        this.burgerType = burgerType;
        this.price = price;
    }
}

class Drink {
    private String type;
    private int size;
    private double price;
}

class SideItems{
    private String type;
    private int size;
}

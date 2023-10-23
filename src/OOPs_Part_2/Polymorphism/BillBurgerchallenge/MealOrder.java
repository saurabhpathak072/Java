package OOPs_Part_2.Polymorphism.BillBurgerchallenge;

public class MealOrder {
    private Burger burger;
    private Items drink;
    private Items side;

    public MealOrder(){
        this("regular","coke","fries");
    }

    public MealOrder(String burgerType, String drinkType, String sideType){
        this.burger = new Burger(burgerType,4.0);
        this.drink = new Items("DRINK",drinkType,2.0);
        this.side = new Items("SIDE",sideType,3.5);
    }

    public double getTotalPrice(){
        return burger.getAdjustPrice() + drink.getAdjustPrice() + side.getAdjustPrice();
    }

    public void printItemizedList(){
        burger.printItem();
        drink.printItem();
        side.printItem();
        System.out.println("-".repeat(30));
        Items.printItem("Total Price", getTotalPrice());
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3){
        burger.addToppings(extra1,extra2,extra3);
    }

    public void setDrinksize(String size){
        drink.setSize(size);
    }
}

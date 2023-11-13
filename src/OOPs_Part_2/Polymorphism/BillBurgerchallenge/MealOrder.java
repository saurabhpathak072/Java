package OOPs_Part_2.Polymorphism.BillBurgerchallenge;

public class MealOrder {
    private Burger burger;
    private Items drink;
    private Items side;

    public MealOrder(){
        this("regular","coke","fries");
    }

    public MealOrder(String burgerType, String drinkType, String sideType){
        if(burgerType.equalsIgnoreCase(("deluxe"))){
            this.burger = new DeluxBurger(burgerType,8.5);
        }else {
            this.burger = new Burger(burgerType,4.0);
        }
        this.drink = new Items("DRINK",drinkType,2.0);
        this.side = new Items("SIDE",sideType,3.5);
    }

    public double getTotalPrice(){
        if(burger instanceof DeluxBurger)
            return burger.getAdjustPrice();
        return burger.getAdjustPrice() + drink.getAdjustPrice() + side.getAdjustPrice();
    }

    public void printItemizedList(){

        burger.printItem();
        if(burger instanceof  DeluxBurger){
            Items.printItem(drink.getName(),0);
            Items.printItem((side.getName()),0);
        }else {
            drink.printItem();
            side.printItem();
        }
        System.out.println("-".repeat(30));
        Items.printItem("Total Price", getTotalPrice());
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3){
        burger.addToppings(extra1,extra2,extra3);
    }
    public void addBurgerToppings(String extra1, String extra2, String extra3, String extra4, String extra5){
            if (burger instanceof DeluxBurger db){
                db.addToppings(extra1,extra2,extra3,extra4,extra5);
            }else {
                burger.addToppings(extra1,extra2,extra3);
            }
    }

    public void setDrinksize(String size){
        drink.setSize(size);
    }
}

package OOPs_Part_2.Polymorphism.BillBurgerchallenge;

public class Main {
    public static void main(String[] args) {
//        Items coke = new Items("Drink","Coke",1.5);;
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Items avocado = new Items("Toppings","avocado",1.5);
//        avocado.printItem();

//        Burger burger = new Burger("regular",4.0);
//        burger.addToppings("Bacon","CHEESE","MAYO");
//        burger.printItem();

        MealOrder regularMeal = new MealOrder();
        regularMeal.addBurgerToppings("CHEESE","BACON","MAYO");
        regularMeal.setDrinksize("LARGE");
        regularMeal.printItemizedList();

        MealOrder secondmeal = new MealOrder("Turkey","7-up","chili");
        secondmeal.addBurgerToppings("LETTUCE","CHEESE","MAYO");
        secondmeal.setDrinksize("SMALL");
        secondmeal.printItemizedList();
    }
}

package OOPs_Part_2.Polymorphism.BillBurgerchallenge;

public class Main {
    public static void main(String[] args) {
        Items coke = new Items("Drink","Coke",1.5);;
        coke.printItem();
        coke.setSize("LARGE");
        coke.printItem();

        Items avocado = new Items("Toppings","avocado",1.5);
        avocado.printItem();
    }
}

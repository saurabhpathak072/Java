package OOPs_Part_2.Polymorphism.BillBurgerchallenge;

public class DeluxBurger extends Burger {
    Items delux1;
    Items delux2;

    public DeluxBurger(String name, double price) {
        super(name, price);
    }

    public void addToppings(String extra1, String extra2, String extra3, String extra4, String extra5) {

        super.addToppings(extra1, extra2, extra3);
        this.delux1 = new Items("TOPPING",extra4,0);
        this.delux2 = new Items("TOPPING",extra5,0);
    }

    @Override
    public void printItemizedList() {
        super.printItemizedList();
        if(delux1 != null)
        {
            delux1.printItem();
        }
        if(delux2 != null)
        {
            delux2.printItem();
        }
    }

    @Override
    public double getExtraPrice(String toppingName) {
        return 0;
    }
}

package OOPs_Part_2.Polymorphism.BillBurgerchallenge;

public class Burger extends Items{
    private Items extra1;
    private Items extra2;
    private Items extra3;

    public Burger( String name, double price) {
        this("Burger", name, price);
    }
    public Burger(String type, String name, double price) {
        super(type, name, price);
    }

    @Override
    public String getName() {
        return super.getName() + " BURGER";
    }

    @Override
    public double getAdjustPrice() {
        return getBasePrice() +
                ((extra1 == null) ? 0 : extra1.getAdjustPrice()) +
                ((extra2 == null) ? 0 : extra2.getAdjustPrice()) +
                ((extra3 == null) ? 0 : extra3.getAdjustPrice());
    }

    public double getExtraPrice(String toppingName){
        return switch (toppingName.toUpperCase()){
            case "AVOCADO", "CHEESE" -> 1.0;
            case "BACON", "HAM", "SALAMI" -> 1.5;
            default -> 0.0;
        };
    }

    public void addToppings(String extra1, String extra2, String extra3){
        this.extra1 = new Items("TOPPING",extra1,getExtraPrice(extra1));
        this.extra2 = new Items("TOPPING",extra2,getExtraPrice(extra2));
        this.extra3 = new Items("TOPPING",extra3,getExtraPrice(extra3));
    }

    public void printItemizedList(){
        printItem("BASE BURGER",getBasePrice());
        if(extra1 != null){
            extra1.printItem();
        }
        if(extra2 != null){
            extra2.printItem();
        }
        if(extra3 != null){
            extra3.printItem();
        }
    }

    @Override
    public void printItem() {
        printItemizedList();
        System.out.println("-".repeat(30));
        super.printItem();
    }
}

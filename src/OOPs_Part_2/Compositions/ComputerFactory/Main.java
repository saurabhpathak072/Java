package OOPs_Part_2.Compositions.ComputerFactory;

public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208","Dell","240");
        Monitor theMonitor = new Monitor("27inch Beast","Acer", 24,"2540 x 1440");
        Motherboard theMotherboard = new Motherboard("BJ-200","Asus",4,6,"v2.44");

        PersonalComputer thePC = new PersonalComputer("2208","Dell",theCase,theMonitor,theMotherboard);

        thePC.powerUp();
//        thePC.getMonitor().drawPixelAt(10,10,"red");
//        thePC.getMotherboard().loadPrograms("Windows OS");
//        thePC.getComputerCase().pressPowerButton();
    }
}

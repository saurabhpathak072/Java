package OOPS.Inheritance.Animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "Slow");

        Dog dog=new Dog();
        doAnimalStuff(dog,"Fast");

        Dog yorkie = new Dog("Yorkie",15);
        doAnimalStuff(yorkie,"Fast");

        Dog retriver = new Dog("Labrador Retriver",65,"Floppy","Swimmer");
        doAnimalStuff(retriver,"Slow");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeVoice();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _ _ _");
    }
}

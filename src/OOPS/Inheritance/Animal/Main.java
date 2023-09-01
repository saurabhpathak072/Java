package OOPS.Inheritance.Animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "Slow");

        Dog dog=new Dog();
        doAnimalStuff(dog,"Fast");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeVoice();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _ _ _");
    }
}

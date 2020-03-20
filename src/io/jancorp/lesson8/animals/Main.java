package io.jancorp.lesson8.animals;

public class Main {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        Cat cat = new Cat();
        Wolf wolfie = new Wolf();
        mouse.beEaten(wolfie);
    }
}

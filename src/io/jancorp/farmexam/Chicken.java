package io.jancorp.farmexam;

public class Chicken extends FarmAnimal implements CanGive{
    public Chicken(String name, int weight, int speed, int health, int resource) {
        super(name = "Chicken", weight, speed, health, resource);
    }
}

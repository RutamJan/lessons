package io.jancorp.farmexam;

public class Cow extends FarmAnimal implements CanGive, CanBeEaten{
    public Cow(String name, int weight, int speed, int health, int resource) {
        super(name = "Cow", weight, speed, health, resource);
    }
}

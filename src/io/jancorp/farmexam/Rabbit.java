package io.jancorp.farmexam;

public class Rabbit extends FarmAnimal implements CanBeEaten{
    public Rabbit(String name, int weight, int speed, int health, int resource) {
        super(name = "Rabbit", weight, speed, health, resource = 0);
    }
}

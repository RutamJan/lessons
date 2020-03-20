package io.jancorp.lesson8.animals;

public class Wolf implements CanEat{

    @Override
    public void eat(CanBeEaten animal) {
        System.out.println("Сьел " + animal);
    }
}

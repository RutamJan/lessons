package io.jancorp.lesson8.animals;

public class Cat implements CanBeEaten, CanEat {

    @Override
    public void eat(CanBeEaten animal) {
        System.out.println("Сьел " + animal);
    }

    @Override
    public void beEaten(CanEat animal) {
        System.out.println("Сьеден " + animal);
    }
}

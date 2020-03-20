package io.jancorp.lesson8.animals;

public class Mouse  implements CanBeEaten {

    @Override
    public void beEaten(CanEat animal) {
        System.out.println("Сьеден " + animal);
    }
}

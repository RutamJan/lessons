package io.lesson7;

public interface CanRest {
    void rest();

//    метод по умолчанию с реализацией

    default void runFromField() {
        System.out.println("runFromField CanRest");
    }
}

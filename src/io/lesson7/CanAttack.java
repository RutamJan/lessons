package io.lesson7;

//  на основе интерфейса нельзя создать обьект
// до 8-й версии можно только метод без реализации
// void attack()  - без фигурных скобок
public interface CanAttack {
    void attack(BattleUnit enemy);

    default void runFromField() {
        System.out.println("runFromField CanAttack");
    }

}

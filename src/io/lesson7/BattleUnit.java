package io.lesson7;

import org.w3c.dom.ls.LSOutput;

abstract public class BattleUnit extends Unit implements CanAttack{   //наследование
    //  множественное наследование запрещено, только с одного
    //  implements - реализация методов интерфейса
    //  класс заключает контракт на реализацию всех методов интерфейса
    //  разрешена имплементация нескольких интерфейсов
    //  абстрактный класс - нельзя создать обьекты на его основе, у них могут быть методы
    //  с реализацией и без реализации
    //  если класс реализует одинаковые методы 2х интерфейсов, нужно переопределить в классе

    protected int attackScore;

    public BattleUnit(int healthScore, int speed, int attackScore) {
        super(healthScore, speed);  // super - вызов конструктора род класса
        // super.run - вызов обычного метода
        setAttackScore(attackScore);
    }

    public int getAttackScore() {
        return attackScore;
    }

    public void setAttackScore(int attackScore) {
        this.attackScore = attackScore;
    }

    @Override
    public void runFromField() {

    }


//    abstract public void attack(BattleUnit enemy); -
}

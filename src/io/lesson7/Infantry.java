package io.lesson7;

public class Infantry extends BattleUnit {
    private int armour;

    public Infantry(int healthScore, int speed, int attackScore, int armour) {
        super(healthScore, speed, attackScore);
        setArmour(armour);
    }

    public int getArmour() {
        return armour;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }

    @Override
    public void attack(BattleUnit enemy) {
        System.out.println("Пехота пошла!");
    }

    @Override
    public void rest() {
        System.out.println("Пехотинец отдыхает");
    }
}

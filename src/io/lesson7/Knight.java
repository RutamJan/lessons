package io.lesson7;

public class Knight extends BattleUnit {
    private int horseSpeed;

    public Knight(int healthScore, int speed, int attackScore, int horseSpeed) {
        super(healthScore, speed, attackScore);
        setHorseSpeed(horseSpeed);
    }

    public int getHorseSpeed() {
        return horseSpeed;
    }

    public void setHorseSpeed(int horseSpeed) {
        this.horseSpeed = horseSpeed;
    }

    @Override
    public void attack(BattleUnit enemy) {
        System.out.println("Рыцарь атакует!");
    }

    @Override
    public void rest() {
        System.out.println("Рыцарь отдыхает");
    }
}

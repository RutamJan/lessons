package io.jancorp.farmexam;

public class WildAnimal extends Animal {
    protected int power;
    protected int shooCounter = 0;


    public WildAnimal(String name, int weight, int speed, int power) {
        super(name, weight, speed);
        setPower(power);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if (power >= 1) {
            this.power = power;
        }
    }

    public int getShooCounter() {
        return shooCounter;
    }

    public void setShooCounter(int shooCounter) {
        this.shooCounter = shooCounter;
    }
}

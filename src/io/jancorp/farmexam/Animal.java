package io.jancorp.farmexam;

public class Animal {
    protected String name = "Animal";
    protected int weight;
    protected int speed;

    public Animal(String name, int weight, int speed) {
        setName(name);
        setWeight(weight);
        setSpeed(speed);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (null != name && name.length() > 1)   {
            this.name = name;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight >= 1) {
            this.weight = weight;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed >= 1) {
            this.speed = speed;
        }
    }
}

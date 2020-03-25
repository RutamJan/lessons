package io.jancorp.farmexam;

public class FarmAnimal extends Animal{
    protected int health;
    protected int currhealth = health;
    protected int resource;

    protected boolean isOnFarm = true;

    public FarmAnimal(String name, int weight, int speed, int health, int resource) {
        super(name, weight, speed);
        setHealth(health);
        setResource(resource);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health >= 1) {
            this.health = health;
        }
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        if (resource >=1) {
            this.resource = resource;
        }
    }

    public int getCurrhealth() {
        return currhealth;
    }

    public void setCurrhealth(int currhealth) {
        if (currhealth <= health) {
            this.currhealth = currhealth;
        }
    }

    public boolean isOnFarm() {
        return isOnFarm;
    }

    public void setOnFarm(boolean onFarm) {
        isOnFarm = onFarm;
    }

}

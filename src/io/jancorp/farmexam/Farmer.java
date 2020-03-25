package io.jancorp.farmexam;

import java.util.Random;

public class Farmer {
    protected String name = "Farmer";

    protected int capital = 5;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (null != name && name.length() > 1)   {
            this.name = name;
        }
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        if(capital >= 0) {
            this.capital = capital;
        }
    }

    public void gather(FarmAnimal[] farmAnimals)    {
        for (int i = 0; i < farmAnimals.length; i ++)   {
            if (farmAnimals[i] instanceof CanGive){
                capital += farmAnimals[i].resource;
            }
        }
    }

    public void shoo(WildAnimal wildAnimal)  {
//        int rand = new Random().nextInt(wildAnimals.length);
        int chance = new Random().nextInt(5) + 1;
        if (chance == 1)    {
            wildAnimal.shooCounter++;
        }
    }


}

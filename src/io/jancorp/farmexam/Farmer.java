package io.jancorp.farmexam;

import io.jancorp.lesson8.animals.CanBeEaten;

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
        boolean canGather = false;
        for (int i = 0; i < farmAnimals.length; i ++)   {
            if (farmAnimals[i] instanceof CanGive && farmAnimals[i].isOnFarm == true){
                capital += farmAnimals[i].resource;
                canGather = true;
            }
        }
        if (canGather = false)  {
            for (int i = 0; i < farmAnimals.length; i++)    {
                if (farmAnimals[i] instanceof CanBeEaten && farmAnimals[i].isOnFarm == true)  {

                }
            }
        }
    }

    public void eat(FarmAnimal fa)  {
        capital += fa.weight;
        fa.isOnFarm = false;
    }

    public void shoo(WildAnimal wildAnimal)  {
//        int rand = new Random().nextInt(wildAnimals.length);
        int chance = new Random().nextInt(5) + 1;
        if (chance == 1)    {
            wildAnimal.shooCounter++;
        }
    }

    public void feed(FarmAnimal[] farmAnimals)  {
       for (int i = 0; i < farmAnimals.length; i++) {
           if (farmAnimals[i].isOnFarm() == true)   {
               farmAnimals[i].setCurrhealth(farmAnimals[i].currhealth + 1);
               if (farmAnimals[i].currhealth > farmAnimals[i].health)   {
                   farmAnimals[i].setCurrhealth(farmAnimals[i].health);
               }
           }
       }
    }


}

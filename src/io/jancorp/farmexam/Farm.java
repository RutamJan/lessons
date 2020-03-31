package io.jancorp.farmexam;

import io.jancorp.lesson8.school.Professor;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Farm {
    private Farmer farmer;
    private FarmAnimal[] farmAnimals = new FarmAnimal[10];
    private int animalCount;
    private int days;

    private WildAnimal[] wildAnimals = new WildAnimal[3];

    public Farm(Farmer farmer) {
        this.farmer = farmer;
        animalCount = 0;
        days = 0;
//        populate wildAnimals array
        WildAnimal bear = new WildAnimal("Bear", 300, 5, 9);
        wildAnimals[1] = bear;
        WildAnimal wolf = new WildAnimal("Wolf", 60, 7, 4);
        wildAnimals[2] = wolf;
        WildAnimal fox = new WildAnimal("Fox", 15, 6, 2);
        wildAnimals[3] = fox;
    }

    public FarmAnimal[] getFarmAnimals() {
        return farmAnimals;
    }

    public void addAnimal(FarmAnimal animal) {
        if (animal != null)   {
            if (animalCount < farmAnimals.length)  {
                farmAnimals[animalCount++] = animal;
            }   else    {
                System.out.println("Too many animals!");
            }
        }
    }

    public void shooCount() {
        for (int i = 0; i < wildAnimals.length; i++)    {
            if (wildAnimals[i] != null) {
                if (wildAnimals[i].getShooCounter() > 2)    {
                    wildAnimals[i] = null;
                }
            }
        }
    }
    public boolean checkWA()   {
        boolean WA = false;
        for (int i = 0; i < wildAnimals.length; i++)    {
            if (wildAnimals[i] != null) {
                WA = true;
            }
        }
        return WA;
    }
    public WildAnimal getRandomWA()   {
        Random random = new Random();
        WildAnimal wa;
        while(true) {
            wa = wildAnimals[random.nextInt(3)];
            if (wa != null){
                return wa;
            }
        }
    }
    public boolean checkFA()    {
        boolean FA = false;
        for (int i = 0; i < farmAnimals.length; i++)    {
            if (farmAnimals[i].isOnFarm = true) {
                FA = true;
            }
        }
        return FA;
    }
    public FarmAnimal getRandomFA() {
        Random random = new Random();
        FarmAnimal fa;
        while(true) {
            fa = farmAnimals[random.nextInt(3)];
            if (fa.isOnFarm != false){
                return fa;
            }
        }
    }

    public void attack(WildAnimal wa, FarmAnimal fa)    {
        if (wa.getSpeed() >= fa.getSpeed())  {
            fa.setCurrhealth(fa.getCurrhealth() - wa.getPower());
        }
    }
    public void dayOnAFarm()    {
        days++;
        farmer.capital -= 2;
//        if (checkWA() == false) {
//            System.out.println("Farmer won!");
//            return;
//        }
//        if (checkFA() == false) {
//            System.out.println("Farmer lost!");
//            return;
//        }
        FarmAnimal fa = getRandomFA();
        WildAnimal wa = getRandomWA();
        attack(wa, fa);
        farmer.shoo(wa);
        farmer.feed(farmAnimals);
        farmer.gather(farmAnimals);

    }


}

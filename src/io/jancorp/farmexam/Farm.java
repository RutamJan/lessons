package io.jancorp.farmexam;

import io.jancorp.lesson8.school.Professor;

public class Farm {
    private Farmer farmer;
    private FarmAnimal[] farmAnimals = new FarmAnimal[10];
    private int animalCount;

    private WildAnimal[] wildAnimals = new WildAnimal[3];

    public Farm(Farmer farmer) {
        this.farmer = farmer;
        animalCount = 0;
//        populate wildAnimals array
        WildAnimal bear = new WildAnimal("Bear",);
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


}

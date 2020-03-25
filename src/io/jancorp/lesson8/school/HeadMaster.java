package io.jancorp.lesson8.school;

public class HeadMaster extends Person{

    public HeadMaster(String name, int age) {
        super(name, age);
    }

    public void startStudies() {
        System.out.println("Начало занятий");
    }

    public void endStudies() {
        System.out.println("Конец занятий");
    }


}

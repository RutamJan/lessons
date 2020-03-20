package io.jancorp.lesson8.school;

abstract class Person {
    protected String name = "Person";

    protected int age = 0;

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }
}

package io.jancorp.lesson8.school;

public class Person {
    protected String name = "Person";

    protected int age = 0;

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() { return name; }

    public void setName(String name) {
        if (null != name && name.length() > 1)   {
            this.name = name; }
        }

    public int getAge() { return age; }

    public void setAge(int age) {
        if (age > 5)    {
            this.age = age;
        }
    }
}

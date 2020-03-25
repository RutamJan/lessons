package io.jancorp.lesson8.school;

public class Professor extends Person implements Teach{
    private String teachSubject;


    public Professor(String name, int age, String teachSubject) {
        super(name, age);
        setTeachSubject(teachSubject);
    }

    public String getTeachSubject() {
            return this.teachSubject;
    }

    public void setTeachSubject(String teachSubject) {
        if (null != teachSubject) {
            this.teachSubject = teachSubject;
        }
    }

    @Override
    public void Teach(Study study) {
        study.Study();
    }

    @Override
    public void setAge(int age) {
        if (age > 25)   {
            this.age = age;
        }
    }
}

package io.jancorp.lesson8.school;

public class Student extends Person implements Study{

    private String studySubject;
    private int level = 0;

    public Student(String name, int age, String studySubject) {
        super(name, age);
        setStudySubject(studySubject);
    }

    public String getStudySubject() {
        return studySubject;
    }

    public void setStudySubject(String studySubject) {
        if (null != studySubject) {
            this.studySubject = studySubject;
        }
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public void Study() {
        level++;
    }
}

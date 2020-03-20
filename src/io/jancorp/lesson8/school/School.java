package io.jancorp.lesson8.school;

public class School {

    private Professor[] professors;
    private Student[] students;
    private String schoolName;
    private HeadMaster headMaster;

    public School(String schoolName, HeadMaster headMaster) {
        this.schoolName = schoolName;
        this.headMaster = headMaster;
    }
}

package io.jancorp.lesson8.school;

public class School {

    private Professor[] professors = new Professor[3];
    private Student[] students = new Student[9];
    private final String schoolName;
    private HeadMaster headMaster;
    private int profCount;
    private int studCount;

    public School(String schoolName, HeadMaster headMaster) {
        this.schoolName = schoolName;
        this.headMaster = headMaster;
        profCount = 0;
        studCount = 0;
    }

    public void AddProf(Professor prof) {
        if (prof != null)   {
            if (profCount < professors.length)  {
                professors[profCount++] = prof;
            }   else    {
                System.out.println("Too many professors!");
            }
        }
    }

    public void AddStudent(Student student) {
        if (student != null)   {
            if (studCount < students.length)  {
                students[studCount++] = student;
            }   else    {
                System.out.println("Too many students!");
            }
        }
    }
    public void schoolDay() {
        headMaster.startStudies();
        for (int i = 0; i < professors.length; i ++) {
            if (professors[i] != null) {
                for (int j = 0; j < students.length; j++) {
                    if (students[j] != null) {
                        if (students[j].getStudySubject() == professors[i].getTeachSubject()) {
                            professors[i].Teach(students[j]);
                        }
                    }
                }
            }
        }
        headMaster.endStudies();
    }
}

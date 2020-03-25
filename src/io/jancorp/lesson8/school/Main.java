package io.jancorp.lesson8.school;

// Student                  Professor           Head
//    name                  name                name
//    age                   age                 age
//    studying subject      teaching subject    start studies
//    knowledge level       teach()             stop studies
//    studying()
//    -increase level

//      School
//      teachers[]              -add teacher
//      students[]              -add student
//      head (obligatory)       -headmaster!
//      name (obligatory)       school day ()
public class Main {
    public static void main(String[] args) {
        HeadMaster head = new HeadMaster("Aquinos", 55);
        School school = new School("Athens Gymnasium", head);

        school.AddProf(new Professor("Lavandis", 34, "Maths"));
        school.AddProf(new Professor("Maximus", 39, "Martial Arts"));
        school.AddProf(new Professor("Sarcarius", 65, "Philosophy"));

        school.AddStudent(new Student("Aven", 17, "Maths"));
        school.AddStudent(new Student("Bronn", 16, "Maths"));
        school.AddStudent(new Student("Zinir", 18, "Philosophy"));
        school.AddStudent(new Student("Vardius", 18, "Martial Arts"));
        school.AddStudent(new Student("Gregorius", 18, "Martial Arts"));
        school.AddStudent(new Student("Rustam", 26, "Philosophy"));

        Student student = new Student("Felicius", 17, "Philosophy");
        student.setLevel(3);

        Student student2 = new Student("Alexius", 24, "Martial Arts");
        student2.setLevel(5);

        school.AddStudent(student);
        school.AddStudent(student2);

        school.schoolDay();
        school.schoolDay();
        school.schoolDay();



    }
}

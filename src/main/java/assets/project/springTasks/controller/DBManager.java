package assets.project.springTasks.controller;

import assets.project.springTasks.db.Student;

import java.util.ArrayList;

public class DBManager {

    private static final ArrayList<Student> STUDENTS = new ArrayList<>();
    private static Long id = 6L;

    static {
        STUDENTS.add(new Student(1L, "Almat", "Almatov", 87, "B"));
        STUDENTS.add(new Student(1L, "John", "Johnovicn", 77, "B"));
        STUDENTS.add(new Student(1L, "Beka", "Berikov", 51, "D"));
        STUDENTS.add(new Student(1L, "Seka", "Serikov", 100, "A"));
        STUDENTS.add(new Student(1L, "Arman", "Armanov", 50, "D"));
    }

    public static ArrayList<Student> getStudents(){
        return STUDENTS;
    }

    public static void addStudent(Student student){
        if (student.getExam() >= 90) {
            student.setMark("A");
        } else if (student.getExam() >= 75) {
            student.setMark("B");
        } else if (student.getExam() >= 60) {
            student.setMark("C");
        } else if (student.getExam() >= 50) {
            student.setMark("D");
        } else {
            student.setMark("F");
        }
        student.setId(id);
        id++;
        STUDENTS.add(student);
    }
}

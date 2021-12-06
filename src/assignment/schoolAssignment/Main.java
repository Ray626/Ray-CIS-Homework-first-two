package assignment.schoolAssignment;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        School school= new School("schoolOne","schoolTwo","SchoolThree");
        ArrayList<Teacher> teacherList=  new ArrayList<>();
        for(int i = 0; i < 3; i++){
            String teacherLastname = String.valueOf(i+1);
            Teacher teacher = new Teacher("Teacher",teacherLastname, "CS");
            school.addTeacher(teacher);
            teacherList.add(teacher);
        }
        ArrayList<Student> studentList=  new ArrayList<>();
        for(int i = 0; i < 10; i++){
            String studentLastname = String.valueOf(i+1);
            Student student = new Student("Student",studentLastname, i+1, 1234567);
            school.addStudent(student);
            studentList.add(student);
        }
        school.deleteStudent(studentList.get(0));
        school.deleteStudent(studentList.get(1));
        school.deleteTeacher(teacherList.get(0));
        school.showTeacher();
        school.showStudent();
    }
}

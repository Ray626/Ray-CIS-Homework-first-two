package assignment.schoolAssignment;

import java.util.ArrayList;
/**
 * This class stores teachers and students.
 * Able to add and delete teachers and
 * students from the arrayList. Also is able
 * to display all the teachers and students
*/
public class School {
    ArrayList<Teacher> teachers;
    ArrayList<Student> students;
    private String schoolOne;
    private String schoolTwo;
    private String schoolThree;
    // constructor of private variables.
    public School(String schoolOne, String schoolTwo, String schoolThree) {
        this.schoolOne = schoolOne;
        this.schoolTwo = schoolTwo;
        this.schoolThree = schoolThree;
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();

    }

    public String getSchoolOne() {
        return schoolOne;
    }

    public String getSchoolTwo() {
        return schoolTwo;
    }

    public String getSchoolThree() {
        return schoolThree;
    }

    public void setSchoolOne(String schoolOne) {
        this.schoolOne = schoolOne;
    }

    public void setSchoolTwo(String schoolTwo) {
        this.schoolTwo = schoolTwo;
    }

    public void setSchoolThree(String schoolThree) {
        this.schoolThree = schoolThree;
    }
    //Add teacher to the arrayList teachers
    public void addTeacher (Teacher teacher){
        this.teachers.add(teacher);
    }
    //Add student to the arrayList students
    public void addStudent (Student student){
        this.students.add(student);
    }
    //Delete teacher to the arrayList teacher
    public void deleteTeacher (Teacher teacher){
        this.teachers.remove(teacher);
    }
    //Delete student to the arrayList students
    public void deleteStudent (Student student){
        this.students.remove(student);
    }
    //Display all the teacher in teachers
    public void showTeacher (){
        for(int i = 0; i< teachers.size(); i++){
            System.out.println(teachers.get(i));
        }
    }
    //Display all the student in students
    public void showStudent (){
        for(int i = 0; i< students.size(); i++){
            System.out.println(students.get(i));
        }
    }

}

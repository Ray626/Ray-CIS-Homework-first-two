package assignment.schoolAssignment;

/**
 * This class generates student with name,
 * grade, and student ID.
 */
public class Student {
    private String firstName;
    private String lastName;
    private int grade;
    private int studentNumber;
    //Constructor of private variables.
    public Student(String firstName, String lastName, int grade, int studentNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getGrade() {
        return grade;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
    // return the String which contains student's name, grade and student ID.
    public String toString(){
        return "Name: " + firstName +" " + lastName + " Grade: " + grade;
    }
}

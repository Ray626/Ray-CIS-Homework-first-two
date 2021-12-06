package assignment.schoolAssignment;

/**
 * This class generates teacher with name,
 * and subject.
 */
public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    //Constructor of private variables
    public Teacher(String firstName, String lastName, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSubject() {
        return subject;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    // return the String contains teacher's name and subject.
    public String toString(){
        return "Name: " + firstName + " " + lastName + " Subject: " + subject;
    }
}

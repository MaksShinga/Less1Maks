package HW4;

public class Student {
    int studentID;
    String firstName;
    String lastName;
    int course;
    double mathGrade;
    double economicsGrade;
    double foreignLanguageGrade;

    public Student(int studentID, String firstName, String lastName, int course, double mathGrade, double economicsGrade, double foreignLanguageGrade) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.mathGrade = mathGrade;
        this.economicsGrade = economicsGrade;
        this.foreignLanguageGrade = foreignLanguageGrade;
    }
}

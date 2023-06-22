package HW4;

public class StudentTest {
    public static double calculateAverageGrade(Student student) {
        return (student.mathGrade + student.economicsGrade + student.foreignLanguageGrade) / 3.0;
    }
    public static void printStudentInfo(Student student) {
        System.out.println("Student ID: " + student.studentID);
        System.out.println("Name: " + student.firstName + " " + student.lastName);
        System.out.println("Course: " + student.course);
    }
    public static void main(String[] args) {
        Student student1 = new Student(1, "John", "Doe", 2, 3.5, 4.0, 4.5);
        Student student2 = new Student(2, "Jane", "Smith", 3, 5.0, 4.5, 4.0);
        Student student3 = new Student(3, "Mike", "Johnson", 1, 3.0, 3.5, 4.0);

        System.out.println("Average Grade: " + calculateAverageGrade(student1));
        printStudentInfo(student1);

        System.out.println("Average Grade: " + calculateAverageGrade(student2));
        printStudentInfo(student2);

        System.out.println("Average Grade: " + calculateAverageGrade(student3));
        printStudentInfo(student3);
    }
}
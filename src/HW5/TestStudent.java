package HW5;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John");
        student.setCourse(2);
        student.setGrade(8);

        student.showInfo();
    }
}

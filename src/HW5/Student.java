package HW5;

public class Student {
    private String name;
    private int course;
    private int grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 3) {
            this.name = name;
        } else {
            System.out.println("The length of the name must be at least 3 characters");
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course >= 1 && course <= 4) {
            this.course = course;
        } else {
            System.out.println("Incorrect value");
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 10) {
            this.grade = grade;
        } else {
            System.out.println("Incorrect value");
        }
    }

    public void showInfo() {
        System.out.println("Name of the student: " + name);
        System.out.println("Course: " + course);
        System.out.println("Grade: " + grade);
    }
}

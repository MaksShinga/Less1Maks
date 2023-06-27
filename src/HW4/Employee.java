package HW4;

public class Employee {
    int id;
    public String surname;
    private double salary;

    public Employee(int id, String surname, double salary) {
        this.id = id;
        this.surname = surname;
        this.salary = salary;
    }
    Employee() {
    }
    private Employee(int id) {
        this.id = id;
    }

    public void displayId() {
        System.out.println("Employee ID: " + id);
    }
    public void displaySurname() {
        System.out.println("Employee Surname: " + surname);
    }
    public void displaySalary() {
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Smith", 5000.0);

        System.out.println("Employee ID: " + employee1.id);
        System.out.println("Employee Surname: " + employee1.surname);
        System.out.println("Employee Salary: " + employee1.salary);

        employee1.displayId();
        employee1.displaySurname();
        employee1.displaySalary();
    }
}

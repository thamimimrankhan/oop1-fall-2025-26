public class AbstractTaskQ1 {
    public static void main(String[] args) {
        Employee p1 = new FullTimeEmployee("Marsh Taylor", 90000);
        System.out.println(p1.toString());
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    public FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "Employee name: " + name + "\n"
                + "Monthly Salary: " + monthlySalary;
    }
}

abstract class Employee {
    String name;

    public Employee(String name) {
        System.out.println("Employee constructor called.");
        this.name = name;
    }

    abstract double calculateSalary();
    public abstract String toString();

    public String showDetails() {
        return "Employee Name: " + name;
    }
}
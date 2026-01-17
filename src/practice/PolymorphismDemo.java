package practice;

// Parent class
abstract class Employee {

    String name;

    Employee(String name) {
        this.name = name;
    }

    // Method to be overridden
    abstract double calculateSalary();

    // Common method
    void showDetails() {
        System.out.println("Employee Name: " + name);
    }
}

// Child class 1
class FullTimeEmployee extends Employee {

    double monthlySalary;

    FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

// Child class 2
class PartTimeEmployee extends Employee {

    double hoursWorked;
    double hourlyRate;

    PartTimeEmployee(String name, double hoursWorked, double hourlyRate) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

// Main class
public class PolymorphismDemo {

    public static void main(String[] args) {

        // Same reference type, different objects
        Employee emp1 = new FullTimeEmployee("Tom", 50000);
        Employee emp2 = new PartTimeEmployee("Jerry", 6.5, 1000);

        printEmployeeSalary(emp1);
        printEmployeeSalary(emp2);
    }

    // Polymorphic method
    static void printEmployeeSalary(Employee emp) {
        emp.showDetails();
        System.out.println("Salary: " + emp.calculateSalary());
        System.out.println("------------------");
    }
}

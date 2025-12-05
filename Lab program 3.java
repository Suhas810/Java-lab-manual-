package javaprograms;

import java.util.Scanner;

public class Employee {

    // Fields
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to raise salary
    public void raiseSalary(double percent) {
        if (percent > 0) {
            salary += salary * percent / 100;
            System.out.println("Salary increased by " + percent + "%.");
        } else {
            System.out.println("Percentage must be positive.");
        }
    }

    // Method to display employee details
    public void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name       : " + name);
        System.out.println("Salary     : " + salary);
    }

    // Main method for demonstration
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input employee details
        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();

        // Create employee object
        Employee emp = new Employee(id, name, salary);
        System.out.println("\nInitial Employee Details:");
        emp.display();

        // Raise salary
        System.out.print("\nEnter percentage to raise salary: ");
        double percent = scanner.nextDouble();
        emp.raiseSalary(percent);

        // Display updated details
        System.out.println("\nUpdated Employee Details:");
        emp.display();

        scanner.close();
    }
}

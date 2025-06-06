/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;
import java.util.Scanner;

/**
 *
 * @author asyla
 */
public class Qno6 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee emp; // Polymorphic reference

        System.out.println("Choose Employee Type:");
        System.out.println("1. Full-Time Employee");
        System.out.println("2. Part-Time Employee");
        System.out.print("Enter choice (1 or 2): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter monthly salary: ");
            double salary = scanner.nextDouble();
            emp = new FullTimeEmployee(salary);
        } else if (choice == 2) {
            System.out.print("Enter hours worked: ");
            int hours = scanner.nextInt();
            System.out.print("Enter hourly rate: ");
            double rate = scanner.nextDouble();
            emp = new PartTimeEmployee(hours, rate);
        } else {
            System.out.println("Invalid choice!");
            scanner.close();
            return;
        }

        // Polymorphic method call
        double salary = emp.calculateSalary();
        System.out.println("Calculated Salary: " + salary);

        scanner.close();
    }
}

// Superclass
class Employee {
    public double calculateSalary() {
        return 0.0; // default implementation
    }
}

// Subclass for full-time employees
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(double salary) {
        this.monthlySalary = salary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

// Subclass for part-time employees
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int hours, double rate) {
        this.hoursWorked = hours;
        this.hourlyRate = rate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

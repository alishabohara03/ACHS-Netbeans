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
public class Qno5 {
    
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Create Circle object with input radius
        Circle myCircle = new Circle(radius);

        // Calculate and display area
        double area = myCircle.area();
        System.out.println("Area of the circle: " + area);

        scanner.close();
    }
}

// Superclass
class Shape {
    public double area() {
        return 0; // default implementation
    }
}

// Subclass
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Overridden method
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

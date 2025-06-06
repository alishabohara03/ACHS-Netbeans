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
public class Qno4 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bird myBird = new Bird();

        System.out.println("Bird Actions Menu:");
        System.out.println("1. Breathe");
        System.out.println("2. Eat");
        System.out.println("3. Fly");
        System.out.println("4. Do all");

        System.out.print("Enter your choice (1 to 4): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                myBird.breathe();
                break;
            case 2:
                myBird.eat();
                break;
            case 3:
                myBird.fly();
                break;
            case 4:
                myBird.breathe();
                myBird.eat();
                myBird.fly();
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}

// Base class
class LivingBeing {
    public void breathe() {
        System.out.println("Living being is breathing...");
    }
}

// Intermediate class
class Animal extends LivingBeing {
    public void eat() {
        System.out.println("Animal is eating...");
    }
}

// Subclass
class Bird extends Animal {
    public void fly() {
        System.out.println("Bird is flying...");
    }
}
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


public class Qno3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car myCar = new Car();

        System.out.println("Car Actions Menu:");
        System.out.println("1. Start the vehicle");
        System.out.println("2. Play music");
        System.out.println("3. Start and Play music");

        System.out.print("Enter your choice (1to3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                myCar.start();
                break;
            case 2:
                myCar.playMusic();
                break;
            case 3:
                myCar.start();
                myCar.playMusic();
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}

// Base class
class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting...");
    }
}

// Subclass
class Car extends Vehicle {
    public void playMusic() {
        System.out.println("Playing music in the car...");
    }
}
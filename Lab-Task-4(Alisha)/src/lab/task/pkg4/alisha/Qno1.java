/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.task.pkg4.alisha;
import java.util.Scanner;

/**
 *
 * @author asyla
 */
public class Qno1 {
    double length;
    double breadth;
    double height;

    void printDimensions() {
        System.out.println("Length: " + length + ", Breadth: " + breadth + ", Height: " + height);
    }

    void printVolume() {
        double volume = length * breadth * height;
        System.out.println("Volume: " + volume);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Qno1 box1 = new Qno1();
        System.out.print("Enter length for box1: ");
        box1.length = sc.nextDouble();
        System.out.print("Enter breadth for box1: ");
        box1.breadth = sc.nextDouble();
        System.out.print("Enter height for box1: ");
        box1.height = sc.nextDouble();

        Qno1 box2 = new Qno1();
        System.out.print("Enter length for box2: ");
        box2.length = sc.nextDouble();
        System.out.print("Enter breadth for box2: ");
        box2.breadth = sc.nextDouble();
        System.out.print("Enter height for box2: ");
        box2.height = sc.nextDouble();

        System.out.println("\nBox 1:");
        box1.printDimensions();
        box1.printVolume();

        System.out.println("\nBox 2:");
        box2.printDimensions();
        box2.printVolume();

        sc.close();
    }
}
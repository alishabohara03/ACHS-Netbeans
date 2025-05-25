/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author asyla
 */



import java.util.Scanner;

public class areausingswitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a shape to calculate the area:");
        System.out.println("1. Square");
        System.out.println("2. Triangle");
        System.out.println("3. Rectangle");
        System.out.print("Enter your choice (1-3): ");
        int choice = sc.nextInt(); 

        switch (choice) {
            case 1:
                System.out.print("Enter the side length of the square: ");
                double side = sc.nextDouble();
                double squareArea = side * side;
                System.out.println("Area of the square: " + squareArea);
                break;

            case 2:
                System.out.print("Enter the base of the triangle: ");
                double base = sc.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = sc.nextDouble();
                double triangleArea = 0.5 * base * height;
                System.out.println("Area of the triangle: " + triangleArea);
                break;

            case 3:
                System.out.print("Enter the length of the rectangle: ");
                double length = sc.nextDouble();
                System.out.print("Enter the breadth of the rectangle: ");
                double breadth = sc.nextDouble();
                double rectangleArea = length * breadth;
                System.out.println("Area of the rectangle: " + rectangleArea);
                break;

            default:
                System.out.println("Invalid choice! Please enter 1, 2, or 3.");
        }

        sc.close(); 
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//2. Create a class Person with attributes name and age. Derive a class Student that adds an
//attribute grade. Write a constructor for Student that initializes all the attributes.
package inheritance;

/**
 *
 * @author asyla
 */
import java.util.Scanner;
public class Qno2 {
    static class Person {
        String name;
        int age;
        
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        
    }
    static class Student extends Person {
        String grade;
        public Student(String name, int age, String grade) {
            super(name, age);
            this.grade = grade;
        }
        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Grade: " + grade);
        }
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter student's name: ");
        String name = input.nextLine();
        
        System.out.print("ENter age: ");
        int age = input.nextInt();
        input.nextLine();
        
        System.out.print("Enter grade:");
        String grade = input.nextLine();
        
        Student s1 = new Student(name, age, grade);
        s1.displayInfo();
        
    }
    
}

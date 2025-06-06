/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// 1. Create a base class Animal with a method makeSound(). Create a derived class Dog that
//overrides makeSound() to print "Bark". Instantiate the Dog class and call the method.

package inheritance;

/**
 *
 * @author asyla
 */
import java.util.Scanner;
public class Qno1 {
    //Base class
    static class Animal {
        public void makeSound() {
            System.out.println("Animal makes a sound");
            
        }
    }
    
    //Derived class
    static class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Bark");
        }
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        System.out.print("Enter animal type (dog/other):");
        String type = input.nextLine().toLowerCase();
        
        Animal animal;
        if (type.equals("dog")) {
            animal = new Dog();
        } else {
            animal = new Animal();
        }
        animal.makeSound();
        
        input.close();
    }
    
    
    
}

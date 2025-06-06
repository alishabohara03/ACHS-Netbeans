/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.task.pkg1;

/**
 *
 * @author asyla
 */
import java.util.Scanner;

public class Qno13_rotatearrayleftbyoneposition {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Array size
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // Input: Array elements
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Store the first element
        int first = array[0];

        // Shift elements left
        for (int i = 0; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        // Place the first element at the end
        array[size - 1] = first;

        // Output: Rotated array
        System.out.println("\nArray after left rotation by one position:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element at index " + i + ": " + array[i]);
        }

       
    }
}


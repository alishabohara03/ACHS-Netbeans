/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.task.pkg1;

/**
 *
 * @author asyla
 */
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Qno12_removeduplicatesfromarray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

     
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        
        Set<Integer> unique = new LinkedHashSet<>();   // preserves insertion order
        for (int num : array) {
            unique.add(num);
        }

        
        System.out.println("\nArray after removing duplicates:");
        int index = 0;
        for (int num : unique) {
            System.out.println("Element at index " + index++ + ": " + num);
        }

        scanner.close();
    }
}


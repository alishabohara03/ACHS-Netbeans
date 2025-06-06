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
public class Qno11_sortanarrayinasscendingorder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements:");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        
        System.out.println("ENter " + size + " elements:");
        for (int i =0; i < size; i++) {
            System.out.print("Element " + (i+1) + ":");
            array[i] = scanner.nextInt();
        } 
        
        for (int i = 0; i< size -1; i++) {
            for (int j = 0; j < size -1 - i; j++) {
                if (array[j] > array[j +1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        
        System.out.println("\nArray in ascending order:");
        for (int i =0; i < size; i++) {
            System.out.println("Element at index " + i + ": " + array[i]);
        }
        
    }
    
}

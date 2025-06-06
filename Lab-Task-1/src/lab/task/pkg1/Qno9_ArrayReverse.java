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
public class Qno9_ArrayReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements:");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i+1) + ":");
            array[i] = scanner.nextInt();
            
        }
        int start = 0;
        int end = size - 1;
        while (start < end) {
            int temp = array[start];
            array[start] =array[end];
            array[end] = temp;
            
            start++;
            end--;
        }
        
        System.out.println("\nReversed array:");
        for (int i = 0; i< size; i++) {
            System.out.println("Element at index " + i + ":" +array[i]);
        }
    }
    
}

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
public class Qno14_frequencyofeachelementinarray {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        boolean[] visited = new boolean[size];  

       
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

       
        System.out.println("\nFrequency of each element:");
        for (int i = 0; i < size; i++) {
            if (visited[i]) continue;

            int count = 1;
            for (int j = i + 1; j < size; j++) {
                if (array[i] == array[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(array[i] + " occurs " + count + " time(s)");
        }

        
    }
}
    
    


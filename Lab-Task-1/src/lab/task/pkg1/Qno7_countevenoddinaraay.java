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
public class Qno7_countevenoddinaraay {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements:");
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];
        
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i+1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        int evenCount =0, oddCount = 0;
        
        for (int num : numbers) {
            if (num% 2 == 0){
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("\nNumber of even numbers:" + evenCount);
        System.out.println("Number of odd numbers:" + oddCount);
    }
    
}

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
public class Qno10_ifelementexistsinarray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("ENter the number of elements:");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element " + (i+1) + ": ");
            array[i] = scanner.nextInt();
        }
        
        System.out.print("\nENter the element to search:");
        int target = scanner.nextInt();
        
        
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (array[i] == target) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Element " + target + " exists in the array.");
            
        } else {
            System.out.println("Element " + target + " does not exist in the array.");
            
        }
    }
    
}

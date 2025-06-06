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
public class Qno6_Array {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements:");
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];
        
        System.out.println("Enter " + size + " elements:\n");
        for(int i = 0; i < size; i++){
            System.out.println("Element" + (i+1) + ":");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("The elements of the array are:");
        for(int i =0; i < size; i++){
            System.out.println("Element at index" + i + ":" + numbers[i]);
        }
    }
    
}

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
public class Qno8_secondlargestnumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements:");
        int size = scanner.nextInt();
        
        if (size < 2) {
            System.out.println("Array must contain at least 2 elements.");
            return;
        }
        int[] numbers = new int[size];
        
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " +(i+1) + ":");
            numbers[i] = scanner.nextInt();
            
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int num : numbers) {
            if(num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no distinct second largest number.");
        } else {
            System.out.println("Second largest number is:" + secondLargest);
        }
        
        
    }
    
}

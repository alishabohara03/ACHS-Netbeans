/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.task.pkg4.alisha;
import java.util.Scanner;

/**
 *
 * @author asyla
 */
public class Qno3_a {
    public static void main(String[] args) {
        int[] arr = new int[15];
        for (int i = 0; i < 15; i++) {
            arr[i] = i + 1; // First 15 natural numbers
        }

        int sum = arr[2] + arr[14]; // 3rd and last element
        System.out.println("Sum of 3rd and last element: " + sum);
    }
    
}

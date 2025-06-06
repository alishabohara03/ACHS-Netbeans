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
public class Qno4_Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a numbe to print its multiplication table:");
        int number = scanner.nextInt();
        
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i<= 10; i++) {
            System.out.println(number + "x" + i + "=" + (number *i));
        }
    }
    
}

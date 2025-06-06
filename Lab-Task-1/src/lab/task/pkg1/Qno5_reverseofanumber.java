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
public class Qno5_reverseofanumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to reverse:");
        int number = scanner.nextInt();
        
        int reversed = 0;
        
        while(number != 0){
            int digit = number % 10;
            reversed = reversed *10 +digit;
            number /= 10;
        }
        
        System.out.println("Reversed number is:" + reversed);
    }
    
}

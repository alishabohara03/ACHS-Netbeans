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
public class Qno1_evenodd {
    
     public static void main(String[] args) {
        
        int num;
        Scanner sc= new Scanner(System.in);
        
        for (int i = 1; i <= 2; i++) {
        System.out.println("Enter a number" + i + ":");
        num= sc.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("The number is even\n");
            
        }
        else{
            System.out.println("The number is odd\n");
        }
    }
    
     }
}

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
public class Qno2_largestofthreenumbers {
   
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter first number:");
        int a= sc.nextInt();
        System.out.print("Enter the Second number:");
        int b = sc.nextInt();
        System.out.print("Enter the third number:");
        int c= sc.nextInt();
        
        int largest;
        if(a>=b && a>=c)
            largest = a;
        else if (b>=a && b>=c)
            largest = b;
        else
            largest = c;
        
        System.out.println("Largest number is:" + largest);
        sc.close();
    }
    
}

    
    


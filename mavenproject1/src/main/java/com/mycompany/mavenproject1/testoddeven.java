/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author asyla
 */

import java.util.Scanner;

public class testoddeven {
    public static void main(String[] args) {
        
        int num;
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter a number");
        num= sc.nextInt();
        
        if (num/2 ==0) {
            System.out.println("The number is even");
            
        }
        else{
            System.out.println("The number is odd");
        }
    }
    
}

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
public class primeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        System.out.println("Prime numbers up to" + n +" are:");
        for(int i = 2; i <= n; i++){
            if(isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        
        sc.close();
            
            
    }
    
    static boolean isPrime(int num){
        if(num <2) return false;
        for (int i =2; i<= num; i++){
      
            if(num % i ==0) return false;
        }
        return true;
    }
}
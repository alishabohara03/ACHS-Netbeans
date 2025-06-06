/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author asyla
 */

import java.util.Scanner;


class GetA {
        public int a,b;
        public void getA()
            {
                Scanner s= new Scanner(System.in);
                System.out.println("Enter the value of A");
                a= s.nextInt();
               }
           int setA()
            {
                return this.a;
            }
    } 

class GetB extends GetA {
    public void getB()
    {
    Scanner s= new Scanner(System.in);
    System.out.println("Enter the value of B");
    b= s.nextInt();
   
    }
    
    int setB()
    {
        return this.b;
    }
    
}



public class NewClass {
        
    public static void main(String[] args) {
            GetB gb= new GetB();
            gb.getA();
            gb.getB();
           
            
            int sum = gb.setA() + gb.setB();
            System.out.println("the sum is " + sum);
         
          
    }
    
}

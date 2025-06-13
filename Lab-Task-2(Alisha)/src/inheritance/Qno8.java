/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;
import java.util.Scanner;

/**
 *
 * @author asyla
 */
public class Qno8 {
    public static  void main(String[] args){
        C obj = new C();
        
    }
    
}

class A {
    public A(){
        System.out.println("Constructor of class A");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("Constructor of class B");
    }
}

class C extends B {
    public C() {
        super();
        System.out.println("Constructor of class C");
        
    }
}

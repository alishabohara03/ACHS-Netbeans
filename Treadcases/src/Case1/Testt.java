/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//single task from single thread
package Case1;

/**
 *
 * @author asyla
 */
// also we can separatly crate thread 

class MyThread1 extends Thread
{
    public void run()
    {
        System.out.println("task 1");
    }
}
public class Testt {
    public static void main(String[] args)
    {
        MyThread1 thread1 = new MyThread1();
        thread1.start();
    }
            
            
    
}

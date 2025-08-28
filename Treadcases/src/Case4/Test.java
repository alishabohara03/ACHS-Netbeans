/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//performing multiple task from multiple thread
package Case4;

/**
 *
 * @author asyla
 */

class MyThread1 extends Thread
{
 public void run()
 {
     System.out.println("task 1");
 }
}

class MyThread2 extends Thread
{
    public void rnu()
    {
          System.out.println("task 2");
    }
}
public class Test  {
    public static void main(String[] args)
    {
        MyThread1 thread1=new MyThread1();
        thread1.start();
        
         MyThread2 thread2=new MyThread2();
        thread2.start();
        
       
        
        
    }
    
}

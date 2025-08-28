/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//performing single task from multiple thread
package Case2;


/**
 *
 * @author asyla
 */
public class Test  extends Thread{
    
    public void run()
    {
        System.out.println("task 1");
    }
    public static void main(String[] args)
    {
        Test thread1 = new Test();
        thread1.start();
        
        
        Test thread2 = new Test();
        thread2.start();
        
         Test thread3 = new Test();
        thread3.start();
        
         Test thread4 = new Test();
        thread4.start();
        
        
    }
    
    
    
}

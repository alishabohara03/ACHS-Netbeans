/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//1. Performing single task from single thread
package Case1;

/**
 *
 * @author asyla
 */
public class Test extends Thread {
    public void run()
    {
    System.out.println("Task 1");
    }
    public static void main(String[] args)
    {
        Test thread1 = new Test();
        thread1.start();
    }
    
}

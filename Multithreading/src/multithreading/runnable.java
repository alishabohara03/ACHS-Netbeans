/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading;

/**
 *
 * @author asyla
 */
public class runnable  implements Runnable{
    
    public void run()
    {
        System.out.println("thread task");
    }
    
    public static void main(String[] args)
    {
        runnable t= new runnable();
        Thread th = new Thread(t);
        th.start();
    }
    
    
}

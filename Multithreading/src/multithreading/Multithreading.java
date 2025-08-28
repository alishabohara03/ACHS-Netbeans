/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multithreading;

/**
 *
 * @author asyla
 */
public class Multithreading extends Thread {

    /**
     * @param args the command line arguments
     */
    public void run()
    {
        System.out.println("Thread task");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Multithreading t= new Multithreading();  // thread created
        t.start();
        
    }
    
}

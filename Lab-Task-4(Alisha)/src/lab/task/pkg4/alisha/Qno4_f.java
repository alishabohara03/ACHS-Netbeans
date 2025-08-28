/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.task.pkg4.alisha;

/**
 *
 * @author asyla
 */



// Qno13f.java
// Program to illustrate synchronization using synchronized block

class Printer {
    public void printNumbers(String threadName) {
        synchronized (this) { // synchronized block
            for (int i = 1; i <= 5; i++) {
                System.out.println(threadName + " prints: " + i);
                try { Thread.sleep(500); } catch (Exception e) {}
            }
        }
    }
}

public class Qno4_f {
    public static void main(String[] args) {
        Printer printer = new Printer();

        Thread t1 = new Thread(() -> printer.printNumbers("Thread 1"));
        Thread t2 = new Thread(() -> printer.printNumbers("Thread 2"));

        t1.start();
        t2.start();
    }
}

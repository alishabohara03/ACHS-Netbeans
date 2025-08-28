/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.task.pkg4.alisha;

/**
 *
 * @author asyla
 */

// Q13d.java
class PriorityThread extends Thread {
    public void run() {
        System.out.println(getName() + " with priority " + getPriority());
    }
}

public class Qno4_d {
    public static void main(String[] args) {
        PriorityThread t1 = new PriorityThread();
        PriorityThread t2 = new PriorityThread();

        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.MAX_PRIORITY); // 10

        t1.start();
        t2.start();

        System.out.println("t1 priority: " + t1.getPriority());
        System.out.println("t2 priority: " + t2.getPriority());
    }
}

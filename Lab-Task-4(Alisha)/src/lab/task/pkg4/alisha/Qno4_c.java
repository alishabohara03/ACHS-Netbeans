/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.task.pkg4.alisha;

/**
 *
 * @author asyla
 */

// Q13c.java
class MyJob extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " running...");
            try { Thread.sleep(1000); } catch (Exception e) {}
        }
    }
}

public class Qno4_c {
    public static void main(String[] args) {
        MyJob t1 = new MyJob();
        t1.start();

        System.out.println("Is t1 alive? " + t1.isAlive());

        try {
            t1.join(); // wait for t1 to finish
        } catch (Exception e) {}

        System.out.println("Is t1 alive after join? " + t1.isAlive());
        System.out.println("Main thread finished.");
    }
}


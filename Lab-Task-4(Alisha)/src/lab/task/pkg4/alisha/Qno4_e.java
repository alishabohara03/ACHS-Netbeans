/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.task.pkg4.alisha;

/**
 *
 * @author asyla
 */

// Qno13e.java
// Program to illustrate synchronization using synchronized method

class Counter {
    private int count = 0;

    public synchronized void increment() { // synchronized method
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class Qno4_e {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count = " + counter.getCount());
    }
}

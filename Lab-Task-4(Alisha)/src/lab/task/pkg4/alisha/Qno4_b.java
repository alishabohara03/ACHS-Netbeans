/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.task.pkg4.alisha;

/**
 *
 * @author asyla
 */


// Q13b.java
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread class running: " + i);
        }
    }
}

public class Qno4_b {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}


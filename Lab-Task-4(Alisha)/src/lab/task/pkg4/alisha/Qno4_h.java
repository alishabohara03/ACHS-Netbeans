/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.task.pkg4.alisha;

/**
 *
 * @author asyla
 */
// Qno13h.java
// Program to print numbers 1 to 10 with 2 seconds interval

class NumberPrinter implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try { Thread.sleep(2000); } catch (Exception e) {}
        }
    }
}

public class Qno4_h {
    public static void main(String[] args) {
        Thread t = new Thread(new NumberPrinter());
        t.start();
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.task.pkg4.alisha;

/**
 *
 * @author asyla
 */
// Qno13g.java
// Program to print numbers 100 to 1 in multiple lines (20 numbers per line) with 3 sec interval

class ReversePrinter extends Thread {
    @Override
    public void run() {
        int countInLine = 0;
        for (int i = 100; i >= 1; i--) {
            System.out.print(i + " ");
            countInLine++;

            // Move to next line after 20 numbers
            if (countInLine % 20 == 0) {
                System.out.println();
            }

            try {
                Thread.sleep(3000);  // 3 seconds delay
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class Qno4_g {
    public static void main(String[] args) {
        ReversePrinter t = new ReversePrinter();
        t.start();
    }
}

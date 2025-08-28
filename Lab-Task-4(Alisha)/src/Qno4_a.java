/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


//This Ques 4 contains :

//13. WAP
//a) to demonstrate the process of creating threads by implementing “Runnable”
//interface
//b) to demonstrate the process of creating threads by extending “Thread” class
//c) to show the use of isAlive() and join() methods of Thread
//d) to demonstrate the process of setting and getting thread priorities
//e) to illustrate the process of thread synchronization using synchronized method
//f) to illustrate the process of thread synchronization using synchronized block
//g) to create a thread that prints numbers from 100 to 1 in the interval of 3 seconds by
//extending the Thread Class.
//h) to create a thread that prints the numbers from 1 to 10 in the interval of 2 seconds
//by implementing the Runnable interface.

/**
 *
 * @author asyla
 */


class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable Thread running: " + i);
        }
    }
}

public class Qno4_a {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
    }
}

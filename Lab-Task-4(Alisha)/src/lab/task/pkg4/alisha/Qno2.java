/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.task.pkg4.alisha;
import java.util.Scanner;

/**
 *
 * @author asyla
 */
class Money {
    int rupee;
    int paisa;

    void setMoney(int r, int p) {
        rupee = r;
        paisa = p;
    }

    void displayMoney() {
        System.out.println(rupee + " Rupee, " + paisa + " Paisa");
    }

    void addMoney(Money m1, Money m2) {
        int totalPaisa = m1.paisa + m2.paisa;
        rupee = m1.rupee + m2.rupee + totalPaisa / 100;
        paisa = totalPaisa % 100;
    }
}

public class Qno2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Money money1 = new Money();
        Money money2 = new Money();
        Money money3 = new Money();

        System.out.print("Enter rupees for Money 1: ");
        int r1 = sc.nextInt();
        System.out.print("Enter paisa for Money 1: ");
        int p1 = sc.nextInt();
        money1.setMoney(r1, p1);

        System.out.print("Enter rupees for Money 2: ");
        int r2 = sc.nextInt();
        System.out.print("Enter paisa for Money 2: ");
        int p2 = sc.nextInt();
        money2.setMoney(r2, p2);

        System.out.print("Money 1: ");
        money1.displayMoney();

        System.out.print("Money 2: ");
        money2.displayMoney();

        money3.addMoney(money1, money2);

        System.out.print("Total Sum: ");
        money3.displayMoney();

        sc.close();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;
import java.util.Scanner;


/**
 *
 * @author asyla
 */
public class Qno7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();
        
        System.out.print("Enter Initial Balance: ");
        double balance = scanner.nextDouble();
        
        System.out.print("Enter Interest Rate for Saving Account: ");
        double interestRate = scanner.nextDouble();
        
        SavingsAccount savings = new SavingsAccount(accountNumber, balance, interestRate);
        
        System.out.print("Enter amount to deposit:");
        double amount = scanner.nextDouble();
        savings.deposit(amount);
        
        savings.display();
        
        scanner.close();
        
        
    }
    
}

class Account {
    protected String accountNumber;
    protected double balance;
    
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public void deposit(double amount) {
        balance += amount;
        System.out.print("Deposited:" + amount);
    }
    
    public void display() {
        System.out.println("Account Number:" + accountNumber);
        System.out.println("Balance:" +balance);
    }
}

class SavingsAccount extends Account {
    private double interestRate;
    
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    
    
    public void deposit(double amount) {
        super.deposit(amount);
        System.out.println("Savings Account deposit with interest consideration.");
    }
    
   
    public void display() {
        super.display();
        System.out.println("Interest Rate:" + interestRate + "%");
    }
}


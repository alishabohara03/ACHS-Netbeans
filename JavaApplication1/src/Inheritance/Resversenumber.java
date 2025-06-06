/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author asyla
 */

import java.util.Scanner;

class GetNumber {
    
    public int num;
    
    public void getNum() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        num = s.nextInt();
    }
    
    
    int setNum() {
return this.num;
}
    
}


class FindReverse extends GetNumber {
    public int reverseNum() {
        int n = num;
        int rev = 0;
        while (n!= 0) {
            int digit = n% 10;
            rev = rev * 10+digit;
            n= n/10;
        }
        return rev;
    }
}



public class Resversenumber {
    public static void main(String[] args){
        FindReverse fr = new FindReverse();
        fr.getNum();
        int reversed = fr.reverseNum();
        System.out.println("The reverse of the number is: " +reversed);
                
    }
    
}

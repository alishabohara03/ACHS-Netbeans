/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package moviebookapp;

class BookTheaterSeat
{
    int total_seats=10;
    void bookSeat(int seats)
    {
        if(total_seats>=seats)
        {
            System.out.println(seats+ "seats booked sucessfully");
            total_seats=total_seats-seats;
            System.out.println("Seats left : "+total_seats);
            
        } else {
            System.out.println("Sorry seats cannot be booked...");
            System.out.println("seats Left:" +total_seats);
        }
    }
}

/**
 *
 * @author asyla
 */
public class Moviebookapp extends Thread {
    static BookTheaterSeat b;
    int seats;

    public void run()
    {
        b.bookSeat(seats);
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        b= new BookTheaterSeat();
        
       Moviebookapp alisha = new Moviebookapp();
       alisha.seats=7;
       alisha.start();
       
       Moviebookapp lisha = new Moviebookapp();
       lisha.seats=6;
       lisha.start();
       
        
    }
    
}

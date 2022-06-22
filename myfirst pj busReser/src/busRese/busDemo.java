package busRese;

import java.util.ArrayList;
import java.util.Scanner;


public class busDemo {
    public static void main(String[] args) {
        //Arraylist collection
        ArrayList<bus> buses = new ArrayList<bus>();
        ArrayList<booking>bookings=new ArrayList<booking>();

        buses.add(new bus(1,true,3));
        buses.add(new bus(2,false,43));
        buses.add(new bus(3,true,50));



        Scanner scanner = new Scanner(System.in);
        int userOpt = 1;
        for(bus b:buses){
            b.displayInfo();
        }
        while (userOpt == 1) {
            System.out.println("Enter 1 to Book and 2 to exit");
            userOpt = scanner.nextInt();
            if(userOpt==1){
                booking Booking = new booking();
                if(Booking.isAvailable(bookings,buses)){
                    bookings.add(Booking);
                    System.out.println("your ticket confirmed");

                }
                else {
                    System.out.println("oops!Bus is full");
                }
            }
        }
    }
}

package busRese;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class booking {
    String passengerName;
    int busNo;
    Date date;

    booking() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        passengerName = scanner.next();
        System.out.println("Enter bus name:");
        busNo = scanner.nextInt();
        System.out.println("Enter date dd-mm-yyyy");
        String dateInput = scanner.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }

    public boolean isAvailable(ArrayList<booking> bookings, ArrayList<bus> buses) {
        int capacity = 0;
        for (bus Bus : buses) {
            if (Bus.getBusNo() == busNo)
                capacity = Bus.getCapacity();

        }
        int booked = 0;
        for (booking b : bookings) {
            if (b.busNo == busNo && b.date.equals(date)) {
                booked++;
            }
        }
        return booked < capacity ? true : false;
    }
}


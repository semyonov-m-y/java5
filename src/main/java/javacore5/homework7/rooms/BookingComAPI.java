package javacore5.homework7.rooms;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookingComAPI extends AbstractAPI {

    public List<Room> bookingRooms = new ArrayList<>();

    public BookingComAPI() {
        bookingRooms.add(new Room(5, 1000, 1, new Date(), "Como", "Chicago"));
        bookingRooms.add(new Room(6, 2000, 2, new Date(), "Holiday Inn", "St Paul"));
        bookingRooms.add(new Room(7, 3000, 1, new Date(), "The Mandeville", "Madison"));
        bookingRooms.add(new Room(8, 4000, 2, new Date(), "Park Tower", "Washington"));
        bookingRooms.add(new Room(9, 5000, 1, new Date(), "Crowne Plaza", "Deltona"));
    }

    @Override
    public List<Room> getAll() {
        return bookingRooms;
    }
}

package main.javacore5.homework5;

import java.util.Date;

public class BookingComAPI extends AbstractAPI {

	private Room[] bookingRooms;

	public BookingComAPI() {
		bookingRooms = new Room[5];
		bookingRooms[0] = new Room(5, 1000, 1, new Date(), "Como", "Chicago");
		bookingRooms[1] = new Room(6, 2000, 2, new Date(), "Holiday Inn", "St Paul");
		bookingRooms[2] = new Room(1, 3000, 1, new Date(), "The Mandeville", "Madison");
		bookingRooms[3] = new Room(2, 4000, 2, new Date(), "Park Tower", "Washington");
		bookingRooms[4] = new Room(3, 5000, 1, new Date(), "Crowne Plaza", "Deltona");
	}

	@Override
	public Room[] getAll() {
		return bookingRooms;
	}
}

package main.java.javacore5.homework5;

import java.util.Date;

public class DAOImpl implements DAO {

	@Override
	public Room save(Room room) {
		System.out.println("Room " + room.getId() + " saved.");
		return room;
	}

	@Override
	public boolean delete(Room room) {
		System.out.println("Room " + room.getId() + " deleted.");
		return true;
	}

	@Override
	public Room update(Room room) {
		System.out.println("Room " + room.getId() + " updated.");
		return room;
	}

	@Override
	public Room findByID(long id) {
		Room room = new Room(10, 1000, 1, new Date(), "hotel", "city");
		System.out.println("Searching room by id number :"+id);
		return room;
	}
}

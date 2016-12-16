package javacore5.homework7.rooms;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractAPI implements API {

    @Override
    public List<Room> findRooms(int price, int persons, String city, String hotel) {
        List<Room> roomsFound = new ArrayList<>();

        int index = 0;
        Room roomsFoundResult = roomsFound.get(index);
        for (Room eachRoom : getAll()) {
            if (eachRoom.getPrice() == price && eachRoom.getPersons() == persons && eachRoom.getCityName().equals(city)
                    && eachRoom.getHotelName().equals(hotel)) {
                roomsFoundResult = eachRoom;
            }
        }
        return (List<Room>) roomsFoundResult;
    }
}

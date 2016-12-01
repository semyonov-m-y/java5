package main.java.javacore5.homework5;

public abstract class AbstractAPI implements API {

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int countRooms = 0;
        for (Room eachRoom : getAll()) {
            if (eachRoom.getPrice() == price && eachRoom.getPersons() == persons && eachRoom.getCityName().equals(city) && eachRoom.getHotelName().equals(hotel)) {
                countRooms++;
            }
        }

        Room[] roomsFound = new Room[countRooms];

        int index = 0;
        for (Room eachRoom : getAll()) {
            if (eachRoom.getPrice() == price && eachRoom.getPersons() == persons && eachRoom.getCityName().equals(city) && eachRoom.getHotelName().equals(hotel)) {
                roomsFound[index] = eachRoom;
            }
        }
        return roomsFound;
    }
}

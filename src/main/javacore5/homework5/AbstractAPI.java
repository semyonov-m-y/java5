package main.javacore5.homework5;

public abstract class AbstractAPI implements API {

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int countRooms = 0;
        for (Room r : getAll()) {
            if (r.getPrice() == price && r.getPersons() == persons && r.getCityName().equals(city) && r.getHotelName().equals(hotel)) {
                countRooms++;
            }
        }

        Room[] roomsFound = new Room[countRooms];

        int index = 0;
        for (Room r : getAll()) {
            if (r.getPrice() == price && r.getPersons() == persons && r.getCityName().equals(city) && r.getHotelName().equals(hotel)) {
                roomsFound[index] = r;
            }
        }
        return roomsFound;
    }
}

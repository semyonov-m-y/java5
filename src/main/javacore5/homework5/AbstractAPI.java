package main.javacore5.homework5;

public abstract class AbstractAPI implements API {

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int countRooms = 0;
        for (Room r : getAll()) {
            if (r.getPrice() == price && r.getPersons() == persons && r.getCityName() == city && r.getHotelName()==hotel){
                countRooms++;
            }
        }

        Room[] roomsFound = new Room[countRooms];

        int index = 0;
        for (Room r : getAll()) {
            if (r.getPrice() == price && r.getPersons() == persons && r.getCityName() == city && r.getHotelName()==hotel){
                roomsFound[index] = r;
            }
        }
        return roomsFound;
    }
}

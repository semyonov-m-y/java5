package javacore5.homework5;

public abstract class AbstractAPI implements API {

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int count = 0;
        for (Room r : getAll()) {
            if (r.getPrice() == price && r.getPersons() == persons && r.getCityName() == city && r.getHotelName()==hotel){
                count++;
            }
        }

        Room[] res = new Room[count];

        int index = 0;
        for (Room r : getAll()) {
            if (r.getPrice() == price && r.getPersons() == persons && r.getCityName() == city && r.getHotelName()==hotel){
                res[index] = r;
            }
        }
        return res;
    }
}

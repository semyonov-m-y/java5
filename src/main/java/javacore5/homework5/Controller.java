package javacore5.homework5;

public class Controller {

    private API[] apis = {new BookingComAPI(), new GoogleAPI(), new TripAdvisorAPI()};

    Room[] requestRooms(int price, int persons, String city, String hotel) {
        int countRequestRooms = 0;
        for (API eachApi : apis) {
            countRequestRooms += eachApi.findRooms(price, persons, city, hotel).length;
        }

        Room[] requestRoomsResult = new Room[countRequestRooms];

        int i = 0;
        for (API eachApi : apis) {
            for (Room nextRoom : eachApi.findRooms(price, persons, city, hotel)) {
                requestRoomsResult[i] = nextRoom;
                i++;
            }
        }

        return requestRoomsResult;
    }

    Room[] check(API api1, API api2) {
        int countEqualRooms = 0;
        for (int i = 0; i < api1.getAll().length; i++) {
            for (int j = 0; j < api1.getAll().length; j++) {
                if (api1.getAll()[i].equals(api2.getAll()[j])) {
                    countEqualRooms++;
                }
            }
        }

        Room[] equalRoomsResult = new Room[countEqualRooms];

        for (int i = 0; i < api1.getAll().length; i++) {
            if (api1.getAll()[i].equals(api2.getAll()[i])) {
                equalRoomsResult[i] = api1.getAll()[i];
            }
        }

        return equalRoomsResult;
    }
}

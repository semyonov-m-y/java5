package javacore5.homework7.rooms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Controller {

    List<API> apis = new ArrayList<>();

    void addRooms(int price, int persons, String city, String hotel) {
        apis.addAll((Collection<? extends API>) new BookingComAPI());
        apis.addAll((Collection<? extends API>) new GoogleAPI());
        apis.addAll((Collection<? extends API>) new TripAdvisorAPI());
    }

    List<Room> requestRooms(int price, int persons, String city, String hotel) {
        int countRequestRooms = 0;
        for (API eachApi : apis) {
            countRequestRooms += eachApi.findRooms(price, persons, city, hotel).size();
        }

        List<Room> requestRoomsResult = new ArrayList<>(countRequestRooms);

        int i = 0;
        for (API eachApi : apis) {
            for (Room nextRoom : eachApi.findRooms(price, persons, city, hotel)) {
                Room result = requestRoomsResult.get(i);
                result = nextRoom;
                i++;
            }
        }

        return requestRoomsResult;
    }

    List<Room> check(API api1, API api2) {
        List<Room> equalRoomsResult = new ArrayList<>();
        for (int i = 0; i < api1.getAll().size() - 1; i++) {

            if (api1.getAll().get(i).equals(api2.getAll().get(i))) {
                equalRoomsResult = (List<Room>) api1.getAll().get(i);
            }
        }

        return equalRoomsResult;
    }
}
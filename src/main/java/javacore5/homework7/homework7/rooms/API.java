package javacore5.homework7.rooms;

import java.util.List;

public interface API {

    List<Room> findRooms(int price, int persons, String city, String hotel);

    List<Room> getAll();
}
package javacore5.homework7.rooms;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoogleAPI extends AbstractAPI {

    public List<Room> googleRooms = new ArrayList<>();

    public GoogleAPI() {
        googleRooms.add(new Room(0, 1000, 1, new Date(), "Star", "Austin"));
        googleRooms.add(new Room(1, 2000, 2, new Date(), "FiveStar", "Dallas"));
        googleRooms.add(new Room(2, 3000, 1, new Date(), "Marina", "Santa Fe"));
        googleRooms.add(new Room(3, 4000, 2, new Date(), "Park Plaza", "Phoenix"));
        googleRooms.add(new Room(4, 5000, 1, new Date(), "Millennium", "Bismarck"));
    }

    @Override
    public List<Room> getAll() {
        return googleRooms;
    }
}
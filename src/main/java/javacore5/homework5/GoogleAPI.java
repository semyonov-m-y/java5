package javacore5.homework5;

import java.util.Date;

public class GoogleAPI extends AbstractAPI {

    private Room[] googleRooms;

    public GoogleAPI() {
        googleRooms = new Room[5];
        googleRooms[0] = new Room(10, 1000, 1, new Date(), "Star", "Austin");
        googleRooms[1] = new Room(6, 2000, 2, new Date(), "FiveStar", "Dallas");
        googleRooms[2] = new Room(1, 3000, 1, new Date(), "Marina", "Santa Fe");
        googleRooms[3] = new Room(2, 4000, 2, new Date(), "Park Plaza", "Phoenix");
        googleRooms[4] = new Room(3, 1000, 1, new Date(), "Millennium", "Bismarck");
    }

    @Override
    public Room[] getAll() {
        return googleRooms;
    }
}

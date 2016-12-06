package javacore5.homework5;

import java.util.Date;

public class TripAdvisorAPI extends AbstractAPI {

    private Room[] tripRooms;

    public TripAdvisorAPI() {
        tripRooms = new Room[5];
        tripRooms[0] = new Room(10, 1000, 1, new Date(), "Landmark", "New York");
        tripRooms[1] = new Room(11, 2000, 2, new Date(), "Arlington", "Jackson");
        tripRooms[2] = new Room(1, 3000, 1, new Date(), "Strand Palace", "Rogers");
        tripRooms[3] = new Room(2, 4000, 2, new Date(), "Durrants", "Columbus");
        tripRooms[4] = new Room(3, 5000, 1, new Date(), "Rosewood", "Orlando");
    }

    @Override
    public Room[] getAll() {
        return tripRooms;
    }
}

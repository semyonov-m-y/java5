package javacore5.homework7.rooms;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TripAdvisorAPI extends AbstractAPI {

    public List<Room> tripAdvisorRooms = new ArrayList<>();

    public TripAdvisorAPI() {
        tripAdvisorRooms.add(new Room(10, 1000, 1, new Date(), "Landmark", "New York"));
        tripAdvisorRooms.add(new Room(11, 2000, 2, new Date(), "Arlington", "Jackson"));
        tripAdvisorRooms.add(new Room(12, 3000, 1, new Date(), "Strand Palace", "Rogers"));
        tripAdvisorRooms.add(new Room(13, 4000, 2, new Date(), "Durrants", "Columbus"));
        tripAdvisorRooms.add(new Room(14, 5000, 1, new Date(), "Rosewood", "Orlando"));
    }

    @Override
    public List<Room> getAll() {
        return tripAdvisorRooms;
    }
}
package javacore5.homework7.rooms;

import java.util.ArrayList;
import java.util.List;

public class DAOImpl implements DAO {

    List<Room> dao = new ArrayList<>();

    @Override
    public Room save(Room room) {
        dao.add(room);
        System.out.println("Save operation " + room.getId());
        return dao.get(0);
    }

    @Override
    public boolean delete(Room room) {
        Room deleteRoom = dao.get(0);
        deleteRoom = null;
        System.out.println("Delete operation " + room.getId());
        return true;
    }

    @Override
    public Room update(Room room) {
        Room updateRoom = dao.get(1);
        updateRoom = room;
        updateRoom.setPrice(10000);
        System.out.println("Update operation " + room.getId());
        return updateRoom;
    }

    @Override
    public Room findByID(long id) {
        Room findRoom = dao.get(1);
        System.out.println("We found room " + id);
        return findRoom;
    }
}
package javacore5.homework7.rooms;

import java.util.ArrayList;
import java.util.List;

public class DAOImpl implements DAO {

     private List<Room> dao = new ArrayList<>();

    @Override
    public Room save(Room room) {
        dao.add(room);
        System.out.println(room.getHotelName() + " was saved in DB");

        return room;
    }

    @Override
    public boolean delete(Room room) {
        for (int i = 0; i < dao.size(); i++) {
            if (dao.get(i).equals(room)) {
                dao.remove(i);
                System.out.println(room.getHotelName() + " was removed from DB");

                return true;
            }
        }

        return false;
    }

    @Override
    public void update(Room room) {
        for (int i = 0; i < dao.size(); i++) {
            if (dao.get(i).getId() == room.getId()) {
                dao.set(i, room);
                System.out.println(room.getHotelName() + " updated");
                break;
            }
        }
    }

    @Override
    public Room findByID(long id) {
        for (int i = 0; i < dao.size(); i++) {
            if (dao.get(i).getId() == id) {
                System.out.println("Searching result: " + dao.get(i).getHotelName());

                return dao.get(i);
            }
        }
        System.out.println("The search has not given any result");

        return null;
    }

    @Override
    public List<Room> getAll() {

        return dao;
    }
}

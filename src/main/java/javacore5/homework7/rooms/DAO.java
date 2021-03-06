package javacore5.homework7.rooms;

public interface DAO {

    Room save(Room room);

    boolean delete(Room room);

    void update(Room room);

    Room findByID(long id);

    List<Room> getAll();
}

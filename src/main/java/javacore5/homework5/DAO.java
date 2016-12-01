package main.java.javacore5.homework5;

public interface DAO {

    Room save(Room room);

    boolean delete(Room room);

    Room update(Room room);

    Room findByID(long id);
}

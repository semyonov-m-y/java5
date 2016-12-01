package main.java.javacore5.homework5;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.requestRooms(1000, 1, "Landmark", "New York");
        controller.requestRooms(2000, 2, "Arlington", "Jackson");

        for (Room r : controller.requestRooms(1000, 1, "Landmark", "New York")) {
            System.out.println(r.getId());
        }

        API api1 = new BookingComAPI();
        API api2 = new GoogleAPI();

        controller.check(api1, api2);

        Room r1 = new Room(3, 5000, 1, new Date(), "hotel", "city");
        DAO dao = new DAOImpl();

        dao.save(r1);
        dao.delete(r1);
    }
}

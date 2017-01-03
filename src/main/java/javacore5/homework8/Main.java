package javacore5.homework8;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        User test = new User(1L, "Max");
        List<User> users = new ArrayList<>();
        long id = 2;

        users.add(new User(2L, "Slava"));
        users.add(new User(3L, "Lesha"));
        users.add(new User(4L, "Vasya"));
        users.add(new User(5L, "Alex"));
        users.add(new User(6L, "Ivan"));
        System.out.println("Users " + users);

        userDAO.save(test);
        System.out.println("Without users list " + userDAO.getList());

        userDAO.saveAll(users);
        System.out.println("Save users list " + userDAO.getList());

        userDAO.getById(id);
        System.out.println("Element with id " + id + " was obtained from DB " + userDAO.getById(id).toString());

        userDAO.deleteById(id);
        System.out.println("Element with id " + id + " was removed from DB ");

        userDAO.deleteAll(users);
        System.out.println("Delete users list " + userDAO.getList());

        userDAO.delete(test);
        System.out.println("DataBase without test " + userDAO.getList());
    }
}

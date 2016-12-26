package javacore5.homework8;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        User test = new User(1, "Max");
        List<User> user = new ArrayList<>();
        long id = 0;
        user.add(new User(2, "Alex"));

        userDAO.save(test);
        userDAO.delete(test);
        userDAO.deleteAll(user);
        userDAO.saveAll(user);
        userDAO.getList();
        userDAO.deleteById(id);
        userDAO.get(id);
    }
}

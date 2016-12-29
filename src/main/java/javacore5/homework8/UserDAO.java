package javacore5.homework8;

import java.util.Iterator;

public class UserDAO extends AbstractDAOImpl<User> {

    public UserDAO() {
        save(new User(1L, "Slava"));
        save(new User(2L, "Lesha"));
        save(new User(3L, "Vasya"));
    }

    @Override
    public User getById(long id) {
        for (User user : base) {
            if (user.getId() == id) {
                return user;
            }
        }

        return null;
    }

    @Override
    public void deleteById(long id) {
        Iterator<User> iterator = base.iterator();

        while (iterator.hasNext()) {
            User item = iterator.next();
            if (item.getId() == id) {
                iterator.remove();
            }
        }
    }
}

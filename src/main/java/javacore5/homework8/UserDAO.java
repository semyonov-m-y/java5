package javacore5.homework8;

public class UserDAO extends AbstractDAOImpl<User> {

    @Override
    public User getById(long id) {
        return getList().stream().filter(user -> user.getId() == id).findAny().orElse(null);
    }

    @Override
    public void deleteById(long id) {
        getList().removeIf(user -> user.getId() == id);
    }
}

package javacore5.homework8;

import java.util.List;
import java.util.Optional;

public class UserDAO extends AbstractDAOImpl<User> {

    @Override
    public Optional<User> getById(long id) {
        Optional<User> user = base.stream().filter(p -> p.getId() == id).findAny();
        return user;
    }

    @Override
    public void deleteById(long id) {
        base.removeIf(ourList -> ourList.getId() == id);
    }

    public List<User> getBase() {
        return base;
    }

    public void setBase(List<User> base) {
        this.base = base;
    }
}

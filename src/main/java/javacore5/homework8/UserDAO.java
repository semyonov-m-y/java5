package javacore5.homework8;

import java.util.List;

public class UserDAO extends AbstractDAOImpl<User> {

    @Override
    public User save(User user) {
        base.add(user);
        System.out.println(user.getName() + " was saved in DB");

        return user;
    }

    @Override
    public void delete(User user) {
        for (int i = 0; i < base.size(); i++) {
            if (base.get(i).equals(user)) {
                base.remove(i);
                System.out.println(user.getName() + " was removed from DB");
            }
        }
    }

    @Override
    public void deleteAll(List<User> user) {
        user.clear();
        System.out.println("All elements were removed from DB");
    }

    @Override
    public void saveAll(List<User> user) {
        base.addAll(user);
        System.out.println("All elements from list were added in DB");
    }

    @Override
    public List<User> getList() {
        for (int i = 0; i < base.size(); i++) {
            System.out.println(base.get(i));
        }

        return base;
    }

    @Override
    public void deleteById(long id) {
        base.remove(id);
        System.out.println("Element with id " + id + " was removed from DB");
    }

    @Override
    public User get(long id) {
        for (User user : base) {
            if (user.getId()==id) {
                return user;
            }
        }

        return null;
    }
}

package javacore5.homework8;

import java.util.List;

public interface AbstractDAO<T> {

    T save(T t);

    void delete(T t);

    void deleteAll(List<T> T);

    void saveAll(List<T> T);

    List<T> getList();

    void deleteById(long id);

    T get(long id);

    void delete(User user);

    User save(User user);
}

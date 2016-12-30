package javacore5.homework8;

import java.util.List;
import java.util.Optional;

public interface AbstractDAO<T> {

    T save(T element);

    void delete(T element);

    void deleteAll(List<T> element);

    void saveAll(List<T> element);

    List<T> getList();

    void deleteById(long id);

    Optional<User> getById(long id);
}

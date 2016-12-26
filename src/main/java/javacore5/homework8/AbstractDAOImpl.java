package javacore5.homework8;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractDAOImpl<T> implements AbstractDAO<T> {

    List<T> base = new ArrayList<>();

    @Override
    public T save(T aSave) {
        for (int i = 0; i < 10; i++) {
            base.add(aSave);
        }
        return null;
    }

    @Override
    public void delete(T aSave) {
        base.remove(0);
    }

    @Override
    public void deleteAll(List<T> list) {
        base.clear();
    }

    @Override
    public void saveAll(List<T> list) {
        list.addAll(base);
    }

    @Override
    public List<T> getList() {
        return base;
    }

    @Override
    public abstract void deleteById(long id);

    @Override
    public abstract T get(long id);
}

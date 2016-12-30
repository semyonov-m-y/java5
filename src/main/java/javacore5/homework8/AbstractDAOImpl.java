package javacore5.homework8;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractDAOImpl<T> implements AbstractDAO<T> {

    protected List<T> base = new ArrayList<>();

    @Override
    public T save(T element) {
        base.add(element);
        return element;
    }

    @Override
    public void delete(T element) {
        base.remove(element);
    }

    @Override
    public void deleteAll(List<T> list) {
        base.removeAll(list);
    }

    @Override
    public void saveAll(List<T> list) {
        base.addAll(list);
    }

    @Override
    public List<T> getList() {
        return base;
    }
}

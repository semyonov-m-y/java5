package javacore5.homework8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class AbstractDAOImpl<T> implements AbstractDAO<T> {

    List<T> base = new ArrayList<>();

    public List<T> getBase() {
        return base;
    }

    public void setBase(List<T> base) {
        this.base = base;
    }

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
        Iterator<T> iterator = base.iterator();

        while (iterator.hasNext()) {
            T item = iterator.next();
            iterator.remove();
        }
    }

    @Override
    public void saveAll(List<T> list) {
        base.addAll(list);
    }

    @Override
    public List<T> getList() {
        for (int i = 0; i < base.size(); i++) {
            base.get(i);
        }

        return base;
    }
}

package main.java.com.Alexandr.practice.modul08.task01;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 05.08.2017.
 */
public class AbstractDAOimp<T> implements AbstractDAO<T> {
    List<T> list = new ArrayList<>();
    public void save(T t) {
        list.add(t);
    }

    public void delete(T t) {
        list.remove(t);
    }

    public void deleteAll(List T) {
        list.removeAll(T);
    }

    public void saveAll(List T) {
        list.addAll(T);
    }

    public List<T> getList() {
        return list;
    }

    public void deleteById(long id) {
        list.remove(id);

    }

    public T get(long id) {
        return list.get((int )id);
    }
}

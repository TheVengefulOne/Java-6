package main.java.com.Alexandr.practice.modul08.task01;

import java.util.List;

/**
 * Created by admin on 05.08.2017.
 */
public interface AbstractDAO<T> {
    void save (T t);
    void delete(T t);
    void deleteAll(List T);
    void saveAll(List T);
    List<T> getList();
    void deleteById(long id);
    T get(long id);
}

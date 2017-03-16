package main.java.com.Alexandr.practice.modul05.task01;

/**
 * Created by admin on 15.03.2017.
 */
public interface DAO {
    Room save(Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);
}

package main.java.com.Alexandr.practice.modul05.task01;

import java.util.Date;

/**
 * Created by admin on 15.03.2017.
 */
public class DAOimp implements DAO {
    @Override
    public Room save(Room room) {
        System.out.println("Room " + room.getId() + "is saved");
        return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println("Room " + room + "is saved");
        return true;
    }

    @Override
    public Room update(Room room) {
        System.out.println("Room "+room+" is updated");
        return room;
    }

    @Override
    public Room findById(long id) {
        Room room = new Room(20, 300, 2,new Date(),"hotel", "city");
        System.out.println("Searching room by id number :"+id);
        return room;
    }
}

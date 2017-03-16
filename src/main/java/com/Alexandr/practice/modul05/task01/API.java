package main.java.com.Alexandr.practice.modul05.task01;

/**
 * Created by admin on 15.03.2017.
 */
public interface API {
    Room[] findRooms (int price, int persons, String city, String hotel);
    Room[] getRooms();

}

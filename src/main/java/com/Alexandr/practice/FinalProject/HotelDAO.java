package main.java.com.Alexandr.practice.FinalProject;

/**
 * Created by admin on 06.05.2017.
 */
public interface HotelDAO {
    void addHotel(Hotel hotel);
    void editDateHotel (Hotel hotel);
    void addRoomInHotel (Room room, Hotel hotel);
    void deleteRoomFromHotel(Room room, Hotel hotel);
    boolean deleteHotel (Hotel hotel);


}

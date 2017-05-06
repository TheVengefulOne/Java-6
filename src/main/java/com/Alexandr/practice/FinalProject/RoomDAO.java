package main.java.com.Alexandr.practice.FinalProject;

/**
 * Created by admin on 06.05.2017.
 */
public interface RoomDAO {
    void editDateRoom (Room room);
    void findRoomByHotel (Room room, Hotel hotel);
    void bookingRoomToTheUsername (Room room, User user);
    void cancelBookingRoom (Room room);


}

package main.java.com.Alexandr.practice.modul05.task01;

/**
 * Created by admin on 15.03.2017.
 */
public abstract class AbstrcatAPI implements API {

    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int count = 0;
        for (Room r : getRooms()) {
            if (r.getPrice() == price && r.getPersons() == persons && r.getCityName() == city && r.getHotelName() == hotel) {
                count++;
            }
        }

        Room[] res = new Room[count];

        int index = 0;
        for (Room r : getRooms()) {
            if (r.getPrice() == price && r.getPersons() == persons && r.getCityName() == city && r.getHotelName() == hotel) {
                res[index] = r;
            }
        }
        return res;

    }

}

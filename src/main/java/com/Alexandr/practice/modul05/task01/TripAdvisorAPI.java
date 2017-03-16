package main.java.com.Alexandr.practice.modul05.task01;

import java.util.Date;

/**
 * Created by admin on 15.03.2017.
 */
public class TripAdvisorAPI extends AbstrcatAPI {
    Room[] tripRooms;

    public TripAdvisorAPI(){
        tripRooms = new Room[5];
        tripRooms[0] = new Room(1111111,100,1, new Date(),"Україна", "Liev");
        tripRooms[1] = new Room(1111112,200,2, new Date(),"The Peninsula","Bangkok");
        tripRooms[2] = new Room(1111113, 300,3, new Date(),"Badrutt`s Palace","Greezon");
        tripRooms[3] = new Room(1111114,400,4, new Date(), "Baur au Lac","Zurich");
        tripRooms[4] = new Room(1111115,500, 5, new Date(),"Brenner`s park hotel & SPA","Baden-württemberg");
    }

    @Override
    public Room[] getRooms() {
        return tripRooms;
    }
}


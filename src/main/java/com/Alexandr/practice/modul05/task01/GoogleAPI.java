package main.java.com.Alexandr.practice.modul05.task01;

import java.util.Date;

/**
 * Created by admin on 15.03.2017.
 */
public class GoogleAPI extends AbstrcatAPI{
    Room[] googleRooms;

    public GoogleAPI(){
        googleRooms = new Room[5];
        googleRooms[0] = new Room(1111111,100,1, new Date(),"Україна", "Liev");
        googleRooms[1] = new Room(1111112,200,2, new Date(),"The Peninsula","Bangkok");
        googleRooms[2] = new Room(1111113, 300,3, new Date(),"Badrutt`s Palace","Greezon");
        googleRooms[3] = new Room(1111114,400,4, new Date(), "Baur au Lac","Zurich");
        googleRooms[4] = new Room(1111115,500, 5, new Date(),"Brenner`s park hotel & SPA","Baden-württemberg");
    }


    public Room[] getRooms() {
        return googleRooms;
    }
}

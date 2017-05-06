package main.java.com.Alexandr.practice.FinalProject;

/**
 * Created by admin on 05.05.2017.
 */
public abstract class AbstractAPI implements API {
    public Room[] findRooms (int price, int persons){
        int count = 0;
        for (Room r : getRooms()){
            if (r.getPrice() == price && r.getPersons() == persons){
                count++;
            }
        }

        return new Room[0];
    }
}

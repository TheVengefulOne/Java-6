package main.java.com.Alexandr.practice.FinalProject;

import java.util.Date;

/**
 * Created by admin on 05.05.2017.
 */
public class Room {
    private long id;
    private int persons;
    private int price;
    private Date dateAvailableFrom;
    private Date date;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Room room = (Room) o;

        if (id != room.id) return false;
        if (persons != room.persons) return false;
        if (price != room.price) return false;
        if (dateAvailableFrom != null ? !dateAvailableFrom.equals(room.dateAvailableFrom) : room.dateAvailableFrom != null)
            return false;
        return date != null ? date.equals(room.date) : room.date == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + persons;
        result = 31 * result + price;
        result = 31 * result + (dateAvailableFrom != null ? dateAvailableFrom.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }

    public long getId() {

        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getDateAvailableFrom() {
        return dateAvailableFrom;
    }

    public void setDateAvailableFrom(Date dateAvailableFrom) {
        this.dateAvailableFrom = dateAvailableFrom;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Room(long id, int persons, int price, Date dateAvailableFrom, Date date) {

        this.id = id;
        this.persons = persons;
        this.price = price;
        this.dateAvailableFrom = dateAvailableFrom;
        this.date = date;
    }
}

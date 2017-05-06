package main.java.com.Alexandr.practice.FinalProject;

/**
 * Created by admin on 05.05.2017.
 */
public class Hotel {
    private String hotelName;
    private String hotelCountry;
    private int price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hotel hotel = (Hotel) o;

        if (price != hotel.price) return false;
        if (hotelName != null ? !hotelName.equals(hotel.hotelName) : hotel.hotelName != null) return false;
        return hotelCountry != null ? hotelCountry.equals(hotel.hotelCountry) : hotel.hotelCountry == null;
    }

    @Override
    public int hashCode() {
        int result = hotelName != null ? hotelName.hashCode() : 0;
        result = 31 * result + (hotelCountry != null ? hotelCountry.hashCode() : 0);
        result = 31 * result + price;
        return result;
    }

    public Hotel(String hotelName, String hotelCountry, int price) {

        this.hotelName = hotelName;
        this.hotelCountry = hotelCountry;
        this.price = price;
    }

    public String getHotelName() {

        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelCountry() {
        return hotelCountry;
    }

    public void setHotelCountry(String hotelCountry) {
        this.hotelCountry = hotelCountry;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

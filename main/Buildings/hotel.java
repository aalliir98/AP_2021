package main.Buildings;

import main.city;
import main.country;
import main.exception.invalid_hotel;

import java.util.ArrayList;

public class hotel {
    public String Hotel_name, city_name;
    public ArrayList<hotel_facilities> hotel_facility = new ArrayList<>();
    int cost = 700;
    public String address;
    public int star;
    public int rooms;
    public ArrayList<room> room = new ArrayList<>();

    public hotel(String city_name, String hotel_name, String address, int star, int rooms) {
        this.city_name = city_name;
        Hotel_name = hotel_name;
        this.address = address;
        this.star = star;
        this.rooms = rooms;
        for (city i : country.cities)
            for (hotel a : i.hotels)
                if (a.Hotel_name.equals(hotel_name)) {
                    i.money = i.money - cost;
                    break;
                }
        main.main.error(star, '9', '0', "your input number is wrong");
        main.main.error(rooms, '9', '0', "your input number is wrong");

    }

    public static void hotel_error(String hotel_name, String city_name) {
        int y =0;
        for (city i : country.cities)
            if (i.city_name.equals(city_name))
                for (hotel a : i.hotels)
                    if (a.Hotel_name.equals(hotel_name))
                        y = 1;
                    if (y==0)
                        throw new invalid_hotel( "your hotel doesn't exist.");
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public String getHotel_name() {
        return Hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        Hotel_name = hotel_name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public void setHotel_facilities(hotel_facilities a) {
        this.hotel_facility.add(a);
    }

    public ArrayList<room> getRoom() {
        return room;
    }

    public void setRoom(room a) {
        room.add(a);
    }

    public enum hotel_facilities {
        breakfast, food, pool
    }
}

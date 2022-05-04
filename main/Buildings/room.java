package main.Buildings;

import main.city;
import main.country;

public class room {
    public int room_number;
    public int beds;
    public int area;
    public int price;
    String hotel_name, city_name;

    public room(int room_number, int beds, int area, String hotel, int price, String city_name) {
        this.room_number = room_number;
        this.beds = beds;
        this.area = area;
        this.city_name = city_name;
        for (city i : country.cities)
            for (hotel a : i.hotels)
                if (a.Hotel_name.equals(hotel)) {
                    i.money = i.money - price;
                    break;
                }
        this.hotel_name = hotel;
        this.price = price;
        main.main.error(room_number, '9', '0', "your input number is wrong");
        main.main.error(beds, '9', '0', "your input number is wrong");
        main.main.city_error(city_name);
        main.main.error(area, '9', '0', "your input number is wrong");
        main.main.error(price, '9', '0', "your input number is wrong");

    }

    public int getRoom_number() {
        return room_number;
    }

    public int getBeds() {
        return beds;
    }

    public int getArea() {
        return area;
    }

    public int getPrice() {
        return price;
    }
}

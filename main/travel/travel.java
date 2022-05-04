package main.travel;

import main.Buildings.*;
import main.Vehicles.Vehicle;
import main.city;
import main.country;
import main.exception.invalid_driver;
import main.exception.invalid_id;
import main.exception.invalid_passengers;
import main.person;

import java.util.ArrayList;

public class travel implements Comparable<travel> {
    public String destination_terminal;
    public String Origin_terminal;
    public ArrayList<person> passenger_list;
    public String driver;
    public String vehicle;
    public int ID;
    public String travel_date;//day/month/year -> dd/mm/yy
    public int travel_cost;
    public String destination_city, Origin_city;
    public int w;

    public travel(String destination_terminal, String origin_terminal, String destination_city, ArrayList<person> passenger_list, String driver, int ID, String vehicle, String travel_date, String origin_city, int w) {
        this.destination_terminal = destination_terminal;
        Origin_terminal = origin_terminal;
        this.passenger_list = passenger_list;
        this.driver = driver;
        this.vehicle = vehicle;
        this.ID = ID;
        this.travel_date = travel_date;
        this.destination_city = destination_city;
        this.Origin_city = origin_city;
        this.w = w;
        travel_error(w);
    }

    public void travel_error(int z) {
        switch (z) {
            case 1:
                airport.trminal_error(destination_terminal, destination_city);
                airport.trminal_error(Origin_terminal, Origin_city);
                int x = 0, q = 0;
                for (city i : country.cities)
                    if (i.city_name.equals(Origin_city))
                        for (terminal j : i.airport1)
                            if (j.terminal_name.equals(Origin_terminal)) {
                                for (Vehicle r : ((airport) j).air_vehicle) {
                                    if (ID == r.id)
                                        q++;
                                    if (ID == r.id && passenger_list.size() < r.capacity / 2)
                                        throw new invalid_passengers("passengers are not enough.");
                                }
                                for (person a : j.leader)
                                    if (a.name.equals(driver))
                                        x++;
                            }
                if (x == 0)
                    throw new invalid_driver("there is no driver with this name.");
                if (q == 0)
                    throw new invalid_id("there is no vehicle with this id.");
                break;
            case 2:
                Bus_terminal.trminal_error(destination_terminal, destination_city);
                Bus_terminal.trminal_error(Origin_terminal, Origin_city);
                x = 0;
                q = 0;
                for (city i : country.cities)
                    if (i.city_name.equals(Origin_city))
                        for (terminal j : i.Bus_terminal1)
                            if (j.terminal_name.equals(Origin_terminal)) {
                                for (Vehicle r : ((Bus_terminal) j).bus) {
                                    if (ID == r.id)
                                        q++;
                                    if (ID == r.id && passenger_list.size() < r.capacity / 2)
                                        throw new invalid_passengers("passengers are not enough.");
                                }
                                for (person a : j.leader)
                                    if (a.name.equals(driver))
                                        x++;
                            }
                if (x == 0)
                    throw new invalid_driver("there is no driver with this name.");
                if (q == 0)
                    throw new invalid_id("there is no vehicle with this id.");
                break;
            case 3:
                shipping_port.trminal_error(destination_terminal, destination_city);
                shipping_port.trminal_error(Origin_terminal, Origin_city);
                x = 0;
                q = 0;
                for (city i : country.cities)
                    if (i.city_name.equals(Origin_city))
                        for (terminal j : i.shipping_port1)
                            if (j.terminal_name.equals(Origin_terminal)) {
                                for (Vehicle r : ((shipping_port) j).shipboat) {
                                    if (ID == r.id)
                                        q++;
                                    if (ID == r.id && passenger_list.size() < r.capacity / 2)
                                        throw new invalid_passengers("passengers are not enough.");
                                }
                                for (person a : j.leader)
                                    if (a.name.equals(driver))
                                        x++;
                            }
                if (x == 0)
                    throw new invalid_driver("there is no driver with this name.");
                if (q == 0)
                    throw new invalid_id("there is no vehicle with this id.");
                break;
            case 4:
                train_station.trminal_error(destination_terminal, destination_city);
                train_station.trminal_error(Origin_terminal, Origin_city);
                x = 0;
                q = 0;
                for (city i : country.cities)
                    if (i.city_name.equals(Origin_city))
                        for (terminal j : i.train_station1)
                            if (j.terminal_name.equals(Origin_terminal)) {
                                for (Vehicle r : ((train_station) j).train) {
                                    if (ID == r.id)
                                        q++;
                                    if (ID == r.id && passenger_list.size() < r.capacity / 2)
                                        throw new invalid_passengers("passengers are not enough.");
                                }
                                for (person a : j.leader)
                                    if (a.name.equals(driver))
                                        x++;
                            }
                if (x == 0)
                    throw new invalid_driver("there is no driver with this name.");
                if (q == 0)
                    throw new invalid_id("there is no vehicle with this id.");
                break;
        }
        main.main.city_error(destination_city);
        main.main.city_error(Origin_city);
    }

    @Override
    public int compareTo(travel b) {
        int y = 0;
        for (int i = 1; i < 9; i = i + 3) {
            if (travel_date.charAt(travel_date.length() - i) + travel_date.charAt(travel_date.length() - (i + 1)) > b.travel_date.charAt(b.travel_date.length() - i) + (b.travel_date.charAt(b.travel_date.length() - (i + 1))))
                return 1;
            if (travel_date.charAt(travel_date.length() - i) + travel_date.charAt(travel_date.length() - (i + 1)) < b.travel_date.charAt(b.travel_date.length() - i) + (b.travel_date.charAt(b.travel_date.length() - (i + 1))))
                return -1;
            y++;
        }

        if (y == 3) {
            if (this.travel_cost > b.travel_cost)
                return 1;
            if (this.travel_cost < b.travel_cost)
                return -1;
            if (b.travel_cost == this.travel_cost)
                return 0;

        }
        return -100000;
    }
}

package main.Buildings;

import main.Vehicles.Vehicle;
import main.city;
import main.country;
import main.exception.invalid_terminal;
import main.person;
import main.travel.travel;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class airport extends terminal {
    public ArrayList<Vehicle> air_vehicle = new ArrayList<>();
    public boolean type;
    public int Runway;

    public airport(boolean type, int runway, String city_name, String terminal_name, String address, int area) {

        super(city_name, terminal_name, address, area);
        main.main.error(runway, '9', '0', "your input runway is wrong.");
        main.main.city_error(city_name);
        main.main.error(area, '9', '0', "your input area is wrong.");

        for (city city : country.cities)
            if (city_name.equals(city.city_name)) {
                city.money = city.money - 1800;
                break;
            }
        this.type = type;
        Runway = runway;


    }

    public static void trminal_error(String terminal_name, String city_name) {
        int x = 0;
        for (city i : country.cities)
            if (i.city_name.equals(city_name))
                for (terminal a : i.airport1)
                    if (a.terminal_name.equals(terminal_name))
                        x++;
        if (x == 0)
            throw new invalid_terminal("your terminal doesn't exist.");
    }


    public ArrayList<Vehicle> getAir_vehicle() {
        return air_vehicle;
    }

    public void setAir_vehicle(Vehicle a) {
        air_vehicle.add(a);
    }

    public int getRunway() {
        return Runway;
    }

    public boolean isType() {
        return type;
    }

    @Override
    public void add_travel(travel a) {
        this.getOut_travels().add(a);
        for (city j : country.cities)
            for (terminal i : j.airport1)
                if (a.destination_terminal.equals(i.terminal_name))
                    i.getIn_travels().add(a);
    }

    @Override
    public void arrange_travel() {
        Collections.sort(in_travels);
        Collections.sort(out_travels);
    }

    @Override
    public int travel_cost(ArrayList<person> passenger, String vehicle) {
        int money = -1;
        switch (vehicle) {
            case "airliner":
                money = passenger.size() * 6;
                break;
            case "cargo plane":
                money = passenger.size() * 5;
                break;
        }
        return money;
    }

    @Override
    public void travel_history() {
        arrange_travel();
        if (this.getIn_travels().size() == 0)
            JOptionPane.showMessageDialog(new JDialog(),"there is no in travel");
        else {
            JOptionPane.showMessageDialog(new JDialog(),"in travels: ");
            for (travel a : this.getIn_travels())
                JOptionPane.showMessageDialog(new JDialog(),"Origin terminal's name: " + a.Origin_terminal + "\norigin city: " + a.Origin_city + "\ndestination terminal's name: " + a.destination_terminal + "\ndestination city's name: " + a.destination_city + "\ntravel cost: " + a.travel_cost + "\ntravel date: " + a.travel_date + "\ndriver's name: " + a.driver + "\nid: " + a.ID + "\n|vehicle's name: " + a.vehicle);
        }
        if (this.getOut_travels().size() == 0)
            JOptionPane.showMessageDialog(new JDialog(),"there is no out travel");
        else {
            JOptionPane.showMessageDialog(new JDialog(),"out travels: ");
            for (travel a : this.getOut_travels())
                JOptionPane.showMessageDialog(new JDialog(),"Origin terminal's name: " + a.Origin_terminal + "\norigin city: " + a.Origin_city + "\ndestination terminal's name: " + a.destination_terminal + "\ndestination city's name: " + a.destination_city + "\ntravel cost: " + a.travel_cost + "\ntravel date: " + a.travel_date + "\ndriver's name: " + a.driver + "\nid: " + a.ID + "\n|vehicle's name: " + a.vehicle);
        }
    }
}


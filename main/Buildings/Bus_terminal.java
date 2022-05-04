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

public class Bus_terminal extends terminal {

    public ArrayList<Vehicle> bus = new ArrayList<>();
    int nbus = bus.size();

    public Bus_terminal(String city_name, String terminal_name, String address, int area) {
        super(city_name, terminal_name, address, area);
        for (city city : country.cities)
            if (city_name.equals(city.city_name)) {
                city.money = city.money - 900;
                break;
            }
        main.main.error(area, '9', '0', "your input area is wrong.");
        main.main.city_error(city_name);

    }

    public static void trminal_error(String terminal_name, String city_name) {
        int x = 0;
        for (city i : country.cities)
            if (i.city_name.equals(city_name))
                for (terminal a : i.Bus_terminal1)
                    if (a.terminal_name.equals(terminal_name))
                        x++;
        if (x == 0)
            throw new invalid_terminal("your terminal doesn't exist.");
    }

    @Override
    public String getCity_name() {
        return super.getCity_name();
    }


    public ArrayList<Vehicle> getBus() {
        return bus;
    }

    public void setBus(Vehicle a) {
        bus.add(a);
    }

    @Override
    public void add_travel(travel a) {
        this.getOut_travels().add(a);
        for (city j : country.cities)
            for (terminal i : j.Bus_terminal1)
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
        return passenger.size() * 2;
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

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

public class shipping_port extends terminal {
    public ArrayList<Vehicle> shipboat = new ArrayList<>();
    public int nshipboat = shipboat.size();
    public int wharf;
    public String city_name;

    public shipping_port(int wharf, String city_name, String terminal_name, String address, int area) {
        super(city_name, terminal_name, address, area);
        this.wharf = wharf;
        this.city_name = city_name;
        for (city city : country.cities)
            if (city_name.equals(city.city_name)) {
                city.money = city.money - 1400;
                break;
            }
        main.main.error(wharf, '9', '0', "your input wharf is wrong.");
        main.main.city_error(city_name);
        main.main.error(area, '9', '0', "your input area is wrong.");
    }

    public static void trminal_error(String terminal_name, String city_name) {
        int x = 0;
        for (city i : country.cities)
            if (i.city_name.equals(city_name))
                for (terminal a : i.shipping_port1)
                    if (a.terminal_name.equals(terminal_name))
                        x++;
        if (x == 0)
            throw new invalid_terminal("your terminal doesn't exist.");
    }


    @Override
    public ArrayList<travel> getOut_travels() {
        return super.getOut_travels();
    }

    public int getWharf() {
        return wharf;
    }

    public ArrayList<Vehicle> getShipboat() {
        return shipboat;
    }

    public void setShipboat(Vehicle a) {
        shipboat.add(a);
    }

    @Override
    public String getCity_name() {
        return super.getCity_name();
    }


    @Override
    public void add_travel(travel a) {
        this.getOut_travels().add(a);
        for (city j : country.cities)
            for (terminal i : j.shipping_port1)
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
            case "boat":
                money = passenger.size() * 2;
                break;
            case "ship":
                money = passenger.size() * 4;
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

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

public class train_station extends terminal {
    public ArrayList<Vehicle> train = new ArrayList<Vehicle>();
    int ntrain = train.size();
    public int input_rails;
    public int output_rails;

    public train_station(int input_rails, int output_rails, String city_name, String terminal_name, String address, int area) {
        super(city_name, terminal_name, address, area);
        this.input_rails = input_rails;
        this.output_rails = output_rails;
        for (city city : country.cities)
            if (city_name.equals(city.city_name)) {
                city.money = city.money - 1000;
                break;
            }
        main.main.error(input_rails, '9', '0', "your input input rails is wrong.");
        main.main.error(output_rails, '9', '0', "your input output rails is wrong.");
        main.main.city_error(city_name);
        main.main.error(area, '9', '0', "your input area is wrong.");
    }

    public static void trminal_error(String terminal_name, String city_name) {
        int x = 0;
        for (city i : country.cities)
            if (i.city_name.equals(city_name))
                for (terminal a : i.train_station1)
                    if (a.terminal_name.equals(terminal_name))
                        x++;
        if (x == 0)
            throw new invalid_terminal("your terminal doesn't exist.");
    }


    public int getInput_rails() {
        return input_rails;
    }

    public int getOutput_rails() {
        return output_rails;
    }

    public ArrayList<Vehicle> getTrain() {
        return train;
    }

    public void setTrain(Vehicle a) {
        train.add(a);
    }

    @Override
    public void add_travel(travel a) {
        this.getOut_travels().add(a);
        for (city j : country.cities)
            for (terminal i : j.train_station1)
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
        return passenger.size() * 3;
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

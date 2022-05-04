package main.Buildings;

import main.person;
import main.travel.travable;
import main.travel.travel;

import java.util.ArrayList;

public abstract class terminal implements travable {
    public String city_name;
    public String terminal_name;
    public String address;
    public int area;
    public int number_of_vehicles;
    public ArrayList<person> leader = new ArrayList<>();
    public int nleader = leader.size();
    public ArrayList<person> crew = new ArrayList<>();
    public ArrayList<travel> in_travels = new ArrayList<>();
    public ArrayList<travel> out_travels = new ArrayList<>();

    public terminal(String city_name, String terminal_name, String address, int area) {
        this.city_name = city_name;
        this.terminal_name = terminal_name;
        this.address = address;
        this.area = area;

    }


    public ArrayList<travel> getIn_travels() {
        return in_travels;
    }

    public ArrayList<travel> getOut_travels() {
        return out_travels;
    }

    public String getCity_name() {
        return city_name;
    }

    public String getTerminal_name() {
        return terminal_name;
    }

    public String getAddress() {
        return address;
    }

    public int getArea() {
        return area;
    }

    public ArrayList<person> getLeader() {
        return leader;
    }

    public void setLeader(person a) {
        leader.add(a);
    }

    public void setCrew(person a) {
        crew.add(a);
    }

}

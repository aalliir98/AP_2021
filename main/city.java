package main;

import main.Buildings.*;
import main.Vehicles.Vehicle;
import main.bank.bank;
import main.exception.*;

import javax.swing.*;
import java.util.ArrayList;

public class city {

    public ArrayList<terminal> Bus_terminal1 = new ArrayList<>();
    public ArrayList<terminal> airport1 = new ArrayList<>();
    public ArrayList<terminal> train_station1 = new ArrayList<>();
    public ArrayList<terminal> shipping_port1 = new ArrayList<>();
    public ArrayList<person> citizens = new ArrayList<>();
    public ArrayList<hotel> hotels = new ArrayList<>();
    public ArrayList<bank> banks = new ArrayList<>();
    public int population = 20;
    public int money;
    public String city_name;
    int y = 1;

    public city(int money, String city_name) {
        this.money = money;
        this.city_name = city_name;
        main.error(money, '9', '0', "your input number is wrong.");
        main.error(city_name, 'z', 'a', "your input city name is wrong.");
    }

    static void print(person w) {
        JOptionPane.showMessageDialog(new JDialog(),"name: " + w.name +"\n"+ "family name: " + w.family_name +"\n"+"gender: " + w.Gender +
                "\n"+"job: " + w.job +"\n"+"year of birth: " + w.Year_of_Birth +"\n"+"city of birth: " + w.city_of_birth +"\n"+"salary: " + w.salary +"\n"+"id: " + w.id);
    }

    public ArrayList<person> getCitizens() {
        return citizens;
    }

    public void setBus_terminal1(Bus_terminal bus_terminal1) {
        Bus_terminal1.add(bus_terminal1);
    }

    public void setAirport(airport a) {
        this.airport1.add(a);
    }

    public void setTrain_station(train_station a) {
        train_station1.add(a);
    }

    public void setShipping_port(shipping_port a) {
        this.shipping_port1.add(a);
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public airport getAirport(String name) {
        airport w = null;
        for (terminal t : this.airport1)
            if (t.getTerminal_name().equals(name))
                w = (airport) t;
        return w;
    }

    public Bus_terminal getBus_terminal1(String name) {
        Bus_terminal w = null;
        for (terminal t : Bus_terminal1)
            if (t.getTerminal_name().equals(name))
                w = (Bus_terminal) t;
        return w;
    }

    public shipping_port getShipping_port1(String name) {
        shipping_port w = null;

        for (terminal t : this.shipping_port1)
            if (t.getTerminal_name().equals(name))
                w = (shipping_port) t;
        return w;
    }

    public train_station getTrain_station1(String name) {
        train_station w = null;
        for (terminal t : train_station1)
            if (t.getTerminal_name().equals(name))
                w = (train_station) t;
        return w;
    }

    public void showpeople(int a) {
        switch (a) {
            case 1:
                for (person w : citizens)
                    if (w.getJob().equals("sailor"))
                        print(w);
                break;
            case 2:
                for (person w : citizens)
                    if (w.getJob().equals("pilot"))
                        print(w);
                break;
            case 3:
                for (person w : citizens)
                    if (w.getJob().equals("Bus driver"))
                        print(w);
                break;
            case 4:
                for (person w : citizens)
                    if (w.getJob().equals("Locomotive"))
                        print(w);
                break;
            case 5:
                for (person w : citizens)
                    if (w.getJob().equals("Crew"))
                        print(w);
                break;
        }

    }

    public void setleader(int id, int a, String name, city city) {
        main.error(id, '9', '0', "your input id is wrong.");

        main.city_error(city.city_name);
        switch (a) {
            case 1:
                shipping_port.trminal_error(name, city.city_name);
                Boolean flag = true;
                if (money > 100) {
                    for (person w : citizens) {
                        if (w.id == id)
                            for (terminal q : shipping_port1)
                                if (q.getTerminal_name().equals(name)) {
                                    q.setLeader(w);
                                    money = money - w.salary;
                                    citizens.remove(w);
                                    flag = false;
                                    JOptionPane.showMessageDialog(new JDialog(),"leader hired");
                                    break;

                                }
                        if (!flag)
                            break;
                    }
                } else
                    throw new invalid_money( "your money is not enough.");
                break;
            case 2:
                airport.trminal_error(name, city.city_name);
                Boolean flag1 = true;
                if (money > 120) {
                    for (person w : citizens) {
                        if (w.id == id)
                            for (terminal q : airport1)
                                if (q.getTerminal_name().equals(name)) {
                                    q.setLeader(w);
                                    money = money - w.salary;
                                    citizens.remove(w);
                                    JOptionPane.showMessageDialog(new JDialog(),"leader hired");
                                    flag1 = false;
                                    break;
                                }
                        if (flag1 == false)
                            break;
                    }
                } else
                    throw new invalid_money("your money is not enough.");
                break;
            case 3:
                Bus_terminal.trminal_error(name, city.city_name);
                Boolean flag2 = true;
                if (money > 100) {
                    for (person w : citizens) {
                        if (w.id == id)
                            for (terminal q : Bus_terminal1)
                                if (q.getTerminal_name().equals(name)) {
                                    q.setLeader(w);
                                    money = money - w.salary;
                                    citizens.remove(w);
                                    JOptionPane.showMessageDialog(new JDialog(),"leader hired");
                                    flag2 = false;
                                    break;
                                }
                        if (flag2 == false)
                            break;
                    }
                } else
                    throw new invalid_money( "your money is not enough.");
                break;
            case 4:
                train_station.trminal_error(name, city.city_name);
                Boolean flag3 = true;
                if (money > 100) {
                    for (person w : citizens) {
                        if (w.id == id)
                            for (terminal q : train_station1)
                                if (q.getTerminal_name().equals(name)) {
                                    q.setLeader(w);
                                    money = money - w.salary;
                                    citizens.remove(w);
                                    flag3 = false;
                                    JOptionPane.showMessageDialog(new JDialog(),"leader hired");
                                    break;
                                }
                        if (flag3 == false)
                            break;
                    }
                } else
                    throw new invalid_money( "your money is not enough.");
                break;
            case 5:
                Boolean flag4 = true;
                if (money > 60) {
                    for (person w : citizens) {
                        if (w.id == id)
                            for (terminal q : airport1)
                                if (q.getTerminal_name().equals(name)) {
                                    q.setCrew(w);
                                    money = money - w.salary;
                                    citizens.remove(w);
                                    flag4 = false;
                                    JOptionPane.showMessageDialog(new JDialog(),"leader hired");
                                    break;
                                }
                        if (flag4 == false)
                            break;
                    }
                } else
                    throw new invalid_money("your money is not enough.");
                break;
        }
    }

    public void terminals_information(int a) {
        main.error(a, '4', '1', "your input number is wrong.");
        switch (a) {
            case 1:
                for (terminal q : airport1) {
                    ArrayList<airport> w = new ArrayList<>();
                    w.add((airport) q);
                    for (airport r : w) {
                        JOptionPane.showMessageDialog(new JDialog(),"terminal name: " + r.getTerminal_name() + "\ncity name: " + r.getCity_name() + "\naddress: " +
                                r.getAddress() + "\ntype: " + r.isType() + "\nrunway: " + r.getRunway() + "\narea: " + r.getArea());

                        for (Vehicle e : r.getAir_vehicle()) {
                            JOptionPane.showMessageDialog(new JDialog(),"vehicle's id: " + e.getId() + "\ncompany: " + e.getCompany() + "\ncapacity: " + e.getCapacity());
                        }
                        for (person d : r.getLeader())
                            JOptionPane.showMessageDialog(new JDialog(), "leader's name: " + d.name + "\nfamily name: " + d.family_name + "\nyear of birth: " + "\nid: " + d.id +
                                    "\nyear of birth: " + d.Year_of_Birth +
                                    "\njob: " + d.job + "\ngender: " + d.Gender + "\nsalary: " + d.salary + "\ncity of birth: " + d.city_of_birth);
                    }
                }
                if (airport1.size() == 0)
                    throw new invalid_terminal("there is no airport.");
                break;
            case 2:
                for (terminal terminal : Bus_terminal1) {
                    ArrayList<Bus_terminal> bus_terminals = new ArrayList<>();
                    bus_terminals.add((Bus_terminal) terminal);
                    for (Bus_terminal r : bus_terminals) {
                        JOptionPane.showMessageDialog(new JDialog()," terminal name: " + r.getTerminal_name() + "\ncity name: " + r.getCity_name() + "\naddress: " +
                                r.getAddress() + "\narea: " + r.getArea());
                        for (Vehicle e : r.getBus()) {
                            JOptionPane.showMessageDialog(new JDialog(),"vehicle's id: " + e.getId() + "\ncompany: " + e.getCompany() + "\ncapacity: " + e.getCapacity());
                        }
                        for (person d : r.getLeader()) {
                            JOptionPane.showMessageDialog(new JDialog(), "leader's name: " + d.name + "\nfamily name: " + d.family_name + "\nyear of birth: " + "\nid: " + d.id +
                                    "\nyear of birth: " + d.Year_of_Birth +
                                    "\njob: " + d.job + "\ngender: " + d.Gender + "\nsalary: " + d.salary + "\ncity of birth: " + d.city_of_birth);}
                    }
                }
                if (Bus_terminal1.size() == 0)
                    throw new invalid_terminal( "there is no bus terminal.");
                break;
            case 3:
                for (terminal q : shipping_port1) {
                    ArrayList<shipping_port> w = new ArrayList<>();
                    w.add((shipping_port) q);
                    for (shipping_port r : w) {
                        JOptionPane.showMessageDialog(new JDialog(),"terminal name: " + r.getTerminal_name() + "\ncity name: " + r.getCity_name() + "\naddress: " +
                                r.getAddress() + "\nwharf: " + r.getWharf() + "\narea: " + r.getArea());
                        for (Vehicle e : r.getShipboat()) {
                            JOptionPane.showMessageDialog(new JDialog(),"vehicle's id: " + e.getId() + "\ncompany: " + e.getCompany() + "\ncapacity: " + e.getCapacity());
                        }
                        for (person d : r.getLeader()) {
                            JOptionPane.showMessageDialog(new JDialog(), "leader's name: " + d.name + "\nfamily name: " + d.family_name + "\nyear of birth: " + "\nid: " + d.id +
                                    "\nyear of birth: " + d.Year_of_Birth +
                                    "\njob: " + d.job + "\ngender: " + d.Gender + "\nsalary: " + d.salary + "\ncity of birth: " + d.city_of_birth);}
                    }
                }
                if (shipping_port1.size() == 0)
                    throw new invalid_terminal( "there is no shipping port.");
                break;
            case 4:
                for (terminal q : train_station1) {
                    ArrayList<train_station> w = new ArrayList<>();
                    w.add((train_station) q);
                    for (train_station r : w) {
                        JOptionPane.showMessageDialog(new JDialog(),"terminal name: " + r.getTerminal_name() + "\ncity name: " + r.getCity_name() + "\naddress: " +
                                r.getAddress() + "\ninput rails: " + r.getInput_rails() + "\noutput rails: " + r.getOutput_rails() + "\narea: " + r.getArea());
                        for (Vehicle e : r.getTrain()) {
                            JOptionPane.showMessageDialog(new JDialog(),"vehicle's id: " + e.getId() + "\ncompany: " + e.getCompany() + "\ncapacity: " + e.getCapacity());
                        }
                        for (person d : r.getLeader()) {
                            JOptionPane.showMessageDialog(new JDialog(), "leader's name: " + d.name + "\nfamily name: " + d.family_name + "\nyear of birth: " + "\nid: " + d.id +
                                    "\nyear of birth: " + d.Year_of_Birth + "\njob: " + d.job + "\ngender: " + d.Gender + "\nsalary: " + d.salary + "\ncity of birth: " + d.city_of_birth);
                        }
                    }
                }
                if (train_station1.size() == 0)
                    throw new invalid_terminal("there is no train station.");
                break;
        }
    }

    public void build_Hotel(hotel a) {
        hotels.add(a);
        JOptionPane.showMessageDialog(new JDialog(),"hotel built");
    }

    public void build_room(room r, String hotel_name) {
        for (hotel a : hotels) {
            if (a.getHotel_name().equals(hotel_name) & a.getRoom().size() < a.getRooms()) {
                a.setRoom(r);
                JOptionPane.showMessageDialog(new JDialog(),"room built");
            } else
                throw new invalid_capacity( "there is no capacity to build room for this hotel.");
        }
    }

    public void showhotel() {
        for (hotel a : hotels) {
            JOptionPane.showMessageDialog(new JDialog(),"hotel's name: " + a.getHotel_name() + "\naddress: " + a.getAddress() + "\ncost: " + a.getCost() +
                    "\nstar: " + a.getStar() + "\nnumber of rooms: " + a.getRooms());

            for (room q : a.getRoom()) {
                JOptionPane.showMessageDialog(new JDialog(),"room's number: " + q.getRoom_number() + "\narea: " + q.getArea() + "\nbeds: " + q.getBeds() + "\nprice: " + q.getPrice());
            }
        }
        if (hotels.size() == 0)
            JOptionPane.showMessageDialog(new JDialog(),"there is no hotel");

    }

    public void setCitizens() {
        person a = new person("ali", "rostami", 1381, "ilam", "pilot", "male", 120, y++);
        citizens.add(a);
        person b = new person("aida", "rahimi", 1376, "yazd", "pilot", "female", 120, y++);
        citizens.add(b);
        person c = new person("mamad", "dehghani", 1380, "Mashhad", "sailor", "male", 100, y++);
        citizens.add(c);
        person d = new person("zahra", "kohzadi", 1377, "rasht", "sailor", "female", 100, y++);
        citizens.add(d);
        person e = new person("alireza", "rahmani", 1379, "esfehan", "Bus driver", "male", 100, y++);
        citizens.add(e);
        person f = new person("kiana", "narimani", 1372, "tabriz", "Bus driver", "female", 100, y++);
        citizens.add(f);
        person g = new person("reza", "jafari", 1369, "boshehr", "Locomotive", "male", 100, y++);
        citizens.add(g);
        person h = new person("roya", "karimi", 1380, "ahvaz", "Locomotive", "female", 100, y++);
        citizens.add(h);
        person i = new person("mahdi", "yosefi", 1365, "zahedan", "Crew", "male", 60, y++);
        citizens.add(i);
        person j = new person("arshia", "sohani", 1354, "qom", "Crew", "male", 60, y++);
        citizens.add(j);
        person k = new person("yasamin", "tahmasebi", 1367, "uromia", "Crew", "female", 60, y++);
        citizens.add(k);
        person l = new person("leila", "abasi", 1378, "golestan", "Crew", "female", 60, y++);
        citizens.add(l);
        person m = new person("younes", "daraei", 1379, "kermanshah", "Crew", "male", 60, y++);
        citizens.add(m);
        person n = new person("taraneh", "mamadi", 1373, "kordestan", "Crew", "female", 60, y++);
        citizens.add(n);
        person o = new person("arian", "shakori", 1382, "lorestan", "Crew", "male", 60, y++);
        citizens.add(o);
        person p = new person("fatemeh", "fatemi", 1376, "karaj", "Crew", "female", 60, y++);
        citizens.add(p);
        person q = new person("abass", "boazar", 1387, "kerman", "no job", "male", 0, y++);
        citizens.add(q);
        person r = new person("ali", "daii", 1367, "neishabor", "no job", "male", 0, y++);
        citizens.add(r);
        person s = new person("ayda", "akbari", 1380, "sari", "no job", "female", 0, y++);
        citizens.add(s);
        person t = new person("elnaz", "varamini", 1369, "khoramshahr", "no job", "female", 0, y++);
        citizens.add(t);
    }
}
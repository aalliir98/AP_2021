package main;

import com.opencsv.*;
import main.Buildings.*;
import main.Vehicles.*;
import main.bank.*;
import main.exception.*;
import main.graphic.*;
import main.travel.*;

import javax.swing.*;
import java.io.*;
import java.util.*;

public class main {
    public static boolean flag = false;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int d = 0;
        load();
        do {
            country.budget = 0;
            country.population = 0;
            country.bank_budget = 0;
            for (city v : country.cities) {
                country.budget += v.money;
                country.population += v.population;
                for (bank o : v.banks)
                    country.bank_budget += o.money;
            }
            try {
                main_menu mainMenu = new main_menu();
                while (mainMenu.number==0)
                    Thread.sleep(250);
                int e = mainMenu.number;
                switch (e) {
                    case 1:
                        build_city buildCity = new build_city();
                        while (buildCity.work == null)
                            Thread.sleep(250);
                        city a;
                        if (buildCity.work.equals("ok")) {
                            a = new city(buildCity.money, buildCity.name);
                            country.cities.add(a);
                            JOptionPane.showMessageDialog(new JDialog(),"city built");
                        }
                        break;
                    case 2:
                        enter_city_menu enterCityMenu = new enter_city_menu();
                        while (enterCityMenu.work == null)
                            Thread.sleep(250);
                        if (enterCityMenu.work.equals("ok")) {
                            city_error(enterCityMenu.name);
                            for (city i : country.cities)
                                if (i.city_name.equals(enterCityMenu.name)) {
                                    city_menu(i);
                                    break;
                                }
                        }
                        break;
                    case 3:
                        for (city i : country.cities)
                            JOptionPane.showMessageDialog(new JDialog(), "city name: " + i.city_name +"\n"+ "population: " + i.population +"\n"+ "money: " + i.money);

                        if (country.cities.size() == 0)
                            throw new invalid_city("there is no city.");
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(new JDialog(),"bank budget: "+country.bank_budget+"\n"+ "budget: " + country.budget +"\n"+ "population: " + country.population);
                        break;
                    case 7:
                        flag = true;
                        enter enter = new enter();
                        while (enter.number == 12)
                            Thread.sleep(200);
                        if (enter.number == 0)
                            flag = false;
                        break;
                    case 8:
                        System.exit(0);
                        break;
                    case 5:
                        save();
                        JOptionPane.showMessageDialog(new JDialog(),"save done");
                        break;
                    case 6:
                        delete_saved();
                        for (int i = 0; i < country.cities.size(); )
                            country.cities.remove(i);
                        country.population = 0;
                        country.budget = 0;
                        JOptionPane.showMessageDialog(new JDialog(),"delete done");
                        break;

                }
            } catch (invalid_travel | invalid_input | InputMismatchException | InterruptedException re) {
                JOptionPane.showMessageDialog(new JDialog(),re.getMessage());


            }
        } while (true);


    }

    static void city_menu(city city) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        int d = 0;
        if (city.citizens.size() == 0)
            city.setCitizens();
        while (d == 0) {
            country.budget = 0;
            country.population = 0;
            country.bank_budget = 0;
            for (city v : country.cities) {
                country.budget += v.money;
                country.population += v.population;
                for (bank o : v.banks)
                    country.bank_budget += o.money;
            }
            city_menu cityMenu = new city_menu(city);
            while (cityMenu.number == -1)
                Thread.sleep(500);
            int y = cityMenu.number;
            switch (y) {
                case 0:
                    choose_terminal chooseTerminal = new choose_terminal();
                    while (chooseTerminal.number ==0)
                        Thread.sleep(500);
                    int er = chooseTerminal.number;
                    error(er, '4', '1', "your input number is wrong");
                    build_terminal(er, city);
                    break;
                case 1:
                   buy_vehicle buy_vehicle = new buy_vehicle();
                    while (buy_vehicle.number ==0)

                        Thread.sleep(500);
                    int r = buy_vehicle.number;
                    error(r, '6', '1', "your input number is wrong");
                    how_many howMany = new how_many();
                    while (howMany.work == null)
                        Thread.sleep(200);
                    int e = howMany.number;
                    String name =howMany.name;
                    for (int i = 0; i < e; i++)
                        buy_vehicle(r, city,name);
                    break;
                case 2:
                    hire_leader hireLeader = new hire_leader();
                    while (hireLeader.work ==null)
                        Thread.sleep(200);
                    hire_Leader(hireLeader.number, city, hireLeader.name);
                    break;
                case 3:
                   choose_terminal choos = new choose_terminal();
                    while (choos.number==0)
                        Thread.sleep(200);
                    city.terminals_information(choos.number);
                    break;
                case 4:
                    if (city.money >= 700)
                        build_hotel(city);
                    else
                        throw new invalid_money("you don't have enough money");
                    break;
                case 5:
                    build_room(city);
                    break;
                case 6:
                    city.showhotel();
                    break;
                case 7:
                    add_travel(city);
                    break;
                case 8:
                    show_travels(city);
                    break;
                case 9:
                    bank(city);
                    break;
                case 10:
                    d = 67;
                    break;

            }
        }
    }

    static void add_travel(city city) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        choose_terminal chooseTerminal = new choose_terminal();
        while (chooseTerminal.number==0)
            Thread.sleep(200);
        int w = chooseTerminal.number;
        error(w, '4', '1', "your input number is wrong.");
        travel a;
        Vehicle d = null;
        person z = null;
        switch (w) {
            case 1:
                a = new_travel(city, w);
                for (terminal i : city.airport1) {
                    if (i.getTerminal_name().equals(a.Origin_terminal)) {
                        a.travel_cost = i.travel_cost(a.passenger_list, a.vehicle);
                        i.add_travel(a);
                    }
                    city.money = city.money + i.travel_cost(a.passenger_list, a.vehicle);

                    for (Vehicle o : ((airport) i).air_vehicle)
                        if (o.id == a.ID) {
                            d = o;
                            o.terminal_name = a.destination_terminal;
                            ((airport) i).air_vehicle.remove(o);
                            break;
                        }
                    for (person x : i.leader)
                        if (x.name.equals(a.driver)) {
                            z = x;
                            i.leader.remove(x);
                            JOptionPane.showMessageDialog(new JDialog(),"travel done");
                            break;
                        }

                    break;
                }
                for (city c : country.cities)
                    if (c.city_name.equals(a.destination_city))
                        for (terminal i : c.airport1)
                            if (i.getTerminal_name().equals(a.destination_terminal)) {
                                ((airport) i).air_vehicle.add(d);
                                i.leader.add(z);
                                break;
                            }
                break;
            case 2:

                a = new_travel(city, w);
                for (terminal i : city.Bus_terminal1) {
                    if (i.getTerminal_name().equals(a.Origin_terminal)) {
                        a.travel_cost = i.travel_cost(a.passenger_list, a.vehicle);
                        i.add_travel(a);
                    }
                    for (Vehicle o : ((Bus_terminal) i).bus)
                        if (o.id == a.ID) {
                            d = o;
                            o.terminal_name = a.destination_terminal;
                            ((Bus_terminal) i).bus.remove(o);
                            break;
                        }
                    city.money = city.money + i.travel_cost(a.passenger_list, a.vehicle);
                    for (person x : i.leader)
                        if (x.name.equals(a.driver)) {
                            z = x;
                            i.leader.remove(x);
                            JOptionPane.showMessageDialog(new JDialog(),"travel done");
                            break;
                        }
                    break;
                }
                for (city c : country.cities)
                    if (c.city_name.equals(a.destination_city))
                        for (terminal i : c.Bus_terminal1)
                            if (i.getTerminal_name().equals(a.destination_terminal)) {
                                ((Bus_terminal) i).bus.add(d);
                                i.leader.add(z);
                                break;
                            }
                break;
            case 3:

                a = new_travel(city, w);
                for (terminal i : city.shipping_port1) {
                    if (i.getTerminal_name().equals(a.Origin_terminal)) {
                        a.travel_cost = i.travel_cost(a.passenger_list, a.vehicle);
                        i.add_travel(a);
                    }
                    for (Vehicle o : ((shipping_port) i).shipboat)
                        if (o.id == a.ID) {
                            d = o;
                            o.terminal_name = a.destination_terminal;
                            ((shipping_port) i).shipboat.remove(o);
                            break;
                        }
                    city.money = city.money + i.travel_cost(a.passenger_list, a.vehicle);
                    for (person x : i.leader)
                        if (x.name.equals(a.driver)) {
                            z = x;
                            i.leader.remove(x);
                            JOptionPane.showMessageDialog(new JDialog(),"travel done");
                            break;
                        }
                    break;
                }
                for (city c : country.cities)
                    if (c.city_name.equals(a.destination_city))
                        for (terminal i : c.shipping_port1)
                            if (i.getTerminal_name().equals(a.destination_terminal)) {
                                i.leader.add(z);
                                ((shipping_port) i).shipboat.add(d);
                                break;
                            }
                break;
            case 4:

                a = new_travel(city, w);
                for (terminal i : city.train_station1) {
                    if (i.getTerminal_name().equals(a.Origin_terminal)) {
                        a.travel_cost = i.travel_cost(a.passenger_list, a.vehicle);
                        i.add_travel(a);
                    }
                    for (Vehicle o : ((train_station) i).train)
                        if (o.id == a.ID) {
                            d = o;
                            o.terminal_name = a.destination_terminal;
                            ((train_station) i).train.remove(o);
                            break;
                        }
                    city.money = city.money + i.travel_cost(a.passenger_list, a.vehicle);
                    for (person x : i.leader)
                        if (x.name.equals(a.driver)) {
                            z = x;
                            i.leader.remove(x);
                            JOptionPane.showMessageDialog(new JDialog(),"travel done");
                            break;
                        }
                    break;
                }
                for (city c : country.cities)
                    if (c.city_name.equals(a.destination_city))
                        for (terminal i : c.train_station1)
                            if (i.getTerminal_name().equals(a.destination_terminal)) {
                                ((train_station) i).train.add(d);
                                i.leader.add(z);
                                break;
                            }
                break;
        }
    }

    static travel new_travel(city city, int w) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        ArrayList<person> passengers;

        for (person z : city.getCitizens())
            if (z.job.equals("no job"))
            print(z);
        passengers = new ArrayList<>();
        while (true) {
            int h = 0;
            id id = new id();
            while (id.work == null)
                Thread.sleep(200);
            if (id.work.equals("cancel"))
                break;
            for (person z : city.getCitizens())
                if (z.id == id.id) {
                    h = 1;
                    passengers.add(z);
                    break;
                }
            if (h != 1) {
                passengers.removeAll(passengers);
                throw new invalid_id("your input id is not in list.");
            }
        }
       travel1 travel1 = new travel1();
        while (travel1.work==null)
            Thread.sleep(200);
        if (travel1.work.equals("ok")) {
            travel a = new travel(travel1.destination_terminals_name, travel1.origin_terminals_name, travel1.destination_city, passengers, travel1.drivers_name, travel1.vehicles_id, travel1.vehicles_name, travel1.travel_date, city.city_name, w);
            for (city o : country.cities)
                if (o.city_name.equals(a.destination_city)) {
                    o.citizens.addAll(passengers);
                    city.citizens.removeAll(passengers);
                    break;
                }
            return a;
        }
        else
            throw new invalid_travel("you canceled the travel");

    }

    static void build_terminal(int a, city city) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        error(a, '8', '1', "your input number is wrong");
        switch (a) {
            case 1:
                if (city.money >= 1800) {
                    airport1 airport1 = new airport1();
                    while (airport1.work==null)
                        Thread.sleep(200);
                    if (airport1.work.equals("ok")) {
                        airport m = new airport(airport1.type, airport1.number_of_runway, city.city_name, airport1.terminal_name, airport1.address, airport1.area);
                        city.setAirport(m);
                        JOptionPane.showMessageDialog(new JDialog(),"airport built.");
                    }
                } else
                    throw new invalid_money( "your money is not enough.");
                break;
            case 2:
                if (city.money >= 900) {
                    bus_terminal1 bus_terminal1 = new bus_terminal1();
                    while (bus_terminal1.work==null)
                        Thread.sleep(200);
                    if (bus_terminal1.work.equals("ok")) {
                        Bus_terminal z = new Bus_terminal(city.city_name, bus_terminal1.terminal_name, bus_terminal1.address, bus_terminal1.area);
                        city.setBus_terminal1(z);
                        JOptionPane.showMessageDialog(new JDialog(),"bus terminal built.");
                    }
                } else
                    throw new invalid_money( "your money is not enough.");
                break;
            case 3:
                if (city.money >= 1400) {
                    shipping_port1 shipping_port1 = new shipping_port1();
                    while (shipping_port1.work == null)
                        Thread.sleep(200);
                    if (shipping_port1.work.equals("ok")) {
                        shipping_port w = new shipping_port(shipping_port1.number_of_wharf, city.city_name, shipping_port1.terminal_name, shipping_port1.address, shipping_port1.area);
                        city.setShipping_port(w);
                        JOptionPane.showMessageDialog(new JDialog(), "shipping port built.");
                    }
                } else
                    throw new invalid_money( "your money is not enough.");
                break;
            case 4:
                if (city.money >= 1000) {
                    train_station1 train_station1 = new train_station1();
                    while (train_station1.work == null)
                        Thread.sleep(200);
                    if (train_station1.work.equals("ok")) {
                        train_station b = new train_station(train_station1.input, train_station1.output, city.city_name, train_station1.terminal_name, train_station1.address, train_station1.area);
                        city.setTrain_station(b);
                        JOptionPane.showMessageDialog(new JDialog(), "train station built.");
                    }
                } else
                    throw new invalid_money( "your money is not enough.");
                break;
        }
    }

    static void buy_vehicle(int a, city city, String name) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        switch (a) {
            case 1:
                if (city.money >= 600) {
                    airport.trminal_error(name, city.city_name);
                    airliner1 airliner1 = new airliner1();
                    while (airliner1.work==null)
                        Thread.sleep(200);
                    if (airliner1.work.equals("ok")) {
                        airliner e1 = new airliner(airliner1.capacity, airliner1.id, airliner1.company, airliner1.Maximum_flight_altitude, airliner1.Band_length, airliner1.crew, name);
                        city.getAirport(name).setAir_vehicle(e1);
                        JOptionPane.showMessageDialog(new JDialog(),"vehicle bought");
                    }
                } else
                    throw new invalid_money( "your money is not enough.");
                break;
            case 2:
                if (city.money >= 500) {
                    for (terminal y : city.airport1)
                        if (y.getTerminal_name().equals(name)) {
                           cargo_plane1 cargo_plane1 = new cargo_plane1();
                            while (cargo_plane1.work == null)
                                Thread.sleep(200);
                            if (cargo_plane1.work.equals("ok")) {
                                Cargo_plane e2 = new Cargo_plane(cargo_plane1.capacity, cargo_plane1.id, cargo_plane1.company, cargo_plane1.Maximum_flight_altitude, cargo_plane1.Band_length, cargo_plane1.portable_weight, name);
                                city.getAirport(name).setAir_vehicle(e2);
                                JOptionPane.showMessageDialog(new JDialog(), "vehicle bought");
                            }
                        } else
                            throw new invalid_terminal( "this terminal doesn't exist.");
                } else
                    throw new invalid_money("your money is not enough.");
                break;
            case 3:
                if (city.money >= 200) {

                    for (terminal y : city.Bus_terminal1)
                        if (y.getTerminal_name().equals(name)) {
                            bus1 bus1 = new bus1();
                            while (bus1.work==null)
                                Thread.sleep(200);
                            if (bus1.work.equals("ok")) {
                                bus e3 = new bus(bus1.capacity, bus1.id, bus1.company, bus1.type, name, bus1.fuel);
                                city.getBus_terminal1(name).setBus(e3);
                                JOptionPane.showMessageDialog(new JDialog(), "vehicle bought");
                            }
                        } else
                            throw new invalid_terminal( "this terminal doesn't exist.");

                } else {
                    throw new invalid_money( "your money is not enough.");
                }
                break;
            case 4:
                if (city.money >= 200) {
                    for (terminal y : city.shipping_port1)
                        if (y.getTerminal_name().equals(name)) {
                            boat1 boat1 = new boat1();
                            while (boat1.work == null)
                                Thread.sleep(200);
                            if (boat1.work.equals("ok")) {
                                boat e4 = new boat(boat1.capacity, boat1.id, boat1.company, boat1.weight, boat1.type, boat1.fuel, boat1.minimum_depth, name);
                                city.getShipping_port1(name).setShipboat(e4);
                                JOptionPane.showMessageDialog(new JDialog(), "vehicle bought");
                            }
                        } else
                            throw new invalid_terminal( "this terminal doesn't exist.");
                } else
                    throw new invalid_money ("your money is not enough.");
                break;
            case 5:
                if (city.money >= 400) {
                    for (terminal y : city.shipping_port1)
                        if (y.getTerminal_name().equals(name)) {
                            boat1 boat1 = new boat1();
                            while (boat1.work == null)
                                Thread.sleep(200);
                            if (boat1.work.equals("ok")) {
                                ship e5 = new ship(boat1.capacity, boat1.id, boat1.company, boat1.weight, boat1.type, name, boat1.fuel, boat1.minimum_depth);
                                city.getShipping_port1(name).setShipboat(e5);
                                JOptionPane.showMessageDialog(new JDialog(), "vehicle bought");
                            }
                        } else
                            throw new invalid_terminal( "this terminal doesn't exist.");
                } else
                    throw new invalid_money("your money is not enough.");
                break;
            case 6:
                if (city.money >= 300) {

                    for (terminal y : city.train_station1)
                        if (y.getTerminal_name().equals(name)) {
                           train1 train1 = new train1();
                            while (train1.work == null)
                                Thread.sleep(200);
                            if (train1.work.equals("ok")) {
                                train e6 = new train(train1.capacity, train1.id, train1.company, name, train1.fuel, train1.wagons, train1.stars);
                                services1 services1 = new services1();
                                while (services1.number == 0)
                                    Thread.sleep(200);
                                switch (services1.number) {
                                    case 1 -> e6.setServices(train.Services.restaurant);
                                    case 2 -> e6.setServices(train.Services.bed_set);
                                    case 3 -> e6.setServices(train.Services.smoking_room);
                                    case 4 -> e6.setServices(train.Services.hotel);
                                }
                                city.getTrain_station1(name).setTrain(e6);
                                JOptionPane.showMessageDialog(new JDialog(), "vehicle bought");
                            }
                        } else
                            throw new invalid_terminal( "this terminal doesn't exist.");
                } else
                    throw new invalid_money( "your money is not enough.");
                break;
        }
    }

    static void hire_Leader(int a, city city, String name) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        main.error(a, '5', '1', "your input number is wrong.");
        city.showpeople(a);
        id id = new id();
        while (id.work == null)
            Thread.sleep(200);
        if (id.work.equals("ok")) {
            city.setleader(id.id, a, name, city);
        }
    }

    static void build_hotel(city city) throws InterruptedException {

       hotel1 hotel1 = new hotel1();
       while (hotel1.work == null)
           Thread.sleep(200);
       if (hotel1.work.equals("ok")) {
           hotel a = new hotel(city.city_name, hotel1.hotel_name, hotel1.address, hotel1.star, hotel1.number_of_runway);
           services2 services2 = new services2();
           while (services2.number == 0)
               Thread.sleep(200);
           int z = services2.number;
           switch (z) {
               case 1 -> a.setHotel_facilities(hotel.hotel_facilities.breakfast);
               case 2 -> a.setHotel_facilities(hotel.hotel_facilities.food);
               case 3 -> a.setHotel_facilities(hotel.hotel_facilities.pool);
           }
           city.build_Hotel(a);
       }
    }

    static void build_room(city city) throws InterruptedException {
        hotel h = null;
        Scanner sc = new Scanner(System.in);
        terminal_name terminal_name = new terminal_name();
        while (terminal_name.work == null)
            Thread.sleep(200);
        if (terminal_name.work.equals("ok")) {
            String name = terminal_name.name;
            hotel.hotel_error(name, city.city_name);
            for (hotel a : city.hotels)
                if (a.Hotel_name.equals(terminal_name.name)) {
                    h = a;
                    break;
                }
                    room1 room1 = new room1();
                    while (room1.work == null)
                        Thread.sleep(200);
                    if (room1.work.equals("ok")) {
                        room r = new room(room1.rooms_number, room1.number_of_bed, room1.area, name, room1.price, city.city_name);
                        city.build_room(r, name);
                    }

        }
    }

    static void print(person w) {
        JOptionPane.showMessageDialog(new JDialog(),"name: " + w.name +"\n"+ "family name: " + w.family_name +"\n"+"gender: " + w.Gender +
                "\n"+"job: " + w.job +"\n"+"year of birth: " + w.Year_of_Birth +"\n"+"city of birth: " + w.city_of_birth +"\n"+"salary: " + w.salary +"\n"+"id: " + w.id);
    }

    public static void error(Object e, char a, char b, String msg) throws RuntimeException {
        String x = e.toString();
        x = x.toLowerCase();
        for (int i = 0; i < x.length(); i++)
            if (x.charAt(i) > a || x.charAt(i) < b)
                throw new invalid_input(msg);

    }

    public static void city_error(String city_name) {
        int z = 0;
        for (city i : country.cities)
            if (i.city_name.equals(city_name))
                break;
            else
                z++;
        if (z == country.cities.size())
            throw new invalid_city("your city doesn't exist.");
    }

    public static void show_travels(city city) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        choose_terminal chooseTerminal = new choose_terminal();
        while (chooseTerminal.number == 0)
            Thread.sleep(200);
        int y = chooseTerminal.number;
        error(y, '4', '1', "your input number is wrong");
        hotel_name hotel_name = new hotel_name();
        while (hotel_name.work == null)
            Thread.sleep(200);
        if (hotel_name.work.equals("ok")){
        String name = hotel_name.name;
        switch (y) {
            case 1:
                for (terminal i : city.airport1)
                    if (i.terminal_name.equals(name)) {
                        i.travel_history();
                        break;
                    }
                else
                        throw new invalid_terminal("your terminal doesn't exist");
                break;
            case 2:
                for (terminal i : city.Bus_terminal1)
                    if (i.terminal_name.equals(name)) {
                        i.travel_history();
                        break;
                    }
                    else
                        throw new invalid_terminal("your terminal doesn't exist");
                break;
            case 3:
                for (terminal i : city.shipping_port1)
                    if (i.terminal_name.equals(name)) {
                        i.travel_history();
                        break;
                    }
                    else
                        throw new invalid_terminal("your terminal doesn't exist");
                break;
            case 4:
                for (terminal i : city.train_station1)
                    if (i.terminal_name.equals(name)) {
                        i.travel_history();
                        break;
                    }
                    else
                        throw new invalid_terminal("your terminal doesn't exist");
                break;
        }
        }

    }

    public static void save() throws IOException {
        FileWriter fw = new FileWriter("information.txt");
        CSVWriter writer = new CSVWriter(fw);
        String inf[] = new String[12];

        ArrayList<String[]> f = new ArrayList<>();
        for (city a : country.cities) {
            inf[0] = "city";
            inf[1] = a.city_name;
            inf[2] = String.valueOf(a.money);
            inf[3] = String.valueOf(a.population);
            f.add(inf);
            inf = new String[12];
            for (person j : a.citizens) {
                inf[0] = "citizen";
                inf[1] = j.name;
                inf[2] = j.family_name;
                inf[3] = j.job;
                inf[4] = j.Gender;
                inf[5] = j.city_of_birth;
                inf[6] = String.valueOf(j.id);
                inf[7] = String.valueOf(j.salary);
                inf[8] = String.valueOf(j.Year_of_Birth);
                f.add(inf);
                inf = new String[12];
            }

            for (terminal b : a.airport1) {
                airport l;
                l = (airport) b;
                inf[0] = "airport";
                inf[1] = b.city_name;
                inf[2] = b.terminal_name;
                inf[3] = b.address;
                inf[4] = String.valueOf(b.area);
                inf[5] = String.valueOf(b.number_of_vehicles);
                inf[6] = b.city_name;
                inf[7] = String.valueOf(l.type);
                inf[8] = String.valueOf(l.Runway);
                f.add(inf);
                inf = new String[12];
                for (person j : b.leader) {
                    inf[0] = "leader";
                    inf[1] = j.name;
                    inf[2] = j.family_name;
                    inf[3] = j.job;
                    inf[4] = j.Gender;
                    inf[5] = j.city_of_birth;
                    inf[6] = String.valueOf(j.id);
                    inf[7] = String.valueOf(j.salary);
                    inf[8] = String.valueOf(j.Year_of_Birth);
                    f.add(inf);
                    inf = new String[12];
                }
                for (travel j : b.in_travels) {
                    inf[0] = "in_travel";
                    inf[1] = j.destination_city;
                    inf[2] = j.destination_terminal;
                    inf[3] = j.driver;
                    inf[4] = j.Origin_terminal;
                    inf[5] = j.vehicle;
                    inf[6] = j.Origin_city;
                    inf[7] = j.travel_date;
                    inf[8] = String.valueOf(j.ID);
                    inf[9] = String.valueOf(j.travel_cost);
                    inf[10] = String.valueOf(j.w);
                    f.add(inf);
                    inf = new String[12];
                    for (person e : j.passenger_list) {
                        inf[0] = "p_in_travel";
                        inf[1] = e.name;
                        inf[2] = e.family_name;
                        inf[3] = e.job;
                        inf[4] = e.Gender;
                        inf[5] = e.city_of_birth;
                        inf[6] = String.valueOf(e.id);
                        inf[7] = String.valueOf(e.salary);
                        inf[8] = String.valueOf(e.Year_of_Birth);
                        f.add(inf);
                        inf = new String[12];
                    }
                }
                for (travel j : b.out_travels) {
                    inf[0] = "out_travel";
                    inf[1] = j.destination_city;
                    inf[2] = j.destination_terminal;
                    inf[3] = j.driver;
                    inf[4] = j.Origin_terminal;
                    inf[5] = j.vehicle;
                    inf[6] = j.Origin_city;
                    inf[7] = j.travel_date;
                    inf[8] = String.valueOf(j.ID);
                    inf[9] = String.valueOf(j.travel_cost);
                    inf[10] = String.valueOf(j.w);
                    f.add(inf);
                    inf = new String[12];
                    for (person e : j.passenger_list) {
                        inf[0] = "p_out_travel";
                        inf[1] = e.name;
                        inf[2] = e.family_name;
                        inf[3] = e.job;
                        inf[4] = e.Gender;
                        inf[5] = e.city_of_birth;
                        inf[6] = String.valueOf(e.id);
                        inf[7] = String.valueOf(e.salary);
                        inf[8] = String.valueOf(e.Year_of_Birth);
                        f.add(inf);
                        inf = new String[12];
                    }
                }
                for (Vehicle v : ((airport) b).air_vehicle) {
                    if (v.getClass() == airliner.class) {
                        airliner g;
                        g = (airliner) v;
                        inf[0] = "airliner";
                        inf[1] = g.terminal_name;
                        inf[2] = g.company;
                        inf[3] = String.valueOf(g.capacity);
                        inf[4] = String.valueOf(g.id);
                        inf[5] = String.valueOf(g.crew);
                        inf[6] = String.valueOf(g.Band_length);
                        inf[7] = String.valueOf(g.Maximum_flight_altitude);
                        f.add(inf);
                        inf = new String[12];
                    }
                }
                for (Vehicle v : ((airport) b).air_vehicle) {
                    if (v.getClass() == Cargo_plane.class) {
                        Cargo_plane g;
                        g = (Cargo_plane) v;
                        inf[0] = "cargo plane";
                        inf[1] = g.terminal_name;
                        inf[2] = g.company;
                        inf[3] = String.valueOf(v.capacity);
                        inf[4] = String.valueOf(v.id);
                        inf[5] = String.valueOf(g.Portable_weight);
                        inf[6] = String.valueOf(g.Band_length);
                        inf[7] = String.valueOf(g.Maximum_flight_altitude);
                        f.add(inf);
                        inf = new String[12];
                    }
                }
                for (person e : b.crew) {
                    inf[0] = "crew";
                    inf[1] = e.name;
                    inf[2] = e.family_name;
                    inf[3] = e.job;
                    inf[4] = e.Gender;
                    inf[5] = e.city_of_birth;
                    inf[6] = String.valueOf(e.id);
                    inf[7] = String.valueOf(e.salary);
                    inf[8] = String.valueOf(e.Year_of_Birth);
                    f.add(inf);
                    inf = new String[12];
                }
            }
//-------------------------------shipping port--------------------------------------------------------------------------
            for (terminal b : a.shipping_port1) {
                inf[0] = "shipping port";
                inf[1] = b.city_name;
                inf[2] = b.terminal_name;
                inf[3] = b.address;
                inf[4] = String.valueOf(b.area);
                inf[5] = String.valueOf(((shipping_port) b).wharf);
                f.add(inf);
                inf = new String[12];
                for (person j : b.leader) {
                    inf[0] = "leader";
                    inf[1] = j.name;
                    inf[2] = j.family_name;
                    inf[3] = j.job;
                    inf[4] = j.Gender;
                    inf[5] = j.city_of_birth;
                    inf[6] = String.valueOf(j.id);
                    inf[7] = String.valueOf(j.salary);
                    inf[8] = String.valueOf(j.Year_of_Birth);
                    f.add(inf);
                    inf = new String[12];
                }
                for (travel j : b.in_travels) {
                    inf[0] = "in_travel";
                    inf[1] = j.destination_city;
                    inf[2] = j.destination_terminal;
                    inf[3] = j.driver;
                    inf[4] = j.Origin_terminal;
                    inf[5] = j.vehicle;
                    inf[6] = j.Origin_city;
                    inf[7] = j.travel_date;
                    inf[8] = String.valueOf(j.ID);
                    inf[9] = String.valueOf(j.travel_cost);
                    f.add(inf);
                    inf = new String[12];
                    for (person e : j.passenger_list) {
                        inf[0] = "p_in_travel";
                        inf[1] = e.name;
                        inf[2] = e.family_name;
                        inf[3] = e.job;
                        inf[4] = e.Gender;
                        inf[5] = e.city_of_birth;
                        inf[6] = String.valueOf(e.id);
                        inf[7] = String.valueOf(e.salary);
                        inf[8] = String.valueOf(e.Year_of_Birth);
                        f.add(inf);
                        inf = new String[12];
                    }
                }
                for (travel j : b.out_travels) {
                    inf[0] = "out_travel";
                    inf[1] = j.destination_city;
                    inf[2] = j.destination_terminal;
                    inf[3] = j.driver;
                    inf[4] = j.Origin_terminal;
                    inf[5] = j.vehicle;
                    inf[6] = j.Origin_city;
                    inf[7] = j.travel_date;
                    inf[8] = String.valueOf(j.ID);
                    inf[9] = String.valueOf(j.travel_cost);
                    f.add(inf);
                    inf = new String[12];
                    for (person e : j.passenger_list) {
                        inf[0] = "p_out_travel";
                        inf[1] = e.name;
                        inf[2] = e.family_name;
                        inf[3] = e.job;
                        inf[4] = e.Gender;
                        inf[5] = e.city_of_birth;
                        inf[6] = String.valueOf(e.id);
                        inf[7] = String.valueOf(e.salary);
                        inf[8] = String.valueOf(e.Year_of_Birth);
                        f.add(inf);
                        inf = new String[12];
                    }
                }
                for (Vehicle v : ((shipping_port) b).shipboat) {
                    if (v.getClass() == ship.class) {
                        ship g;
                        g = (ship) v;
                        inf[0] = "ship";
                        inf[1] = g.terminal_name;
                        inf[2] = g.company;
                        inf[3] = String.valueOf(g.capacity);
                        inf[4] = String.valueOf(g.id);
                        inf[5] = String.valueOf(g.weight);
                        inf[6] = String.valueOf(g.getFuel());
                        inf[7] = String.valueOf(g.getMinimum_depth());
                        inf[8] = g.type;
                        f.add(inf);
                        inf = new String[12];
                    }
                }
                for (Vehicle v : ((shipping_port) b).shipboat) {
                    if (v.getClass() == boat.class) {
                        boat g;
                        g = (boat) v;
                        inf[0] = "boat";
                        inf[1] = g.terminal_name;
                        inf[2] = g.company;
                        inf[3] = String.valueOf(g.capacity);
                        inf[4] = String.valueOf(g.id);
                        inf[5] = g.type;
                        inf[6] = String.valueOf(g.weight);
                        inf[7] = String.valueOf(g.getFuel());
                        inf[8] = String.valueOf(g.getMinimum_depth());
                        f.add(inf);
                        inf = new String[12];
                    }
                }
                for (person e : b.crew) {
                    inf[0] = "crew";
                    inf[1] = e.name;
                    inf[2] = e.family_name;
                    inf[3] = e.job;
                    inf[4] = e.Gender;
                    inf[5] = e.city_of_birth;
                    inf[6] = String.valueOf(e.id);
                    inf[7] = String.valueOf(e.salary);
                    inf[8] = String.valueOf(e.Year_of_Birth);
                    f.add(inf);
                    inf = new String[12];
                }
            }
//--------------------------------bus terminal--------------------------------------------------------------------------
            for (terminal b : a.Bus_terminal1) {
                inf[0] = "bus terminal";
                inf[1] = b.city_name;
                inf[2] = b.terminal_name;
                inf[3] = b.address;
                inf[4] = String.valueOf(b.area);
                f.add(inf);
                inf = new String[12];
                for (person j : b.leader) {
                    inf[0] = "leader";
                    inf[1] = j.name;
                    inf[2] = j.family_name;
                    inf[3] = j.job;
                    inf[4] = j.Gender;
                    inf[5] = j.city_of_birth;
                    inf[6] = String.valueOf(j.id);
                    inf[7] = String.valueOf(j.salary);
                    inf[8] = String.valueOf(j.Year_of_Birth);
                    f.add(inf);
                    inf = new String[12];
                }
                for (travel j : b.in_travels) {
                    inf[0] = "in_travel";
                    inf[1] = j.destination_city;
                    inf[2] = j.destination_terminal;
                    inf[3] = j.driver;
                    inf[4] = j.Origin_terminal;
                    inf[5] = j.vehicle;
                    inf[6] = j.Origin_city;
                    inf[7] = j.travel_date;
                    inf[8] = String.valueOf(j.ID);
                    inf[9] = String.valueOf(j.travel_cost);
                    f.add(inf);
                    inf = new String[12];
                    for (person e : j.passenger_list) {
                        inf[0] = "p_in_travel";
                        inf[1] = e.name;
                        inf[2] = e.family_name;
                        inf[3] = e.job;
                        inf[4] = e.Gender;
                        inf[5] = e.city_of_birth;
                        inf[6] = String.valueOf(e.id);
                        inf[7] = String.valueOf(e.salary);
                        inf[8] = String.valueOf(e.Year_of_Birth);
                        f.add(inf);
                        inf = new String[12];
                    }
                }
                for (travel j : b.out_travels) {
                    inf[0] = "out_travel";
                    inf[1] = j.destination_city;
                    inf[2] = j.destination_terminal;
                    inf[3] = j.driver;
                    inf[4] = j.Origin_terminal;
                    inf[5] = j.vehicle;
                    inf[6] = j.Origin_city;
                    inf[7] = j.travel_date;
                    inf[8] = String.valueOf(j.ID);
                    inf[9] = String.valueOf(j.travel_cost);
                    f.add(inf);
                    inf = new String[12];
                    for (person e : j.passenger_list) {
                        inf[0] = "p_out_travel";
                        inf[1] = e.name;
                        inf[2] = e.family_name;
                        inf[3] = e.job;
                        inf[4] = e.Gender;
                        inf[5] = e.city_of_birth;
                        inf[6] = String.valueOf(e.id);
                        inf[7] = String.valueOf(e.salary);
                        inf[8] = String.valueOf(e.Year_of_Birth);
                        f.add(inf);
                        inf = new String[12];
                    }
                }
                for (Vehicle v : ((Bus_terminal) b).bus) {
                    bus g;
                    g = (bus) v;
                    inf[0] = "bus";
                    inf[1] = g.terminal_name;
                    inf[2] = g.company;
                    inf[3] = String.valueOf(g.capacity);
                    inf[4] = String.valueOf(g.id);
                    inf[5] = g.type;
                    inf[6] = String.valueOf(g.getFuel());
                    f.add(inf);
                    inf = new String[12];
                }
                for (person e : b.crew) {
                    inf[0] = "crew";
                    inf[1] = e.name;
                    inf[2] = e.family_name;
                    inf[3] = e.job;
                    inf[4] = e.Gender;
                    inf[5] = e.city_of_birth;
                    inf[6] = String.valueOf(e.id);
                    inf[7] = String.valueOf(e.salary);
                    inf[8] = String.valueOf(e.Year_of_Birth);
                    f.add(inf);
                    inf = new String[12];
                }

            }
//------------------------------train station---------------------------------------------------------------------------
            for (terminal b : a.train_station1) {
                train_station l;
                l = (train_station) b;
                inf[0] = "train station";
                inf[1] = l.city_name;
                inf[2] = l.terminal_name;
                inf[3] = l.address;
                inf[4] = String.valueOf(l.area);
                inf[5] = String.valueOf(l.input_rails);
                inf[6] = String.valueOf(l.output_rails);
                f.add(inf);
                inf = new String[12];
                for (person j : b.leader) {
                    inf[0] = "leader";
                    inf[1] = j.name;
                    inf[2] = j.family_name;
                    inf[3] = j.job;
                    inf[4] = j.Gender;
                    inf[5] = j.city_of_birth;
                    inf[6] = String.valueOf(j.id);
                    inf[7] = String.valueOf(j.salary);
                    inf[8] = String.valueOf(j.Year_of_Birth);
                    f.add(inf);
                    inf = new String[12];
                }
                for (travel j : b.in_travels) {
                    inf[0] = "in_travel";
                    inf[1] = j.destination_city;
                    inf[2] = j.destination_terminal;
                    inf[3] = j.driver;
                    inf[4] = j.Origin_terminal;
                    inf[5] = j.vehicle;
                    inf[6] = j.Origin_city;
                    inf[7] = j.travel_date;
                    inf[8] = String.valueOf(j.ID);
                    inf[9] = String.valueOf(j.travel_cost);
                    f.add(inf);
                    inf = new String[12];
                    for (person e : j.passenger_list) {
                        inf[0] = "p_in_travel";
                        inf[1] = e.name;
                        inf[2] = e.family_name;
                        inf[3] = e.job;
                        inf[4] = e.Gender;
                        inf[5] = e.city_of_birth;
                        inf[6] = String.valueOf(e.id);
                        inf[7] = String.valueOf(e.salary);
                        inf[8] = String.valueOf(e.Year_of_Birth);
                        f.add(inf);
                        inf = new String[12];
                    }
                }
                for (travel j : b.out_travels) {
                    inf[0] = "out_travel";
                    inf[1] = j.destination_city;
                    inf[2] = j.destination_terminal;
                    inf[3] = j.driver;
                    inf[4] = j.Origin_terminal;
                    inf[5] = j.vehicle;
                    inf[6] = j.Origin_city;
                    inf[7] = j.travel_date;
                    inf[8] = String.valueOf(j.ID);
                    inf[9] = String.valueOf(j.travel_cost);
                    f.add(inf);
                    inf = new String[12];
                    for (person e : j.passenger_list) {
                        inf[0] = "p_out_travel";
                        inf[1] = e.name;
                        inf[2] = e.family_name;
                        inf[3] = e.job;
                        inf[4] = e.Gender;
                        inf[5] = e.city_of_birth;
                        inf[6] = String.valueOf(e.id);
                        inf[7] = String.valueOf(e.salary);
                        inf[8] = String.valueOf(e.Year_of_Birth);
                        f.add(inf);
                        inf = new String[12];
                    }
                }
                for (Vehicle v : ((train_station) b).train) {
                    train g;
                    g = (train) v;
                    inf[0] = "train";
                    inf[1] = g.terminal_name;
                    inf[2] = g.company;
                    inf[3] = String.valueOf(g.capacity);
                    inf[4] = String.valueOf(g.id);
                    inf[5] = String.valueOf(g.stars);
                    inf[6] = String.valueOf(g.wagons);
                    inf[7] = String.valueOf(g.services.get(0));
                    inf[8] = String.valueOf(g.getFuel());
                    f.add(inf);
                    inf = new String[12];
                }
                for (person e : b.crew) {
                    inf[0] = "crew";
                    inf[1] = e.name;
                    inf[2] = e.family_name;
                    inf[3] = e.job;
                    inf[4] = e.Gender;
                    inf[5] = e.city_of_birth;
                    inf[6] = String.valueOf(e.id);
                    inf[7] = String.valueOf(e.salary);
                    inf[8] = String.valueOf(e.Year_of_Birth);
                    f.add(inf);
                    inf = new String[12];
                }
            }
            for (hotel e : a.hotels) {
                inf[0] = "hotel";
                inf[1] = e.Hotel_name;
                inf[2] = e.city_name;
                inf[3] = e.address;
                inf[4] = String.valueOf(e.hotel_facility.get(0));
                inf[5] = String.valueOf(e.rooms);
                inf[6] = String.valueOf(e.star);
                f.add(inf);
                inf = new String[12];
                for (room g : e.room) {
                    inf[0] = "room";
                    inf[1] = String.valueOf(g.room_number);
                    inf[2] = String.valueOf(g.area);
                    inf[3] = String.valueOf(g.beds);
                    inf[4] = String.valueOf(g.price);
                    f.add(inf);
                    inf = new String[12];
                }
            }
        }
        inf[0] = "country";
        inf[1] = String.valueOf(country.budget);
        inf[2] = String.valueOf(country.population);
        f.add(inf);
        writer.writeAll(f);
        writer.close();
        fw.close();
    }

    public static void load() throws IOException {
        FileReader fr = new FileReader("information.txt");
        CSVReader reader = new CSVReader(fr);
        ArrayList<String[]> s;
        s = (ArrayList<String[]>) reader.readAll();
        city a;
        for (int i = 0; i < s.size(); i++)
            if (s.get(i)[0].equals("city")) {
                a = new city(Integer.parseInt(s.get(i)[2]), s.get(i)[1]);
                country.cities.add(a);
                int oiu = 1;
                while (s.get(i + oiu)[0].equals("citizen")) {
                    person b = new person(s.get(i + oiu)[1], s.get(i + oiu)[2], Integer.parseInt(s.get(i + oiu)[8]), s.get(i + oiu)[5], s.get(i + oiu)[3], s.get(i + oiu)[4], Integer.parseInt(s.get(i + oiu)[7]), Integer.parseInt(s.get(i + oiu)[6]));
                    a.citizens.add(b);
                    oiu++;
                }
            }
        for (int i = 0; i < s.size(); i++) {
            switch (s.get(i)[0]) {
                case "airport":
                    airport b = new airport(Boolean.parseBoolean(s.get(i)[7]), Integer.parseInt(s.get(i)[8]), s.get(i)[1], s.get(i)[2], s.get(i)[3], Integer.parseInt(s.get(i)[4]));
                    for (city g : country.cities)
                        if (b.city_name.equals(g.city_name))
                            g.airport1.add(b);
                    int y = 1;
                    while (s.get(i + y)[0].equals("p_in_travel") || s.get(i + y)[0].equals("p_out_travel") || s.get(i + y)[0].equals("leader") || s.get(i + y)[0].equals("in_travel") || s.get(i + y)[0].equals("out_travel") || s.get(i + y)[0].equals("airliner") || s.get(i + y)[0].equals("cargo plane") || s.get(i + y)[0].equals("crew")) {
                        switch (s.get(i + y)[0]) {
                            case "leader":
                                person j = new person(s.get(i + y)[1], s.get(i + y)[2], Integer.parseInt(s.get(i + y)[8]), s.get(i + y)[5], s.get(i + y)[3], s.get(i + y)[4], Integer.parseInt(s.get(i + y)[7]), Integer.parseInt(s.get(i + y)[6]));
                                b.leader.add(j);
                                break;
                            case "in_travel":
                                ArrayList<person> kl = new ArrayList<>();
                                travel k = new travel(s.get(i + y)[2], s.get(i + y)[4], s.get(i + y)[1], kl, s.get(i + y)[3], Integer.parseInt(s.get(i + y)[8]), s.get(i + y)[5], s.get(i + y)[7], s.get(i + y)[6], Integer.parseInt(s.get(i + y)[9]));
                                int yu = 1;
                                while (s.get(i + y + yu)[0].equals("p_in_travel")) {
                                    person op = new person(s.get(i + y + yu)[1], s.get(i + y + yu)[2], Integer.parseInt(s.get(i + y + yu)[8]), s.get(i + y + yu)[5], s.get(i + y + yu)[3], s.get(i + y + yu)[4], Integer.parseInt(s.get(i + y + yu)[7]), Integer.parseInt(s.get(i + y + yu)[6]));
                                    kl.add(op);
                                    yu++;
                                }
                                k.passenger_list = kl;
                                b.in_travels.add(k);
                                break;
                            case "out_travel":
                                ArrayList<person> we = new ArrayList<>();
                                travel yj = new travel(s.get(i + y)[2], s.get(i + y)[4], s.get(i + y)[1], we, s.get(i + y)[3], Integer.parseInt(s.get(i + y)[8]), s.get(i + y)[5], s.get(i + y)[7], s.get(i + y)[6], Integer.parseInt(s.get(i + y)[9]));
                                yu = 1;
                                while (s.get(i + y + yu)[0].equals("p_out_travel")) {
                                    person op = new person(s.get(i + y + yu)[1], s.get(i + y + yu)[2], Integer.parseInt(s.get(i + y + yu)[8]), s.get(i + y + yu)[5], s.get(i + y + yu)[3], s.get(i + y + yu)[4], Integer.parseInt(s.get(i + y + yu)[7]), Integer.parseInt(s.get(i + y + yu)[6]));
                                    we.add(op);
                                    yu++;
                                }
                                yj.passenger_list = we;
                                b.out_travels.add(yj);
                                break;
                            case "airliner":
                                airliner o = new airliner(Integer.parseInt(s.get(i + y)[3]), Integer.parseInt(s.get(i + y)[4]), s.get(i + y)[2], Integer.parseInt(s.get(i + y)[7]), Integer.parseInt(s.get(i + y)[6]), Integer.parseInt(s.get(i + y)[5]), s.get(i + y)[1]);
                                b.air_vehicle.add(o);
                                break;
                            case "cargo plane":
                                Cargo_plane hj = new Cargo_plane(Integer.parseInt(s.get(i + y)[3]), Integer.parseInt(s.get(i + y)[4]), s.get(i + y)[2], Integer.parseInt(s.get(i + y)[7]), Integer.parseInt(s.get(i + y)[6]), Integer.parseInt(s.get(i + y)[5]), s.get(i + y)[1]);
                                b.air_vehicle.add(hj);
                                break;
                            case "crew":
                                j = new person(s.get(i + y)[1], s.get(i + y)[2], Integer.parseInt(s.get(i + y)[8]), s.get(i + y)[5], s.get(i + y)[3], s.get(i + y)[4], Integer.parseInt(s.get(i + y)[7]), Integer.parseInt(s.get(i + y)[6]));
                                b.crew.add(j);
                                break;
                        }
                        y++;
                    }
                    break;
                case "shipping port":
                    shipping_port z = new shipping_port(Integer.parseInt(s.get(i)[5]), s.get(i)[1], s.get(i)[2], s.get(i)[3], Integer.parseInt(s.get(i)[4]));
                    for (city g : country.cities)
                        if (z.city_name.equals(g.city_name))
                            g.shipping_port1.add(z);
                    y = 1;
                    while (s.get(i + y)[0].equals("p_in_travel") || s.get(i + y)[0].equals("p_out_travel") || s.get(i + y)[0].equals("leader") || s.get(i + y)[0].equals("in_travel") || s.get(i + y)[0].equals("out_travel") || s.get(i + y)[0].equals("ship") || s.get(i + y)[0].equals("boat") || s.get(i + y)[0].equals("crew")) {
                        switch (s.get(i + y)[0]) {
                            case "leader":
                                person j = new person(s.get(i + y)[1], s.get(i + y)[2], Integer.parseInt(s.get(i + y)[8]), s.get(i + y)[5], s.get(i + y)[3], s.get(i + y)[4], Integer.parseInt(s.get(i + y)[7]), Integer.parseInt(s.get(i + y)[6]));
                                z.leader.add(j);
                                break;
                            case "in_travel":
                                ArrayList<person> kl = new ArrayList<>();
                                travel k = new travel(s.get(i + y)[2], s.get(i + y)[4], s.get(i + y)[1], kl, s.get(i + y)[3], Integer.parseInt(s.get(i + y)[8]), s.get(i + y)[5], s.get(i + y)[7], s.get(i + y)[6], Integer.parseInt(s.get(i + y)[9]));
                                int yu = 1;
                                while (s.get(i + y + yu)[0].equals("p_in_travel")) {
                                    person op = new person(s.get(i + y + yu)[1], s.get(i + y + yu)[2], Integer.parseInt(s.get(i + y + yu)[8]), s.get(i + y + yu)[5], s.get(i + y + yu)[3], s.get(i + y + yu)[4], Integer.parseInt(s.get(i + y + yu)[7]), Integer.parseInt(s.get(i + y + yu)[6]));
                                    kl.add(op);
                                    yu++;
                                }
                                k.passenger_list = kl;
                                z.in_travels.add(k);
                                break;
                            case "out_travel":
                                ArrayList<person> we = new ArrayList<>();
                                travel yj = new travel(s.get(i + y)[2], s.get(i + y)[4], s.get(i + y)[1], we, s.get(i + y)[3], Integer.parseInt(s.get(i + y)[8]), s.get(i + y)[5], s.get(i + y)[7], s.get(i + y)[6], Integer.parseInt(s.get(i + y)[9]));
                                yu = 1;
                                while (s.get(i + y + yu)[0].equals("p_out_travel")) {
                                    person op = new person(s.get(i + y + yu)[1], s.get(i + y + yu)[2], Integer.parseInt(s.get(i + y + yu)[8]), s.get(i + y + yu)[5], s.get(i + y + yu)[3], s.get(i + y + yu)[4], Integer.parseInt(s.get(i + y + yu)[7]), Integer.parseInt(s.get(i + y + yu)[6]));
                                    we.add(op);
                                    yu++;
                                }
                                yj.passenger_list = we;
                                z.out_travels.add(yj);
                                break;
                            case "ship":
                                ship po = new ship(Integer.parseInt(s.get(i + y)[3]), Integer.parseInt(s.get(i + y)[4]), s.get(i + y)[2], Integer.parseInt(s.get(i + y)[5]), s.get(i + y)[8], s.get(i + y)[1], Integer.parseInt(s.get(i + y)[6]), Integer.parseInt(s.get(i + y)[7]));
                                z.shipboat.add(po);
                                break;
                            case "boat":
                                boat op = new boat(Integer.parseInt(s.get(i + y)[3]), Integer.parseInt(s.get(i + y)[4]), s.get(i + y)[2], Integer.parseInt(s.get(i + y)[6]), s.get(i + y)[5], Integer.parseInt(s.get(i + y)[7]), Integer.parseInt(s.get(i + y)[8]), s.get(i + y)[1]);
                                z.shipboat.add(op);
                                break;
                            case "crew":
                                j = new person(s.get(i + y)[1], s.get(i + y)[2], Integer.parseInt(s.get(i + y)[8]), s.get(i + y)[5], s.get(i + y)[3], s.get(i + y)[4], Integer.parseInt(s.get(i + y)[7]), Integer.parseInt(s.get(i + y)[6]));
                                z.crew.add(j);
                                break;
                        }
                        y++;
                    }
                    break;
                case "bus terminal":
                    Bus_terminal h = new Bus_terminal(s.get(i)[1], s.get(i)[2], s.get(i)[3], Integer.parseInt(s.get(i)[4]));
                    for (city g : country.cities)
                        if (h.city_name.equals(g.city_name))
                            g.Bus_terminal1.add(h);
                    y = 1;
                    while (s.get(i + y)[0].equals("p_in_travel") || s.get(i + y)[0].equals("p_out_travel") || s.get(i + y)[0].equals("leader") || s.get(i + y)[0].equals("in_travel") || s.get(i + y)[0].equals("out_travel") || s.get(i + y)[0].equals("bus") || s.get(i + y)[0].equals("crew")) {
                        switch (s.get(i + y)[0]) {
                            case "leader":
                                person j = new person(s.get(i + y)[1], s.get(i + y)[2], Integer.parseInt(s.get(i + y)[8]), s.get(i + y)[5], s.get(i + y)[3], s.get(i + y)[4], Integer.parseInt(s.get(i + y)[7]), Integer.parseInt(s.get(i + y)[6]));
                                h.leader.add(j);
                                break;
                            case "in_travel":
                                ArrayList<person> kl = new ArrayList<>();
                                travel k = new travel(s.get(i + y)[2], s.get(i + y)[4], s.get(i + y)[1], kl, s.get(i + y)[3], Integer.parseInt(s.get(i + y)[8]), s.get(i + y)[5], s.get(i + y)[7], s.get(i + y)[6], Integer.parseInt(s.get(i + y)[9]));
                                int yu = 1;
                                while (s.get(i + y + yu)[0].equals("p_in_travel")) {
                                    person op = new person(s.get(i + y + yu)[1], s.get(i + y + yu)[2], Integer.parseInt(s.get(i + y + yu)[8]), s.get(i + y + yu)[5], s.get(i + y + yu)[3], s.get(i + y + yu)[4], Integer.parseInt(s.get(i + y + yu)[7]), Integer.parseInt(s.get(i + y + yu)[6]));
                                    kl.add(op);
                                    yu++;
                                }
                                k.passenger_list = kl;
                                h.in_travels.add(k);
                                break;
                            case "out_travel":
                                ArrayList<person> we = new ArrayList<>();
                                travel yj = new travel(s.get(i + y)[2], s.get(i + y)[4], s.get(i + y)[1], we, s.get(i + y)[3], Integer.parseInt(s.get(i + y)[8]), s.get(i + y)[5], s.get(i + y)[7], s.get(i + y)[6], Integer.parseInt(s.get(i + y)[9]));
                                yu = 1;
                                while (s.get(i + y + yu)[0].equals("p_out_travel")) {
                                    person op = new person(s.get(i + y + yu)[1], s.get(i + y + yu)[2], Integer.parseInt(s.get(i + y + yu)[8]), s.get(i + y + yu)[5], s.get(i + y + yu)[3], s.get(i + y + yu)[4], Integer.parseInt(s.get(i + y + yu)[7]), Integer.parseInt(s.get(i + y + yu)[6]));
                                    we.add(op);
                                    yu++;
                                }
                                yj.passenger_list = we;
                                h.out_travels.add(yj);
                                break;

                            case "bus":
                                bus hj = new bus(Integer.parseInt(s.get(i + y)[3]), Integer.parseInt(s.get(i + y)[4]), s.get(i + y)[2], s.get(i + y)[5], s.get(i + y)[1], Integer.parseInt(s.get(i + y)[6]));
                                h.bus.add(hj);
                                break;
                            case "crew":
                                j = new person(s.get(i + y)[1], s.get(i + y)[2], Integer.parseInt(s.get(i + y)[8]), s.get(i + y)[5], s.get(i + y)[3], s.get(i + y)[4], Integer.parseInt(s.get(i + y)[7]), Integer.parseInt(s.get(i + y)[6]));
                                h.crew.add(j);
                                break;
                        }
                        y++;
                    }
                    break;
                case "train station":
                    train_station l = new train_station(Integer.parseInt(s.get(i)[5]), Integer.parseInt(s.get(i)[6]), s.get(i)[1], s.get(i)[2], s.get(i)[3], Integer.parseInt(s.get(i)[4]));
                    for (city g : country.cities)
                        if (l.city_name.equals(g.city_name))
                            g.train_station1.add(l);
                    y = 1;
                    while (s.get(i + y)[0].equals("p_in_travel") || s.get(i + y)[0].equals("p_out_travel") || s.get(i + y)[0].equals("leader") || s.get(i + y)[0].equals("in_travel") || s.get(i + y)[0].equals("out_travel") || s.get(i + y)[0].equals("train") || s.get(i + y)[0].equals("crew")) {
                        switch (s.get(i + y)[0]) {
                            case "leader":
                                person j = new person(s.get(i + y)[1], s.get(i + y)[2], Integer.parseInt(s.get(i + y)[8]), s.get(i + y)[5], s.get(i + y)[3], s.get(i + y)[4], Integer.parseInt(s.get(i + y)[7]), Integer.parseInt(s.get(i + y)[6]));
                                l.leader.add(j);
                                break;
                            case "in_travel":
                                ArrayList<person> kl = new ArrayList<>();
                                travel k = new travel(s.get(i + y)[2], s.get(i + y)[4], s.get(i + y)[1], kl, s.get(i + y)[3], Integer.parseInt(s.get(i + y)[8]), s.get(i + y)[5], s.get(i + y)[7], s.get(i + y)[6], Integer.parseInt(s.get(i + y)[9]));
                                int yu = 1;
                                while (s.get(i + y + yu)[0].equals("p_in_travel")) {
                                    person op = new person(s.get(i + y + yu)[1], s.get(i + y + yu)[2], Integer.parseInt(s.get(i + y + yu)[8]), s.get(i + y + yu)[5], s.get(i + y + yu)[3], s.get(i + y + yu)[4], Integer.parseInt(s.get(i + y + yu)[7]), Integer.parseInt(s.get(i + y + yu)[6]));
                                    kl.add(op);
                                    yu++;
                                }
                                k.passenger_list = kl;
                                l.in_travels.add(k);
                                break;
                            case "out_travel":
                                ArrayList<person> we = new ArrayList<>();
                                travel yj = new travel(s.get(i + y)[2], s.get(i + y)[4], s.get(i + y)[1], we, s.get(i + y)[3], Integer.parseInt(s.get(i + y)[8]), s.get(i + y)[5], s.get(i + y)[7], s.get(i + y)[6], Integer.parseInt(s.get(i + y)[9]));
                                yu = 1;
                                while (s.get(i + y + yu)[0].equals("p_out_travel")) {
                                    person op = new person(s.get(i + y + yu)[1], s.get(i + y + yu)[2], Integer.parseInt(s.get(i + y + yu)[8]), s.get(i + y + yu)[5], s.get(i + y + yu)[3], s.get(i + y + yu)[4], Integer.parseInt(s.get(i + y + yu)[7]), Integer.parseInt(s.get(i + y + yu)[6]));
                                    we.add(op);
                                    yu++;
                                }
                                yj.passenger_list = we;
                                l.out_travels.add(yj);
                                break;
                            case "train":
                                train ko = new train(Integer.parseInt(s.get(i + y)[3]), Integer.parseInt(s.get(i + y)[4]), s.get(i + y)[2], s.get(i + y)[1], Integer.parseInt(s.get(i + y)[8]), Integer.parseInt(s.get(i + y)[6]), Integer.parseInt(s.get(i + y)[5]));
                                ko.services.add(train.Services.valueOf(s.get(i + y)[7]));
                                l.train.add(ko);
                                break;
                            case "crew":
                                j = new person(s.get(i + y)[1], s.get(i + y)[2], Integer.parseInt(s.get(i + y)[8]), s.get(i + y)[5], s.get(i + y)[3], s.get(i + y)[4], Integer.parseInt(s.get(i + y)[7]), Integer.parseInt(s.get(i + y)[6]));
                                l.crew.add(j);
                                break;
                        }
                        y++;
                    }

                    break;
                case "hotel":
                    hotel r = new hotel(s.get(i)[2], s.get(i)[1], s.get(i)[3], Integer.parseInt(s.get(i)[6]), Integer.parseInt(s.get(i)[5]));
                    r.hotel_facility.add(hotel.hotel_facilities.valueOf(s.get(i)[4]));
                    for (city g : country.cities)
                        if (r.city_name.equals(g.city_name))
                            g.hotels.add(r);
                    break;
            }
        }
        fr.close();
        reader.close();
    }

    public static void delete_saved() throws IOException {
        FileWriter fw = new FileWriter("information.txt");
        CSVWriter writer = new CSVWriter(fw);
        ArrayList<String[]> f = new ArrayList<>();
        writer.writeAll(f);
        writer.close();
        fw.close();

    }

    public static void bank(city city) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        bank1 bank1 = new bank1();
        while (bank1.number == 0)
            Thread.sleep(200);
        switch (bank1.number) {
            case 1:
                bank_name bank_name = new bank_name();
                while (bank_name.work == null)
                    Thread.sleep(200);
                if (bank_name.work.equals("ok")) {
                    bank a = new bank(bank_name.name);
                    city.banks.add(a);
                    JOptionPane.showMessageDialog(new JDialog(),"bank built");
                }
                break;
            case 2:
                int i = 1;
                enter_bank enter_bank = new enter_bank();
                for (bank h : city.banks)
                    JOptionPane.showMessageDialog(new JDialog(),i++ + "." + h.bank_name);
                while (enter_bank.work == null)
                    Thread.sleep(200);
                String name = enter_bank.name;
                for (bank h : city.banks)
                    if (h.bank_name.equals(name)) {
                        enter_bank(city, h);
                        break;
                    }
                else
                    throw new invalid_terminal("your bank doesn't exist");
                break;
        }
    }

    public static void enter_bank(city city, bank bank) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        bank_menu bank_menu = new bank_menu();
        while (bank_menu.number==0)
            Thread.sleep(200);
        switch (bank_menu.number) {
            case 1:
                for (person o : city.citizens)
                    print(o);
                new_account new_account = new new_account();
                while (new_account.work == null)
                    Thread.sleep(200);
                if (new_account.work.equals("ok")) {
                    int id = new_account.id;
                    for (person j : city.citizens)
                        if (id == j.id) {
                            bank_account a = new bank_account(new_account.initial_money, new_account.user_name, new_account.password, j, bank.bank_name);
                            bank.money += a.balance;
                            Thread t1 = new Thread(a);
                            t1.start();
                            bank.accounts.add(a);
                            JOptionPane.showMessageDialog(new JDialog(),"account built");
                            break;
                        }
                }else
                    throw new invalid_id("your input id is wrong.");
                break;
            case 2:
                bank_account p = null;
                enter_account enter_account = new enter_account();
                while (enter_account.work == null)
                    Thread.sleep(200);
                if (enter_account.work.equals("ok")) {
                    String user_name =enter_account.user_name;
                    int password = enter_account.password;
                    int i = 0;
                    for (bank_account l : bank.accounts)
                        if (l.user_name.equals(user_name) && l.password == password) {
                            p = l;
                            i = 1;
                            break;
                        }
                    if (i == 0)
                        throw new invalid_input("there is no account with this user name and password.");
                }
                account_menu account_menu = new account_menu();
                while (account_menu.number == 0)
                    Thread.sleep(200);
                switch (account_menu.number) {
                    case 1:
                        int money;
                        transaction a;
                        withdraw withdraw = new withdraw();
                        while (withdraw.work == null)
                            Thread.sleep(200);
                        if (withdraw.work.equals("ok")) {
                            money = withdraw.money;
                            p.balance -= money;
                            a = new transaction((-1) * money, "withdraw");
                            p.transactions.add(a);
                            JOptionPane.showMessageDialog(new JDialog(),"withdraw done");
                        }
                        break;
                    case 2:
                        deposit deposit = new deposit();
                        while (deposit.work == null)
                            Thread.sleep(200);
                        if (deposit.work.equals("ok")) {
                            money = deposit.money;
                            p.balance += money;
                            a = new transaction(money, "deposit");
                            p.transactions.add(a);
                            JOptionPane.showMessageDialog(new JDialog(), "deposit done");
                        }
                        break;
                    case 3:

                        for (transaction o : p.transactions)
                            JOptionPane.showMessageDialog(new JDialog(),   "money: " + o.money + "\n" + "time: " + o.time + "\n" + "type: " + o.type);

                        break;
                }
                break;
            case 3:
                JOptionPane.showMessageDialog(new JDialog(), "name: " + bank.bank_name + "\nmoney: " + bank.money + "\nactive accounts: " + bank.active_accounts);
                break;
        }
    }
}


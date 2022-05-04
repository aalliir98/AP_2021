package main.Vehicles;
import main.Buildings.terminal;
import main.city;
import main.country;
import main.exception.invalid_terminal;
import main.person;

public abstract class Vehicle {

    public int capacity;
    public int id;
    public String company;
    public String terminal_name;

    public Vehicle(int capacity, int id, String company, String terminal_name) {
        this.terminal_name = terminal_name;
        this.capacity = capacity;
        this.id = id;
        this.company = company;
        main.main.error(capacity,'9','0',"your input capacity is wrong.");
        main.main.error(id,'9','0',"your input id is wrong.");
        trminal_error(terminal_name);

    }
    public static void trminal_error(String terminal_name) {
        for (city i : country.cities)
                for (terminal a : i.airport1)
                    if (a.terminal_name.equals(terminal_name))
                        if (!i.city_name.equals(a.city_name))
                        throw new invalid_terminal("\u001B[31m"+"your terminal doesn't exist.");
    }

    public int getCapacity() {
        return capacity;
    }

    public int getId() {
        return id;
    }

    public String getCompany() {
        return company;
    }
}




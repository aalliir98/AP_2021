package main.Vehicles;

import main.Buildings.terminal;
import main.city;
import main.country;

import java.util.ArrayList;

public class train extends land_vehicle{

    public train(int capacity, int id, String company,String terminal_name,int fuel, int wagons, int stars) {
        super(capacity, id, company,fuel,terminal_name);
        this.wagons = wagons;
        this.stars = stars;
        for (city i : country.cities)
            for (terminal j : i.airport1)
                if (this.terminal_name.equals(j.terminal_name)) {
                    i.money = i.money - 300;
                    break;
                }
        main.main.error(fuel,'9','0',"your input fuel is wrong.");
    }

    public enum  Services {
        restaurant,bed_set,smoking_room,hotel
    }
    public int wagons;
    public int stars;

    @Override
    public int getFuel() {
        return super.getFuel();
    }

    public ArrayList<Services> services = new ArrayList<>();

    public void setServices(Services a) {
        this.services.add(a);
    }
}

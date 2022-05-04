package main.Vehicles;

import main.Buildings.terminal;
import main.city;
import main.country;

public class bus extends land_vehicle{

   public String type;


    public bus(int capacity, int id, String company, String type, String terminal_name, int fuel) {
        super(capacity, id, company,fuel,terminal_name);
        this.type = type;
        for (city i : country.cities)
            for (terminal j : i.Bus_terminal1)
                if (this.terminal_name.equals(j.terminal_name)) {
                    i.money = i.money - 200;
                break;
                }
        main.main.error(fuel,'9','0',"your input fuel is wrong.");
    }

    @Override
    public int getFuel() {
        return super.getFuel();
    }
}

package main.Vehicles;

import main.Buildings.terminal;
import main.city;
import main.country;

public class boat extends sea_vehicle {
    public int weight;
    public String type;

    public boat(int capacity, int id, String company, int weight, String type, int fuel, int minimum_depth, String terminal_name) {
        super(capacity, id, company, fuel, minimum_depth, terminal_name);
        this.weight = weight;
        this.type = type;
        for (city i : country.cities)
            for (terminal j : i.shipping_port1)
                if (this.terminal_name.equals(j.terminal_name)) {
                    i.money = i.money - 200;
                    break;
                }
        main.main.error(weight,'9','0',"your input weight is wrong.");
        main.main.error(fuel,'9','0',"your input fuel is wrong.");
        main.main.error(minimum_depth,'9','0',"your input minimum depth is wrong.");
    }

    @Override
    public int getMinimum_depth() {
        return super.getMinimum_depth();
    }
}

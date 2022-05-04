package main.Vehicles;

public abstract class land_vehicle extends Vehicle {
    int fuel;

    public land_vehicle(int capacity, int id, String company, int fuel,String terminal_name) {
        super(capacity, id, company,terminal_name);
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }
}

package main.Vehicles;

public abstract class sea_vehicle  extends Vehicle{
    int fuel;
    int minimum_depth;

    public sea_vehicle( int capacity, int id, String company, int fuel, int minimum_depth, String terminal_name) {
        super(capacity, id, company, terminal_name);
        this.fuel = fuel;
        this.minimum_depth = minimum_depth;
    }

    public int getMinimum_depth() {
        return minimum_depth;
    }

    public int getFuel() {
        return fuel;
    }
}

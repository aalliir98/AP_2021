package main.Vehicles;

public abstract class air_vehicle extends Vehicle {
    public int Maximum_flight_altitude;
    public int Band_length;


    public air_vehicle(int capacity, int id, String company, int maximum_flight_altitude, int band_length, String terminal_name) {
        super(capacity, id, company,terminal_name);
        Maximum_flight_altitude = maximum_flight_altitude;
        Band_length = band_length;
    }

}

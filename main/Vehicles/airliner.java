package main.Vehicles;

import main.Buildings.terminal;
import main.city;
import main.country;

public class airliner extends air_vehicle {
    public int crew;

    public airliner(int capacity, int id, String company, int maximum_flight_altitude, int band_length, int crew, String terminal_name) {
        super(capacity, id, company, maximum_flight_altitude, band_length, terminal_name);
        this.crew = crew;

        for (city i : country.cities)
            for (terminal j : i.airport1)
                if (this.terminal_name.equals(j.terminal_name)) {
                    i.money = i.money - 600;
                    break;
                }
        main.main.error(maximum_flight_altitude, '9', '0', "your input maximum flight altitude is wrong.");
        main.main.error(band_length, '9', '0', "your input band length is wrong.");
        main.main.error(crew, '9', '0', "your input crew is wrong.");
    }
}

